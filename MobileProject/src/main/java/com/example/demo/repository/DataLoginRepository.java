package com.example.demo.repository;

import com.example.demo.model.DataLogin;
import com.example.demo.model.Karyawan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataLoginRepository extends CrudRepository<DataLogin,Long> {
    DataLogin getByKaryawan(Karyawan karyawan);
}
