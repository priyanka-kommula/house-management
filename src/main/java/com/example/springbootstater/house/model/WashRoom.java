package com.example.springbootstater.house.model;

public class WashRoom extends Room{

    private int noOfLights;
    private boolean toilet;
    private boolean bathTub;
    private boolean sink;

    public int getNoOfLights() {
        return noOfLights;
    }

    public void setNoOfLights(int noOfLights) {
        this.noOfLights = noOfLights;
    }

    public boolean isToilet() {
        return toilet;
    }

    public void setToilet(boolean toilet) {
        this.toilet = toilet;
    }

    public boolean isBathTub() {
        return bathTub;
    }

    public void setBathTub(boolean bathTub) {
        this.bathTub = bathTub;
    }

    public boolean isSink() {
        return sink;
    }

    public void setSink(boolean sink) {
        this.sink = sink;
    }

    @Override
    public String toString() {
        return "WashRoom{" +
                "noOfLights=" + noOfLights +
                ", toilet=" + toilet +
                ", bathTub=" + bathTub +
                ", sink=" + sink +
                '}';
    }
}
