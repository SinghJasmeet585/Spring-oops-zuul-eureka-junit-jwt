package org.example;

public class InvalidLetterException extends Exception {
    String message;

    public InvalidLetterException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "InvalidLetterException{" +
                "message='" + message + '\'' +
                '}';
    }
}
