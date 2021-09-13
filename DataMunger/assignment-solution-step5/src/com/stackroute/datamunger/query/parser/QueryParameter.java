package com.stackroute.datamunger.query.parser;

import java.util.ArrayList;
import java.util.List;
/* 
 * This class will contain the elements of the parsed Query String such as conditions,
 * logical operators,aggregate functions, file name, fields group by fields, order by
 * fields, Query Type
 * */
public class QueryParameter {

	private String fileName;
	private String baseQuery;
	private List<Restriction> restrictions = new ArrayList<>();
	private List<String> fields = new ArrayList<>();
	private List<String> logicalOperators = new  ArrayList<>();
	private List<String> orderByFields = new ArrayList<>();
	private List<String> groupByFields = new ArrayList<>();
	private List<AggregateFunction> aggregateFunctions = new ArrayList<>();
	private String QUERY_TYPE;

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setBaseQuery(String baseQuery) {
		this.baseQuery = baseQuery;
	}

	public void setRestrictions(List<Restriction> restrictions) {
		this.restrictions = restrictions;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public void setLogicalOperators(List<String> logicalOperators) {
		this.logicalOperators = logicalOperators;
	}

	public void setOrderByFields(List<String> orderByFields) {
		this.orderByFields = orderByFields;
	}

	public void setGroupByFields(List<String> groupByFields) {
		this.groupByFields = groupByFields;
	}

	public void setAggregateFunctions(List<AggregateFunction> aggregateFunctions) {
		this.aggregateFunctions = aggregateFunctions;
	}

	public void setQUERY_TYPE(String QUERY_TYPE) {
		this.QUERY_TYPE = QUERY_TYPE;
	}

	public String getFileName() {
		// TODO Auto-generated method stub
		return fileName;
	}

	public List<String> getFields() {
		// TODO Auto-generated method stub
		return fields;
	}

	public List<Restriction> getRestrictions() {
		// TODO Auto-generated method stub
		return restrictions;
	}

	public String getBaseQuery() {
		// TODO Auto-generated method stub
		return baseQuery;
	}

	public List<AggregateFunction> getAggregateFunctions() {
		// TODO Auto-generated method stub
		return aggregateFunctions;
	}

	public List<String> getLogicalOperators() {
		// TODO Auto-generated method stub
		return logicalOperators;
	}

	public List<String> getGroupByFields() {
		// TODO Auto-generated method stub
		return groupByFields;
	}

	public List<String> getOrderByFields() {
		// TODO Auto-generated method stub
		return orderByFields;
	}

	public String getQUERY_TYPE() {
		// TODO Auto-generated method stub
		return QUERY_TYPE;
	}

		

	
}
