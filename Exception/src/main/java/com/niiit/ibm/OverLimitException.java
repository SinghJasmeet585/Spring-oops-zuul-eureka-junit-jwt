package com.niiit.ibm;

public class OverLimitException extends Exception{
    public OverLimitException(String message, Throwable cause) {
        super(message, cause);
    }

    public OverLimitException(Throwable cause) {
        super(cause);
    }
}
