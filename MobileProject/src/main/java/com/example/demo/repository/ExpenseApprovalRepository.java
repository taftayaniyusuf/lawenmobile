package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ExpenseApproval;

@Repository
public interface ExpenseApprovalRepository extends CrudRepository<ExpenseApproval,Long>{

}
