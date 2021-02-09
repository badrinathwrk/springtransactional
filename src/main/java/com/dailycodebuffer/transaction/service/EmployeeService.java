package com.dailycodebuffer.transaction.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.transaction.entity.Department;
import com.dailycodebuffer.transaction.entity.Employee;
import com.dailycodebuffer.transaction.repository.DepartmentRepository;
import com.dailycodebuffer.transaction.repository.EmployeeRepository;
import com.dailycodebuffer.transaction.vo.EmployeeRequestVO;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Transactional
	public String saveEmployee(EmployeeRequestVO employeeRequestVO) {
		
		Department department = new Department();
		department.setDeptName(employeeRequestVO.getDeptName());
		department.setDeptCode(employeeRequestVO.getDeptName());
		
		Long deptId = departmentRepository.save(department).getDeptId();
		
		Employee employee = new Employee();
		employee.setDeptId(deptId);
		employee.setEmpName(employeeRequestVO.getEmpName());
		employee.setEmpEmail(employeeRequestVO.getEmpEmail());
		
		employeeRepository.save(employee);
		
		return "Employee is save with Employee ID: "+employee.getEmpId();
	}
	
	

}
