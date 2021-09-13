package com.annotation;

import org.springframework.beans.factory.annotation.Required;

import javax.xml.ws.RequestWrapper;

public class Hall {
    Owner owner;
    int length;
    int width;

    public Hall() {
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getLength() {
        return length;
    }

    @Required
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    @Required
    public void setWidth(int width) {
        this.width = width;
    }


    public void display() {
        System.out.println(length);
        System.out.println(width);
    }
}
