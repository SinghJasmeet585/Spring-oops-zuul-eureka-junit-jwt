package org.example;

public class InvalidLengthException extends Exception {
    String message;

    public InvalidLengthException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "InvalidLengthException{" +
                "message='" + message + '\'' +
                '}';
    }
}
