package com.bostonHacks.DontTrashMyHouse.models;

public class Lock{
    private String state;
    private String endpoint;


    public Lock() {
    }

    public Lock(String state, String endpoint) {
        this.state = state;
        this.endpoint = endpoint;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}