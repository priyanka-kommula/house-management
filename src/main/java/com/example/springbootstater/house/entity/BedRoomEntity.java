package com.example.springbootstater.house.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class BedRoomEntity  {
    @Id
    @GeneratedValue
    private int id;

    private boolean bed;
    private boolean curtains;
    private boolean fan;
    @OneToOne(cascade = CascadeType.ALL)
    private RoomEntity roomEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public RoomEntity getRoomEntity() {
        return roomEntity;
    }

    public void setRoomEntity(RoomEntity roomEntity) {
        this.roomEntity = roomEntity;
    }

    @Override
    public String toString() {
        return "BedRoomEntity{" +
                "id=" + id +
                ", bed=" + bed +
                ", curtains=" + curtains +
                ", fan=" + fan +
                ", roomEntity=" + roomEntity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BedRoomEntity that = (BedRoomEntity) o;
        return id == that.id && bed == that.bed && curtains == that.curtains && fan == that.fan && Objects.equals(roomEntity, that.roomEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bed, curtains, fan, roomEntity);
    }
}

