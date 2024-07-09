package com.example.springbootstater.house.repository;

import com.example.springbootstater.house.entity.HouseEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseRepository extends CrudRepository<HouseEntity,Integer> {
    @Query("from HouseEntity where type=?1")
    List<HouseEntity> findBYType(String type);

}
