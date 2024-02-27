package com.example.sping_cinema_lab.models;

public class Reply {

private String message;
private boolean added;

public Reply (String message, boolean added){
    this.message = message;
    this.added = added;
}

public Reply(){}


//    GETTERS & SETTERS
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isAdded() {
        return added;
    }

    public void setAdded(boolean added) {
        this.added = added;
    }
}
