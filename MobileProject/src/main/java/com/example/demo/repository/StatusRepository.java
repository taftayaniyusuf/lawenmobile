package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status, Long>{
	
	Status getById(Long id);

}
