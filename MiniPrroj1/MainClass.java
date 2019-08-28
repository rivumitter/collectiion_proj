package com.collection.MiniPrroj1;

import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<EmployeeBean> arr = new ArrayList<EmployeeBean>();
		
		EmployeeBean []bean = new EmployeeBean[10];
		bean[0] = new EmployeeBean(100,"Arghya",30000.0,"Project Engineer");
		bean[1] = new EmployeeBean(101,"Arunima",80000.0,"HR");
		bean[2] = new EmployeeBean(102,"Vinit",30000.0,"Project Engineer");
		
		EmployeeService employeeService = new EmployeeService();
		//Insert
		for(int i=0;i<3;i++)
		{
			employeeService.insertEmployee(bean[i]);
		}
		
		//delete
		boolean chkDelete = employeeService.deleteById(102);
		System.out.println(chkDelete);
		
		arr = employeeService.fetchEmployee();
		arr.forEach(e->{
			System.out.println(e.getEmpname()+" "+e.getEmpId()+" "+
								e.getDesg());
		});
		
		//update
		bean[4] = new EmployeeBean(101,"Arunima",85000.0,"SR-HR");
		arr.forEach(e->{
			System.out.println(e.getEmpname()+" "+e.getEmpId()+" "+
								e.getDesg()+" "+e.getSalary());
		});
		
		boolean chkUpdate = employeeService.updateById(101, bean[4]);
		
		
		
	

	}

}
