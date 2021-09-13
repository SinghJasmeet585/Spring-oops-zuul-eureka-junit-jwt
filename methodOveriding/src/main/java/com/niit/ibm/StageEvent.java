package com.niit.ibm;

public class StageEvent extends Event{
    protected int noOfShows;
    protected int noOfSeatsPerShow;

    public Double projectedRevenue(){
        return noOfShows*noOfSeatsPerShow*50d;
    }
}
