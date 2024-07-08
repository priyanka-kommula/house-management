package com.example.springbootstater.house.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class LivingRoomEntity extends RoomEntity {
    @Id
    @GeneratedValue
    private int id;
    private boolean sofa;
    private boolean tv;
    private int noOfWindows;
    private boolean light;

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

    public RoomEntity getRoomEntity() {
        return roomEntity;
    }

    public void setRoomEntity(RoomEntity roomEntity) {
        this.roomEntity = roomEntity;
    }

    @Override
    public String toString() {
        return "LivingRoomEntity{" +
                "id=" + id +
                ", sofa=" + sofa +
                ", tv=" + tv +
                ", noOfWindows=" + noOfWindows +
                ", light=" + light +
                ", roomEntity=" + roomEntity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LivingRoomEntity that = (LivingRoomEntity) o;
        return id == that.id && sofa == that.sofa && tv == that.tv && noOfWindows == that.noOfWindows && light == that.light && Objects.equals(roomEntity, that.roomEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, sofa, tv, noOfWindows, light, roomEntity);
    }
}
