package com.example.springrmiserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springrmiserver.model.Activity;

@Repository
public interface ActivityRepository  extends JpaRepository<Activity, Long>{
	Activity findByName(String name);
}
