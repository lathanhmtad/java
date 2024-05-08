package main;


public class Test {
	public static void main(String[] args) {
		System.out.println("Kiểm tra");
		DanhSachKhoanVay dskv = new DanhSachKhoanVay();
		dskv.readFile("D:\\JavaExercise\\input.txt");
		dskv.printData();
		dskv.exportErrorFile("D:\\JavaExercise\\input.txt", "D:\\JavaExercise\\output.txt");

	}
}
