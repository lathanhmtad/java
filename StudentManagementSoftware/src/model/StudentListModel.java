package model;

import java.util.ArrayList;

public class StudentListModel {
	private ArrayList<Student> list;

	public StudentListModel() {
		super();
		list = new ArrayList<Student>();
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	
	public void insert(Student student)
	{
		list.add(student);
	}
	
	public void delete(Student student)
	{
		list.remove(student);
	}
	
	public void update(Student student)
	{
		int n = list.size();
		for(int i = 0; i < n; i++)
		{
			if(list.get(i).equals(student))
			{
				list.set(i, student);
				break;
			}
		}
	}

	public boolean contains(Student student)
	{
		return list.contains(student);
	}

	
	
	
	
	
	
}
