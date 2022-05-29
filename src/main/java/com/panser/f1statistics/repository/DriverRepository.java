package com.panser.f1statistics.repository;

import com.panser.f1statistics.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, Integer> {
    List<Driver> findByCode(String code);

    @Query("SELECT d FROM Driver d")
    List<Driver> findAllDrivers();
}
