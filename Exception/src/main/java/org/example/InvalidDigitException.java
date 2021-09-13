package org.example;

public class InvalidDigitException extends Exception {
    String message;

    public InvalidDigitException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "InvalidDigitException{" +
                "message='" + message + '\'' +
                '}';
    }
}
