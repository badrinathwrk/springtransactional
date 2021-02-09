package com.dailycodebuffer.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.transaction.entity.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
