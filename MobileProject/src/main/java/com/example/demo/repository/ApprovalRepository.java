package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Approval;

@Repository
public interface ApprovalRepository extends CrudRepository<Approval,Long>{

}
