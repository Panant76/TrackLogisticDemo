package com.github.Panant76.TrackLogisticsDemo.repository;


import com.github.Panant76.TrackLogisticsDemo.model.entity.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Long> {
}
