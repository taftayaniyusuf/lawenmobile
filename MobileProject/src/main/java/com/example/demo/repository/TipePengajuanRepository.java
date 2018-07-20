package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TipePengajuan;

@Repository
public interface TipePengajuanRepository extends CrudRepository<TipePengajuan, Long>{
	
	TipePengajuan getById(Long id);

}
