package com.deepak.Spring_Batch.Repo;

import com.deepak.Spring_Batch.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {

}
