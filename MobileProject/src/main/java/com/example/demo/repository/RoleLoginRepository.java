package com.example.demo.repository;

import com.example.demo.model.RoleLogin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleLoginRepository extends CrudRepository<RoleLogin,Long> {
}
