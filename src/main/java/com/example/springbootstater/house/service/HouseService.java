package com.example.springbootstater.house.service;

import com.example.springbootstater.house.entity.*;
import com.example.springbootstater.house.model.*;
import com.example.springbootstater.house.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HouseService {
    @Autowired
    private HouseRepository houseRepository;
    public House addHouse(House house) {

        HouseEntity houseEntity = createHouseEntity(house);

        houseEntity = houseRepository.save(houseEntity);
        house.setId(houseEntity.getId());
       return house;

    }

    private static HouseEntity createHouseEntity(House house) {
        HouseEntity houseEntity = new HouseEntity();

        houseEntity.setAreaOfTheHouse(house.getAreaOfTheHouse());
        houseEntity.setPrice(house.getPrice());
        houseEntity.setType(house.getType().name());

        BedRoomEntity bedRoom = new BedRoomEntity();
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setLength(house.getBedRoom().getLength());
        roomEntity.setWidth(house.getBedRoom().getWidth());
        roomEntity.setNumOfWindows(house.getBedRoom().getNumOfWindows());
        roomEntity.setHeating(house.getBedRoom().isHeating());
        bedRoom.setBed(house.getBedRoom().isBed());
        bedRoom.setCurtains(house.getBedRoom().isCurtains());
        bedRoom.setFan(house.getBedRoom().isFan());

        bedRoom.setRoomEntity(roomEntity);
        houseEntity.setBedRoom(bedRoom);


        KitchenEntity kitchen = new KitchenEntity();

        RoomEntity kitchenRoomEntity = new RoomEntity();
        kitchenRoomEntity.setLength(house.getKitchen().getLength());
        kitchenRoomEntity.setWidth(house.getKitchen().getWidth());
        kitchenRoomEntity.setNumOfWindows(house.getKitchen().getNumOfWindows());
        kitchenRoomEntity.setHeating(house.getKitchen().isHeating());
        kitchen.setStove(house.getKitchen().isStove());
        kitchen.setSink(house.getKitchen().isSink());
        kitchen.setFridge(house.getKitchen().isFridge());
        kitchen.setMicroOven(house.getKitchen().isMicroOven());

        kitchen.setRoomEntity(kitchenRoomEntity);
        houseEntity.setKitchen(kitchen);


        LivingRoomEntity livingRoom = new LivingRoomEntity();

        RoomEntity livingRoomEntity = new RoomEntity();
        livingRoomEntity.setLength(house.getLivingRoom().getLength());
        livingRoomEntity.setWidth(house.getLivingRoom().getWidth());
        livingRoomEntity.setNumOfWindows(house.getLivingRoom().getNumOfWindows());
        livingRoomEntity.setHeating(house.getLivingRoom().isHeating());
        livingRoom.setSofa(house.getLivingRoom().isSofa());
        livingRoom.setTv(house.getLivingRoom().isTv());
        livingRoom.setNoOfWindows(house.getLivingRoom().getNoOfWindows());
        livingRoom.setLight(house.getLivingRoom().isLight());

        livingRoom.setRoomEntity(livingRoomEntity);
        houseEntity.setLivingRoom(livingRoom);

        WashRoomEntity washRoom = new WashRoomEntity();
        RoomEntity washRoomEntity = new RoomEntity();


        washRoomEntity.setLength(house.getWashRoom().getLength());
        washRoomEntity.setWidth(house.getWashRoom().getWidth());
        washRoomEntity.setNumOfWindows(house.getWashRoom().getNumOfWindows());
        washRoomEntity.setHeating(house.getWashRoom().isHeating());
        washRoom.setNoOfLights(house.getWashRoom().getNoOfLights());
        washRoom.setToilet(house.getWashRoom().isToilet());
        washRoom.setBathTub(house.getWashRoom().isBathTub());
        washRoom.setSink(house.getWashRoom().isSink());

        washRoom.setRoomEntity(washRoomEntity);
        houseEntity.setWashRoom(washRoom);

        return houseEntity;
    }

    public House updateHouse(int id, House house) {
        HouseEntity houseEntity = createHouseEntity(house);
        houseEntity.setId(id);
        houseRepository.save(houseEntity);
        return house;
    }

    public void deleteById(int id) {
        houseRepository.deleteById(id);
    }


    public List<House> getAllHouses() {
        List<HouseEntity> houseEntities = (List<HouseEntity>) houseRepository.findAll();
        List<House> houses = houseEntities.stream().map(this::convertFromEntityToHouse).toList();
        return houses;

    }

    public House getById(int id) {
        Optional<HouseEntity> houseEntity = houseRepository.findById(id);
        House house = convertFromEntityToHouse(houseEntity.get());
        return house;
    }

    private House convertFromEntityToHouse(HouseEntity houseEntity) {
        House house = new House();

        house.setId(houseEntity.getId());
        house.setAreaOfTheHouse(houseEntity.getAreaOfTheHouse());

       // houseEntity.setAreaOfTheHouse(house.getAreaOfTheHouse());
        house.setPrice(houseEntity.getPrice());
        house.setType(Type.valueOf(houseEntity.getType()));

        //house.setBedRoom(houseEntity.getBedRoom());
        BedRoom bedRoom = new BedRoom();

        bedRoom.setLength(houseEntity.getBedRoom().getRoomEntity().getLength());
        bedRoom.setWidth(houseEntity.getBedRoom().getRoomEntity().getWidth());
        bedRoom.setNumOfWindows(houseEntity.getBedRoom().getRoomEntity().getNumOfWindows());
        bedRoom.setHeating(houseEntity.getBedRoom().getRoomEntity().isHeating());

        house.setBedRoom(bedRoom);

        Kitchen kitchen = new Kitchen();
        kitchen.setLength(houseEntity.getKitchen().getRoomEntity().getLength());
        kitchen.setWidth(houseEntity.getKitchen().getRoomEntity().getWidth());
        kitchen.setNumOfWindows(houseEntity.getKitchen().getRoomEntity().getNumOfWindows());
        kitchen.setHeating(houseEntity.getKitchen().getRoomEntity().isHeating());

        house.setKitchen(kitchen);


        LivingRoom livingRoom = new LivingRoom();

        livingRoom.setLength(houseEntity.getLivingRoom().getRoomEntity().getLength());
        livingRoom.setWidth(houseEntity.getLivingRoom().getRoomEntity().getWidth());
        livingRoom.setNumOfWindows(houseEntity.getLivingRoom().getRoomEntity().getNumOfWindows());
        livingRoom.setHeating(houseEntity.getLivingRoom().getRoomEntity().isHeating());

        house.setLivingRoom(livingRoom);

        WashRoom washRoom = new WashRoom();

        washRoom.setLength(houseEntity.getWashRoom().getRoomEntity().getLength());
        washRoom.setWidth(houseEntity.getWashRoom().getRoomEntity().getWidth());
        washRoom.setNumOfWindows(houseEntity.getWashRoom().getRoomEntity().getNumOfWindows());
        washRoom.setHeating(houseEntity.getWashRoom().getRoomEntity().isHeating());

        house.setWashRoom(washRoom);

        return house;
    }
}
