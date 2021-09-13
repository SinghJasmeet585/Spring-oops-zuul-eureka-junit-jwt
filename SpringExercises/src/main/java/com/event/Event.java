package com.event;

public class Event {
    String eventName;
    String eventOrganiser;
    Double fare;

    public void display() {
        System.out.println("Event: " + eventName);
        System.out.println("Organised by: " + eventOrganiser);
        System.out.println("Fare: " + fare);
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventOrganiser() {
        return eventOrganiser;
    }

    public void setEventOrganiser(String eventOrganiser) {
        this.eventOrganiser = eventOrganiser;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }
}
