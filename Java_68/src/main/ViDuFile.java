package main;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
	File file;
	
	public ViDuFile(String tenFile) {
		super();
		file = new File(tenFile);
	}

	// Kiểm tra file có thể thực thi
	public boolean kiemTraThucThi()
	{
		 return file.canExecute();
	}

	// Kiểm tra file có thể đọc
	public boolean kiemTraDoc()
	{
		return file.canRead();
	}
		
	// Kiểm tra file có thể ghi
	public boolean kiemTraGhi()
	{
		 return file.canWrite();
	}
	
	
	public void inDuongDan()
	{
		System.out.println(file.getAbsolutePath());
	}
	
	public void inTenFile()
	{
		System.out.println(file.getName());
	}
	
	
	public void kiemTraThuMucHoacTapTin()
	{
		if(file.isDirectory())
			System.out.println("Đây là thư mục");
		else if(file.isFile()) 
			System.out.println("Đây là tập tin");
	}
	
	public void inDanhSachCacFileCon()
	{
		if(file.isDirectory())
		{
			System.out.println("Các tập tin con/ thư mục con là: ");
			File[] mangCon = file.listFiles();
			
			for (File file : mangCon) {
				System.out.println(file.getAbsolutePath());
			}
		}
		else if(file.isFile())
			System.out.println("Đây là tập tin, không có file con bên trong");
	}
	
	public void inCayThuMuc() 
	{
		inChiTietCayThuMuc(file, 1);
	}
	
	public void inChiTietCayThuMuc(File f, int bac)
	{
//		System.out.print("|");
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		
		System.out.println(f.getName());
		if(f.canRead() && f.isDirectory())
		{
			File[] mangCon = f.listFiles();
			for (File fx : mangCon) {
				inChiTietCayThuMuc(fx, bac + 1);
			}				
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("Nhập tên file: ");
		String tenFile = sc.nextLine();
		ViDuFile vdf = new ViDuFile(tenFile);
		do
		{
			System.out.println("MENU --------------");
			System.out.println("1. Kiểm tra file có thể thực thi");
			System.out.println("2. Kiểm tra file có thể đọc");
			System.out.println("3. Kiểm tra file có thể ghi");
			System.out.println("4. In đường dẫn");
			System.out.println("5. In tên file");
			System.out.println("6. Kiểm tra file là thư mục hoặc tập tin");
			System.out.println("7. In ra danh sách file con: ");
			System.out.println("8. In ra cây thư mục");
			System.out.println("0. Thoát ra khỏi chương trình");
			
			System.out.println("Nhập lựu chọn của ban: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Kiểm tra file có thể thực thi: " + vdf.kiemTraThucThi());
				break;
			case 2:
				System.out.println("Kiểm tra file có thể đọc: " + vdf.kiemTraDoc());
				break;
			case 3:
				System.out.println("Kiểm tra file có thể ghi: " + vdf.kiemTraGhi());
				break;
			case 4:
				vdf.inDuongDan();
				break;
			case 5:
				vdf.inTenFile();
				break;
			case 6:
				vdf.kiemTraThuMucHoacTapTin();
				break;
			case 7:
				vdf.inDanhSachCacFileCon();
				break;
			case 8:
				vdf.inCayThuMuc();
				break;
			default:
				break;
			}
		
			sc.nextLine();
			sc.nextLine();
		} while(choice != 0);
		
		
		sc.close();
	}
}
