package com.collection.MiniPrroj1;

import java.util.*;
public class EmployeeService {

	ArrayList<EmployeeBean> arr = new ArrayList<EmployeeBean>();
	
	public boolean insertEmployee(EmployeeBean bean)
	{
		arr.add(bean);
		return true;
	}
	
	public String insertByPosition(EmployeeBean bean,int pos)
	{
		arr.add(pos,bean);
		return bean.getEmpname();
	}
	public ArrayList<EmployeeBean> fetchEmployee()
	{
		return arr;
	}
	
	public boolean deleteById(int id)
	{
		Iterator<EmployeeBean> itr = arr.iterator();
		while(itr.hasNext())
		{
			EmployeeBean ob = (EmployeeBean)itr.next();
			if(ob.getEmpId()==id)
			{
				arr.remove(ob);
				return true;
			}
		}
		return false;
	}
	public boolean updateById(int id,EmployeeBean bean)
	{
		Iterator<EmployeeBean> itr = arr.iterator();
		while(itr.hasNext())
		{
			EmployeeBean ob = (EmployeeBean)itr.next();
			if(ob.getEmpId()==id)
			{
				arr.remove(ob);
				arr.add(bean);
				return true;
			}
		}
		return false;
	}
}

