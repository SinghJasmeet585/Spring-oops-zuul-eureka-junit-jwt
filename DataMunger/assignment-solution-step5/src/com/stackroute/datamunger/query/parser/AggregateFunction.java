package com.stackroute.datamunger.query.parser;

/* This class is used for storing name of field, aggregate function for 
 * each aggregate function
 * */
public class AggregateFunction {

	private String field;
	private String aggregateFunction;

	public AggregateFunction() {
	}

	public AggregateFunction(String field, String aggregateFunction) {
		this.field = field;
		this.aggregateFunction = aggregateFunction;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getAggregateFunction() {
		return aggregateFunction;
	}

	public void setAggregateFunction(String aggregateFunction) {
		this.aggregateFunction = aggregateFunction;
	}

	public String getFunction() {
		// TODO Auto-generated method stub
		return aggregateFunction;
	}

	public String getField() {
		// TODO Auto-generated method stub
		return field;
	}
	
	

}
