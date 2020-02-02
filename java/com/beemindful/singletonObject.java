package com.beemindful;

public class singletonObject {

    private singletonObject single = null;
    public int points;

    public singletonObject() {
        points = 0;
    }

    public void createSingle() {
        single = new singletonObject();
    }

    public void addPoint() {
        points++;
    }

}
