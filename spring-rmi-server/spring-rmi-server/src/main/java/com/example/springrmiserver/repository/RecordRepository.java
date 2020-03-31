package com.example.springrmiserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springrmiserver.model.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>  {
	
}
