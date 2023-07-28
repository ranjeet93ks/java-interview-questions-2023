package com.interviews.questions.deutschebank;

public class Employee {
	int empId;
	String fullName;
	String dept;
	String email;

	public Employee(int empId, String fullName, String dept, String email) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.dept = dept;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", dept=" + dept + ", email=" + email + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
