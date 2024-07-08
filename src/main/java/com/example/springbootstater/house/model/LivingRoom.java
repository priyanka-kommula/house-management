package com.example.springbootstater.house.model;

public class LivingRoom extends Room {
    private boolean sofa;
    private boolean tv;
    private int noOfWindows;
    private boolean light;

    public boolean isSofa() {
        return sofa;
    }

    public void setSofa(boolean sofa) {
        this.sofa = sofa;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public int getNoOfWindows() {
        return noOfWindows;
    }

    public void setNoOfWindows(int noOfWindows) {
        this.noOfWindows = noOfWindows;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    @Override
    public String toString() {
        return "LivingRoom{" +
                "sofa=" + sofa +
                ", tv=" + tv +
                ", noOfWindows=" + noOfWindows +
                ", light=" + light +
                '}';
    }
}
