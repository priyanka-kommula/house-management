package com.example.springbootstater.house.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class WashRoomEntity extends RoomEntity {
    @Id
    @GeneratedValue
    private int id;
    private int noOfLights;
    private boolean toilet;
    private boolean bathTub;
    private boolean sink;

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

    public RoomEntity getRoomEntity() {
        return roomEntity;
    }

    public void setRoomEntity(RoomEntity roomEntity) {
        this.roomEntity = roomEntity;
    }

    @Override
    public String toString() {
        return "WashRoomEntity{" +
                "id=" + id +
                ", noOfLights=" + noOfLights +
                ", toilet=" + toilet +
                ", bathTub=" + bathTub +
                ", sink=" + sink +
                ", roomEntity=" + roomEntity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WashRoomEntity that = (WashRoomEntity) o;
        return id == that.id && noOfLights == that.noOfLights && toilet == that.toilet && bathTub == that.bathTub && sink == that.sink && Objects.equals(roomEntity, that.roomEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, noOfLights, toilet, bathTub, sink, roomEntity);
    }
}
