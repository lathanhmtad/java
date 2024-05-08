package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
	private ArrayList<Student> list;

	public StudentList(ArrayList<Student> list) {
		super();
		this.list = list;
	}

	public StudentList() {
		super();
		list = new ArrayList<Student>();
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	
	// Thêm sinh viên vào cuối danh sách
	public void add(Student student)
	{
		list.add(student);
	}
	
	// In danh sách sinh viên ra màn hình
	public void printList()
	{
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	// Kiểm tra danh sách có rỗng
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	
	// Lấy ra số lượng sinh viên trong danh sách
	public int size()
	{
		return list.size();
	}
	
	
	// Làm rỗng danh sách sinh viên
	public void makeItEmpty()
	{
		list.removeAll(list);
	}
	
	
	// Kiểm tra sinh viên có tồn tại theo id
	public boolean contains(Student student)
	{	
		return list.contains(student);
	}
	
	
	// Xóa một sinh viên khỏi danh sách dựa trên mã sinh viên
	public boolean remove(Student student)
	{
		return list.remove(student);
	}
	
	// Tìm kiếm tất cả sinh viên dựa trên tên
	public void searchName(String name)
	{
		for (Student student : list) {
			if(student.getName().indexOf(name) >= 0) {
				System.out.println(student);
			}
		}
	}
	
	
	// Sắp xếp sinh viên giảm dần theo điểm
	public void sortByPoint()
	{
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				if(o1.getMediumScore() < o2.getMediumScore())
					return 1;
				else if(o1.getMediumScore() > o2.getMediumScore())
					return -1;
				return 0;
			}
		});
	}
}
