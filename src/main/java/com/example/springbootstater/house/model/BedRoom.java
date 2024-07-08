package com.example.springbootstater.house.model;

public class BedRoom extends Room{
    private boolean bed;
    private boolean curtains;
    private boolean fan;

    public boolean isBed() {
        return bed;
    }

    public void setBed(boolean bed) {
        this.bed = bed;
    }

    public boolean isCurtains() {
        return curtains;
    }

    public void setCurtains(boolean curtains) {
        this.curtains = curtains;
    }

    public boolean isFan() {
        return fan;
    }

    public void setFan(boolean fan) {
        this.fan = fan;
    }

    public boolean isWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(boolean wardrobe) {
        this.wardrobe = wardrobe;
    }

    public boolean isMirror() {
        return mirror;
    }

    public void setMirror(boolean mirror) {
        this.mirror = mirror;
    }

    private  boolean wardrobe;
    private boolean mirror;

    @Override
    public String toString() {
        return "BedRoom{" +
                "bed=" + bed +
                ", curtains=" + curtains +
                ", fan=" + fan +
                ", wardrobe=" + wardrobe +
                ", mirror=" + mirror +
                '}';
    }
}
