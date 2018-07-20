package com.example.demo.repository;

import com.example.demo.model.AkunBank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AkunBankRepository extends CrudRepository<AkunBank,Long> {
}
