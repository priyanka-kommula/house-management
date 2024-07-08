package com.example.springbootstater.house.model;

public class House {

    private int id;
    private Type type;
    private int areaOfTheHouse;
    private int price;
    private BedRoom bedRoom;
    private Kitchen kitchen;
    private WashRoom washRoom;
    private LivingRoom livingRoom;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getAreaOfTheHouse() {
        return areaOfTheHouse;
    }

    public void setAreaOfTheHouse(int areaOfTheHouse) {
        this.areaOfTheHouse = areaOfTheHouse;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public void setBedRoom(BedRoom bedRoom) {
        this.bedRoom = bedRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public WashRoom getWashRoom() {
        return washRoom;
    }

    public void setWashRoom(WashRoom washRoom) {
        this.washRoom = washRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "House{" +
                "type=" + type +
                ", areaOfTheHouse=" + areaOfTheHouse +
                ", price=" + price +
                ", bedRoom=" + bedRoom +
                ", kitchen=" + kitchen +
                ", washRoom=" + washRoom +
                ", leavingRoom=" + livingRoom +
                '}';
    }
}
