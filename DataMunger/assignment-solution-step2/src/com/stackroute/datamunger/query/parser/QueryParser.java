package com.stackroute.datamunger.query.parser;

/*There are total 4 DataMungerTest file:
 *
 * 1)DataMungerTestTask1.java file is for testing following 4 methods
 * a)getBaseQuery()  b)getFileName()  c)getOrderByClause()  d)getGroupByFields()
 *
 * Once you implement the above 4 methods,run DataMungerTestTask1.java
 *
 * 2)DataMungerTestTask2.java file is for testing following 2 methods
 * a)getFields() b) getAggregateFunctions()
 *
 * Once you implement the above 2 methods,run DataMungerTestTask2.java
 *
 * 3)DataMungerTestTask3.java file is for testing following 2 methods
 * a)getRestrictions()  b)getLogicalOperators()
 *
 * Once you implement the above 2 methods,run DataMungerTestTask3.java
 *
 * Once you implement all the methods run DataMungerTest.java.This test case consist of all
 * the test cases together.
 */

import java.lang.reflect.Array;
import java.util.*;

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
     * Extract the name of the file from the query. File name can be found after the
     * "from" clause.
     */
    public String getFileName(String queryString) {
        String queryLowerCase = queryString.toLowerCase();
        String[] queryFrom = queryLowerCase.split("from");
        String[] querySpace = queryFrom[1].split(" ");
        String queryFinal = querySpace[1];
        return queryFinal;
    }

    /*
     *
     * Extract the baseQuery from the query.This method is used to extract the
     * baseQuery from the query string. BaseQuery contains from the beginning of the
     * query till the where clause
     */

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
     * Extract the group by fields from the query string. Please note that we will
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
     * Extract the selected fields from the query string. Please note that we will
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
        String[] splitSelect = splitFrom[0].split("select ");
        splitSelect[1].replaceAll(" ", "");
        String[] splitAns = splitSelect[1].split(",");
        for (String values : splitAns) {
            listFields.add(values);
        }
        return listFields;
    }


    /*
     * Extract the conditions from the query string(if exists). for each condition,
     * we need to capture the following: 1. Name of field 2. condition 3. value
     *
     * For eg: select city,winner,team1,team2,player_of_match from data/ipl.csv
     * where season >= 2008 or toss_decision != bat
     *
     * here, for the first condition, "season>=2008" we need to capture: 1. Name of
     * field: season 2. condition: >= 3. value: 2008
     *
     * the query might contain multiple conditions separated by OR/AND operators.
     * Please consider this while parsing the conditions.
     *
     */

    /*
    public String getConditionsPartQuery(String queryString) {
        List<Restriction> getCondition = null;
        String[] queryWhere;
        String[] queryCondition;
        String tempString;
        if (queryString.contains("where")) {
            getCondition = new ArrayList<Restriction>();
            queryWhere = queryString.trim().split("where ");
            if (queryWhere[1].contains("group by")) {
                queryCondition = queryWhere[1].trim().split("group by");
                tempString = queryCondition[0];
            } else if (queryWhere[1].contains("order by")) {
                queryCondition = queryWhere[1].trim().split("order by");
                tempString = queryCondition[0];
            } else {
                tempString = queryWhere[1];
            }
        }
        return null;
    }

     */

    public List<Restriction> getRestrictionFunctions(String queryString) {
        List<Restriction> getConditionsList = null;
        String[] queryWhere;
        String[] queryCondition;
        String tempString;
        String[] getCondition = null;
        if (queryString.contains("where")) {
            getConditionsList = new ArrayList<Restriction>();
            queryWhere = queryString.trim().split("where ");
            if (queryWhere[1].contains("group by")) {
                queryCondition = queryWhere[1].trim().split("group by");
                tempString = queryCondition[0];
            } else if (queryWhere[1].contains("order by")) {
                queryCondition = queryWhere[1].trim().split("order by");
                tempString = queryCondition[0];
            } else {
                tempString = queryWhere[1];
            }
            getCondition = tempString.trim().split(" and | or ");
            String[] splitRestriction = null;
            if (getCondition != null) {
                for (int i = 0; i < getCondition.length; i++) {
                    if (getCondition[i].contains("=")) {
                        splitRestriction = getCondition[i].trim().split("\\W+");
                        getConditionsList.add(new Restriction(splitRestriction[0], splitRestriction[1], "="));
                    } else if (getCondition[i].contains(">")) {
                        splitRestriction = getCondition[i].trim().split("\\W+");
                        getConditionsList.add(new Restriction(splitRestriction[0], splitRestriction[1], ">"));
                    } else if (getCondition[i].contains("<")) {
                        splitRestriction = getCondition[i].trim().split("\\W+");
                        getConditionsList.add(new Restriction(splitRestriction[0], splitRestriction[1], "<"));
                    }

                }
            }
        }
        return getConditionsList;
    }

    /*
     * Extract the logical operators(AND/OR) from the query, if at all it is
     * present. For eg: select city,winner,team1,team2,player_of_match from
     * data/ipl.csv where season >= 2008 or toss_decision != bat and city =
     * bangalore
     *
     * The query mentioned above in the example should return a List of Strings
     * containing [or,and]
     */

    public List<String> getLogicalOperators(String queryString) {
        String[] splitSpace = queryString.split(" ");
        ArrayList<String> listLogicalOperators = new ArrayList<>();
        if(queryString.contains("where ")) {
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
     * Extract the aggregate functions from the query. The presence of the aggregate
     * functions can determined if we have either "min" or "max" or "sum" or "count"
     * or "avg" followed by opening braces"(" after "select" clause in the query
     * string. in case it is present, then we will have to extract the same. For
     * each aggregate functions, we need to know the following: 1. type of aggregate
     * function(min/max/count/sum/avg) 2. field on which the aggregate function is
     * being applied.
     *
     * Please note that more than one aggregate function can be present in a query.
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