package com.test.io.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.io.entity.EmployeeEntity;

public interface DepartmentRepository extends JpaRepository<EmployeeEntity,Long>{

}
