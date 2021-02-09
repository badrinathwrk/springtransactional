package com.dailycodebuffer.transaction.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestVO {

	private String empName;
	private String empEmail;
	private String deptName;
}