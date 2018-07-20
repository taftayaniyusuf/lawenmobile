package com.example.demo.repository;

import com.example.demo.model.Karyawan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KaryawanRepository extends CrudRepository<Karyawan,Long> {
}
