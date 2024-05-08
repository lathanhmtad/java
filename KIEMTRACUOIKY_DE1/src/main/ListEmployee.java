package main;

import java.util.ArrayList;

public class ListEmployee {
	private ArrayList<Employee> list = new ArrayList<Employee>();
	
	public void add(Employee nhanVienCanThem)
	{
		list.add(nhanVienCanThem);
	}
	
	public void xoa(String id)
	{
		Employee e = new Employee();
		e.setMaNhanVien(id);
		
		list.remove(e);
		
//		int res = -1;
//		for (int i = 0; i < list.size(); i++) { 
//			if(list.get(i).getMaNhanVien().equals(id)) // arr[i]
//			{
//				res = i; // Tìm dc vị trí của nhân viên có id được truyền vào
//				break;
//			}
//			
//		}
//		list.remove(res);
//		
	}
	
	public Employee timKiem(String id)
	{
		Employee e = new Employee();
		e.setMaNhanVien(id);
		
		int index = list.indexOf(e);
		
		return index == -1 ? null : list.get(index);
		
//		for (Employee employee : list) {
//			if(employee.getMaNhanVien().equals(id))
//				return employee;
//		}
//		return null;
	}
	
	public void in()
	{
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
	
	
}
