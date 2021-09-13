package com.stackroute.datamunger.query.parser;

import com.stackroute.datamunger.query.Query;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class QueryParser {

    private QueryParameter queryParameter = new QueryParameter();


    /*
     * This method will parse the queryString and will return the object of
     * QueryParameter class
     */
    public QueryParameter parseQuery(String queryString) {
        queryParameter.setFileName(getFileName(queryString));
        queryParameter.setBaseQuery(getBaseQuery(queryString));
        queryParameter.setOrderByFields(getOrderByFields(queryString));
        queryParameter.setGroupByFields(getGroupByFields(queryString));
        queryParameter.setLogicalOperators(getLogicalOperators(queryString));
        queryParameter.setFields(getFields(queryString));
        queryParameter.setAggregateFunctions(getAggregateFunctions(queryString));
        queryParameter.setRestrictions(getRestrictionFunctions(queryString));
        return queryParameter;
    }

    /*
     * extract the name of the file from the query. File name can be found after the
     * "from" clause.
     */
    public String getFileName(String queryString) {
        String queryLowerCase = queryString.toLowerCase();
        String[] queryFrom = queryLowerCase.split("from");
        String[] querySpace = queryFrom[1].split(" ");
        String queryFinal = querySpace[1];
        return queryFinal;
    }

    public String getBaseQuery(String queryString) {

        if (queryString.contains("where")) {
            String[] splitWhere = queryString.split(" where");
            return splitWhere[0];
        } else if (queryString.contains("group by")) {
            String[] splitGroup = queryString.split(" group by");
            return splitGroup[0];
        } else if (queryString.contains("order by")) {
            String[] splitOrder = queryString.split(" order by");
            return splitOrder[0];
        } else if (queryString.contains("group by") && queryString.contains("order by")) {
            String[] splitGroup = queryString.split(" group by");
            return splitGroup[0];
        }

        return queryString;
    }

    /*
     * extract the order by fields from the query string. Please note that we will
     * need to extract the field(s) after "order by" clause in the query, if at all
     * the order by clause exists. For eg: select city,winner,team1,team2 from
     * data/ipl.csv order by city from the query mentioned above, we need to extract
     * "city". Please note that we can have more than one order by fields.
     */
    public ArrayList<String> getOrderByFields(String queryString) {
        //String queryLower = queryString.toLowerCase();
        ArrayList<String> listOrderBy = new ArrayList<>();
        if (queryString.contains("order by")) {
            String[] splitOrderBy = queryString.split("order by");
            String[] splitAnswer = new String[1];
            splitAnswer[0] = splitOrderBy[1].trim();
            for (String values : splitAnswer) {
                listOrderBy.add(values);
            }
            return listOrderBy;
        }
        return null;
    }

    /*
     * extract the group by fields from the query string. Please note that we will
     * need to extract the field(s) after "group by" clause in the query, if at all
     * the group by clause exists. For eg: select city,max(win_by_runs) from
     * data/ipl.csv group by city from the query mentioned above, we need to extract
     * "city". Please note that we can have more than one group by fields.
     */
    public List<String> getGroupByFields(String queryString) {
        //String queryLower = queryString.toLowerCase();
        String conditionQuery[] = queryString.toLowerCase().split(" from ");

        int countGroupBy = conditionQuery[1].trim().indexOf(" group by ");
        //	System.out.println(conditionQuery[1].trim());

        if (countGroupBy == -1)
            return null;
        String splitedCondition[] = conditionQuery[1].trim().split(" group by ");

        String splitOrderBy[] = splitedCondition[1].trim().split(" order by ");

        String groupByFields[] = splitOrderBy[0].trim().split(",");

        List<String> splitLst = new ArrayList<>();
        for (int i = 0; i < groupByFields.length; i++) {
            splitLst.add(groupByFields[i].trim());
        }
        return splitLst;
    }

    /*
     * extract the selected fields from the query string. Please note that we will
     * need to extract the field(s) after "select" clause followed by a space from
     * the query string. For eg: select city,win_by_runs from data/ipl.csv from the
     * query mentioned above, we need to extract "city" and "win_by_runs". Please
     * note that we might have a field containing name "from_date" or "from_hrs".
     * Hence, consider this while parsing.
     */
    public ArrayList<String> getFields(String queryString) {
        ArrayList<String> listFields = new ArrayList<>();
        String queryLower = queryString.toLowerCase();
        if (queryString.contains("*")) {
            listFields.add("*");
            return listFields;
        }
        String[] splitFrom = queryLower.split(" from ");
        String[] splitSelect = splitFrom[0].split("select "); //city, winner, team1,team2
        splitSelect[1].replaceAll(" ", "");
        //	System.out.println(splitSelect[1]);
        String[] splitAns = splitSelect[1].trim().split(",");
        for (String values : splitAns) {
            listFields.add(values.trim());
        }
        return listFields;
    }


    /*
     * extract the conditions from the query string(if exists). for each condition,
     * we need to capture the following:
     * 1. Name of field
     * 2. condition
     * 3. value
     *
     * For eg: select city,winner,team1,team2,player_of_match from data/ipl.csv
     * where season >= 2008 or toss_decision != bat
     *
     * here, for the first condition, "season>=2008" we need to capture:
     * 1. Name of field: season
     * 2. condition: >=
     * 3. value: 2008
     *
     * the query might contain multiple conditions separated by OR/AND operators.
     * Please consider this while parsing the conditions.
     *
     */
    public List<Restriction> getRestrictionFunctions(String queryString) {
        String queryWhere[] = queryString.trim().split("where");

        if (queryWhere.length == 1) {
            return null;
        }

        String queryOrderGroupBy[] = queryWhere[1].trim().split("order by|group by");
        String queryAndOr[] = queryOrderGroupBy[0].trim().split(" and | or ");
        List<Restriction> restrictionList = new ArrayList<>();
        for (String string : queryAndOr) {
            String condition = "";
            if (string.contains(">=")) {
                condition = ">=";
            } else if (string.contains("<=")) {
                condition = "<=";
            } else if (string.contains("!=")) {
                condition = "!=";
            } else if (string.contains(">")) {
                condition = ">";
            } else if (string.contains("<")) {
                condition = "<";
            } else if (string.contains("=")) {
                condition = "=";
            }
            String propertyName = string.split(condition)[0].trim();
            String propertyValue = string.split(condition)[1].trim().replaceAll("'", "");
            Restriction restrictionInstance = new Restriction(propertyName, propertyValue, condition);
            restrictionList.add(restrictionInstance);
        }
        return restrictionList;
    }

    /*
     * extract the logical operators(AND/OR) from the query, if at all it is
     * present. For eg: select city,winner,team1,team2,player_of_match from
     * data/ipl.csv where season >= 2008 or toss_decision != bat and city =
     * bangalore
     *
     * the query mentioned above in the example should return a List of Strings
     * containing [or,and]
     */
    public List<String> getLogicalOperators(String queryString) {
        String[] splitSpace = queryString.split(" ");
        ArrayList<String> listLogicalOperators = new ArrayList<>();
        if (queryString.contains("where ")) {
            if (queryString.contains(" and ") || queryString.contains(" or ") || queryString.contains(" not ")) {
                for (String values : splitSpace) {
                    if (values.equals("and")) listLogicalOperators.add(values);
                    if (values.equals("or")) listLogicalOperators.add(values);
                    if (values.equals("not")) listLogicalOperators.add(values);
                }
                return listLogicalOperators;
            }
        }
        return null;

    }

    /*
     * extract the aggregate functions from the query. The presence of the aggregate
     * functions can determined if we have either "min" or "max" or "sum" or "count"
     * or "avg" followed by opening braces"(" after "select" clause in the query
     * string. in case it is present, then we will have to extract the same. For
     * each aggregate functions, we need to know the following:
     * 1. type of aggregate function(min/max/count/sum/avg)
     * 2. field on which the aggregate function is being applied
     *
     * Please note that more than one aggregate function can be present in a query
     *
     *
     */
    public List<AggregateFunction> getAggregateFunctions(String queryString) {
        List<AggregateFunction> listAggregate = new ArrayList<AggregateFunction>();
        queryString = queryString.toLowerCase(Locale.ROOT);
        String[] querySelect = queryString.split("select ");
        String[] queryFrom = querySelect[1].split(" from");
        String[] queryAgggregate = queryFrom[0].split(",");
        for (int i = 0; i < queryAgggregate.length; i++) {
            if (queryAgggregate[i].startsWith("max(") || queryAgggregate[i].startsWith("min(") || queryAgggregate[i].startsWith("avg(") || queryAgggregate[i].startsWith("sum")) {
                listAggregate.add(new AggregateFunction(queryAgggregate[i].substring(4, queryAgggregate[i].length() - 1), queryAgggregate[i].substring(0, 3)));
            } else if (queryAgggregate[i].startsWith("count(")) {
                listAggregate.add(new AggregateFunction(queryAgggregate[i].substring(6, queryAgggregate[i].length() - 1), queryAgggregate[i].substring(0, 5)));
            }

        }
        return listAggregate;
    }
}
