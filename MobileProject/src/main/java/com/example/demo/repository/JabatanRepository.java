package com.example.demo.repository;

import com.example.demo.model.Jabatan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JabatanRepository extends CrudRepository<Jabatan, Long> {
}
