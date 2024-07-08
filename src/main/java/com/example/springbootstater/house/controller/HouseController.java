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
    @PostMapping("/houses")
    public @ResponseBody House addHouse(@RequestBody House house){
       return houseService.addHouse(house);
    }
    @PutMapping("/houses/{id}")
    public @ResponseBody House updateHouse(@RequestBody House house, @PathVariable int id){
        return houseService.updateHouse(id,house);
    }

    @DeleteMapping("/houses/{id}")
    public String deleteHouse(@PathVariable int id){
       houseService.deleteById(id);
       return "success";
    }
    @GetMapping("/houses")
    public @ResponseBody List<House> getAllHouses(){

        return houseService.getAllHouses();
    }
    @GetMapping("/houses/{id}")
    public @ResponseBody House getById(@PathVariable int id){
        return houseService.getById(id);
    }

}
