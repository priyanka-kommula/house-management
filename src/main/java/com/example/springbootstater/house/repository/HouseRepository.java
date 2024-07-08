package com.example.springbootstater.house.repository;

import com.example.springbootstater.house.entity.HouseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends CrudRepository<HouseEntity,Integer> {
}
