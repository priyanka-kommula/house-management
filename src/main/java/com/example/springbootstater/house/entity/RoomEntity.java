package com.example.springbootstater.house.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;
@Entity
public class RoomEntity implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private int length;
    private int width;
    private int numOfWindows;
    private boolean heating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public boolean isHeating() {
        return heating;
    }

    public void setHeating(boolean heating) {
        this.heating = heating;
    }

    @Override
    public String toString() {
        return "RoomEntity{" +
                "id=" + id +
                ", length=" + length +
                ", width=" + width +
                ", numOfWindows=" + numOfWindows +
                ", heating=" + heating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomEntity that = (RoomEntity) o;
        return id == that.id && length == that.length && width == that.width && numOfWindows == that.numOfWindows && heating == that.heating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, length, width, numOfWindows, heating);
    }
}
