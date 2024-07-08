package com.example.springbootstater.house.entity;

import com.example.springbootstater.house.model.BedRoom;
import com.example.springbootstater.house.model.WashRoom;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class HouseEntity implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String type;
    private int areaOfTheHouse;
    private int price;
    @OneToOne(cascade = CascadeType.ALL)
    private BedRoomEntity bedRoom;
    @OneToOne(cascade = CascadeType.ALL)
    private KitchenEntity kitchen;
    @OneToOne(cascade = CascadeType.ALL)
    private LivingRoomEntity livingRoom;
    @OneToOne(cascade = CascadeType.ALL)
    private WashRoomEntity washRoom;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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

    public BedRoomEntity getBedRoom() {
        return bedRoom;
    }

    public void setBedRoom(BedRoomEntity bedRoom) {
        this.bedRoom = bedRoom;
    }

    public KitchenEntity getKitchen() {
        return kitchen;
    }

    public void setKitchen(KitchenEntity kitchen) {
        this.kitchen = kitchen;
    }

    public LivingRoomEntity getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoomEntity livingRoom) {
        this.livingRoom = livingRoom;
    }

    public WashRoomEntity getWashRoom() {
        return washRoom;
    }

    public void setWashRoom(WashRoomEntity washRoom) {
        this.washRoom = washRoom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseEntity that = (HouseEntity) o;
        return id == that.id && areaOfTheHouse == that.areaOfTheHouse && price == that.price && Objects.equals(type, that.type) && Objects.equals(bedRoom, that.bedRoom) && Objects.equals(kitchen, that.kitchen) && Objects.equals(livingRoom, that.livingRoom) && Objects.equals(washRoom, that.washRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, areaOfTheHouse, price, bedRoom, kitchen, livingRoom, washRoom);
    }

    @Override
    public String toString() {
        return "HouseEntity{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", areaOfTheHouse=" + areaOfTheHouse +
                ", price=" + price +
                ", bedRoom=" + bedRoom +
                ", kitchen=" + kitchen +
                ", livingRoom=" + livingRoom +
                ", washRoom=" + washRoom +
                '}';
    }
}
