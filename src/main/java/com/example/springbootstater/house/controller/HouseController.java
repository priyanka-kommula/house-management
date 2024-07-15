package com.example.springbootstater.house.controller;

import com.example.springbootstater.house.model.House;
import com.example.springbootstater.house.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HouseController {
    @Autowired
    private HouseService houseService;
    @PostMapping("/house")
    public @ResponseBody House addHouse(@RequestBody House house){
       return houseService.addHouse(house);
    }
    @PostMapping("/houses")
    public @ResponseBody List<House> addHouses(@RequestBody List<House> houses){
        return  houseService.addHouses(houses);
    }
    @PutMapping("/houses/{id}")
    public @ResponseBody House updateHouse(@RequestBody House house, @PathVariable int id){
        return houseService.updateHouse(id,house);
    }

    @DeleteMapping("/houses/{id}")
    public @ResponseBody String deleteHouse(@PathVariable int id){
       houseService.deleteById(id);
       return "success";
    }
    @GetMapping("/houses/{id}")
    public @ResponseBody House getById(@PathVariable int id){
        return houseService.getById(id);
    }
    @GetMapping("/houses")
    public @ResponseBody List<House> getAllHouses(@RequestParam(value = "type",required = false) String type, @RequestParam(value = "price",required = false) Integer price){
        return houseService.getAllHouses(type,price);
    }


}
