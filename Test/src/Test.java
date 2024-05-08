import java.util.Scanner;

public class Test {
	static ListEmployee ds = new ListEmployee();
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		char k = ' ';
		do {
			System.out.println("1. Input data: ");
			System.out.println("2. Output data: ");
			System.out.println("3. Find data: ");
			System.out.println("4. Remove data: ");
			System.out.println("5. Read data from file: ");
			System.out.println("6. Write data to file: ");
			System.out.print("--> Your choice is: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					ds.inputData();
					break;
				case 2:
					ds.printData();
					break;
				case 3:
					sc.nextLine();
					System.out.print("Input code of Employee: ");
					String c1 = sc.nextLine();
					System.out.println("Information of Employee: ");
					ds.findEmployee(c1).printData();
					break;
				case 4:
					sc.nextLine();
					System.out.print("Input code of Employee: ");
					String c2 = sc.nextLine();
					ds.removeEmployee(c2);
					break;
				case 5:
					ds = new ListEmployee();
					ds.readFile("D:\\employee.txt");
					break;
				case 6:
					ds.writeFile("D:\\employee.txt");
					break;
			}
		} while (choice >= 1 && choice <= 6);
	}
	public static void main(String[] args) {
		char c = 'y';
		while (c == 'y' || c == 'Y') {
			Scanner sc = new Scanner(System.in);
			menu();
			System.out.println("Nhap y/Y de tro ve Menu va nhap bat ky de ket thuc: ");
			c = sc.nextLine().charAt(0);
		}
	}
}
