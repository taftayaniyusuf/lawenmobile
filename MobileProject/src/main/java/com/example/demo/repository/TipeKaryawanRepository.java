package com.example.demo.repository;

import com.example.demo.model.TipeKaryawan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipeKaryawanRepository extends CrudRepository<TipeKaryawan,Long> {
}
