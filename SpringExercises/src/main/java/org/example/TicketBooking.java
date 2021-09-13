package org.example;

public class TicketBooking {
    int numberOfPerson;
    Double fare;

    public double fareGenerator() {
        return numberOfPerson * fare;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }
}
