package com.collection.MiniPrroj1;

public class EmployeeBean {

		private int empId;
		private String empname;
		private double salary;
		private String desg;
		
		public EmployeeBean() {
			super();
		}
		public EmployeeBean(int empId, String empname, double salary, String desg) {
			super();
			this.empId = empId;
			this.empname = empname;
			this.salary = salary;
			this.desg = desg;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getDesg() {
			return desg;
		}
		public void setDesg(String desg) {
			this.desg = desg;
		}
		
}
