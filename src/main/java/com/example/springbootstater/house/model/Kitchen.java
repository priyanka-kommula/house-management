package com.example.springbootstater.house.model;

public class Kitchen extends Room{
    private boolean stove;
    private boolean sink;
    private boolean fridge;
    private boolean microOven;

    public boolean isStove() {
        return stove;
    }

    public void setStove(boolean stove) {
        this.stove = stove;
    }

    public boolean isSink() {
        return sink;
    }

    public void setSink(boolean sink) {
        this.sink = sink;
    }

    public boolean isFridge() {
        return fridge;
    }

    public void setFridge(boolean fridge) {
        this.fridge = fridge;
    }

    public boolean isMicroOven() {
        return microOven;
    }

    public void setMicroOven(boolean microOven) {
        this.microOven = microOven;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "stove=" + stove +
                ", sink=" + sink +
                ", fridge=" + fridge +
                ", microOven=" + microOven +
                '}';
    }
}
