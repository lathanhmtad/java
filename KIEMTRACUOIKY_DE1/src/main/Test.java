package main;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee("001", "Hieu dep trai", "14/10/2003", "Hoa lien", "To4", "0833" , "main.com");
		Employee e2 = new Employee("002", "Duy nguyen", "2/2/2003", "Hoa Vang", "To 1", "02232" , "mail@com.com");
		
		
		ListEmployee list = new ListEmployee();
		
		list.add(e1);
		list.add(e2);
		
		
		
		list.in();
		
		System.out.println(list.timKiem("001"));
		
	}
}
