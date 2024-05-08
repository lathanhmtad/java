package test;

import java.io.File;
import java.util.Scanner;

import main.Student;
import main.StudentList;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentList studentList = new StudentList();
		int choice = 0;
		do
		{
			System.out.println("---------MENU---------");
			System.out.println("1. Thêm sinh viên vào danh sách.");
			System.out.println("2. In danh sách sinh viên.");
			System.out.println("3. Kiểm tra danh sách có rỗng hay không.");
			System.out.println("4. Lấy số lượng sinh viên trong danh sách.");
			System.out.println("5. Làm rỗng danh sách sinh viên.");
			System.out.println("6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.");
			System.out.println("7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.");
			System.out.println("8. Tìm kiếm tất cả sinh viên dựa trên họ và tên được nhập từ bàn phím.");
			System.out.println("9. Xuất danh sách sinh viên có điểm từ cao đến thấp.");
			System.out.println("10. Lưu danh sách sinh viên xuống tập tin");
			System.out.println("0. Thoát chương trình.");
			System.out.print("Nhập lựu chọn của bro: ");
			choice = sc.nextInt();
			
			if(choice == 1)
			{
				System.out.print("Nhập mã sinh viên: "); sc.nextLine(); String id = sc.nextLine();
				System.out.print("Nhập họ và tên: "); String name = sc.nextLine();
				System.out.print("Nhập năm sinh: "); int year = sc.nextInt(); sc.nextLine();
				System.out.print("Nhập điểm trung bình: "); float score = sc.nextFloat();
				Student student = new Student(id, name, year, score);
				studentList.add(student);
				System.out.println("Đã thêm sinh viên vào danh sách");
			} 
			else if(choice == 2)
				studentList.printList();
			else if(choice == 3) 
				System.out.println("Danh sách rỗng: " + studentList.isEmpty());
			else if(choice == 4) 
				System.out.println("Số lượng sinh viên hiện tại: " + studentList.size());
			else if(choice == 5) 
			{
				studentList.makeItEmpty();
				System.out.println("Đã xóa sạch xành xanh!");
			}
			else if(choice == 6) 
			{
				System.out.print("Nhập mã sinh viên: "); sc.nextLine(); String id = sc.nextLine();
				Student student = new Student(id);
				System.out.println("Kiểm tra sinh viên có trong danh sách: " + studentList.contains(student));
			}
			else if(choice == 7) 
			{
				System.out.print("Nhập mã sinh viên: "); sc.nextLine(); String id = sc.nextLine();
				Student student = new Student(id);
				System.out.println("Đã xóa thành công: " + studentList.remove(student));
			}
			else if(choice == 8) 
			{
				System.out.print("Nhập họ và tên: "); sc.nextLine(); String name = sc.nextLine();
				System.out.println("**Kết quả tìm kiếm**");
				studentList.searchName(name);
			}
			else if(choice == 9) 
			{
				studentList.sortByPoint();
				System.out.println("**Kết quả sắp xếp**");
				studentList.printList();
			}
			else if(choice == 10)
			{
				System.out.println("Nhập tên file: "); sc.nextLine();
				String fileName = sc.nextLine();
				File f = new File(fileName);
				studentList.saveInFile(f);
				System.out.println("Lưu thành công");
			}
			else
			{
				System.out.println("Hẹn gặp lại!");
				break;
			}
			
			System.out.println();
			System.out.println("Press Enter key to continue...");
	        sc.nextLine();
	        sc.nextLine();
			
			
		} while(choice >= 1 && choice <= 10);
		
		
		
		sc.close();
	}

}
