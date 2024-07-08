package com.example.springbootstater.house.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class KitchenEntity extends RoomEntity {
    @Id
    @GeneratedValue
    private int id;
    private boolean stove;
    private boolean sink;
    private boolean fridge;
    private boolean microOven;
    @OneToOne(cascade = CascadeType.ALL)
    private RoomEntity roomEntity;


    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

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

    public RoomEntity getRoomEntity() {
        return roomEntity;
    }

    public void setRoomEntity(RoomEntity roomEntity) {
        this.roomEntity = roomEntity;
    }

    @Override
    public String toString() {
        return "KitchenEntity{" +
                "id=" + id +
                ", stove=" + stove +
                ", sink=" + sink +
                ", fridge=" + fridge +
                ", microOven=" + microOven +
                ", roomEntity=" + roomEntity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        KitchenEntity that = (KitchenEntity) o;
        return id == that.id && stove == that.stove && sink == that.sink && fridge == that.fridge && microOven == that.microOven && Objects.equals(roomEntity, that.roomEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, stove, sink, fridge, microOven, roomEntity);
    }
}
