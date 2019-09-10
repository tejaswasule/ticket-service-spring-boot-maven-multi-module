package com.test.io.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.io.entity.EmployeeEntity;


public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
