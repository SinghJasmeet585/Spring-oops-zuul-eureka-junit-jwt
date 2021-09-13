package org.example;

class InvalidSpecialCharacterException extends Exception {
    String message;

    public InvalidSpecialCharacterException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "InvalidSpecialCharacterException{" +
                "message='" + message + '\'' +
                '}';
    }
}
