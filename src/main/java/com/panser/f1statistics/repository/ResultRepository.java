package com.panser.f1statistics.repository;

import com.panser.f1statistics.dto.BestResult;
import com.panser.f1statistics.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Integer> {

//    @Query("select u.userName from User u inner join u.area ar where ar.idArea = :idArea")
      @Query("select r from Result r inner join r.raceId ra where ra.raceId = :r.raceId")
    List<Result> findByYear(Integer year);
}
