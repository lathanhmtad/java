package main;

import java.util.Scanner;

public class MAIN {
	private static Scanner sc = new Scanner(System.in);
	
	
	public static BENHNHAN nhapBNBHYT() {
		System.out.println("Nhập id: ");
		String id = sc.nextLine();

		System.out.println("Nhập họ và tên: ");
		String name = sc.nextLine();

		System.out.println("Nhập ngày tháng năm(dd/MM/yyyy) nhập viện: ");
		String ngayNhapVien = sc.nextLine();

		System.out.println("Phòng theo yêu cầu: ");
		boolean phongTheoYC = Boolean.valueOf(sc.nextLine());

		System.out.println("Nhập mã bảo hiểm y tế: ");
		String maBHYT = sc.nextLine();

		BENHNHAN bn = new BENHNHANBAOHIEMYTE(id, name, ngayNhapVien, phongTheoYC, maBHYT);
		return bn;
	}

	public static BENHNHAN nhapBNBHXH() {
		System.out.println("Nhập id: ");
		String id = sc.nextLine();

		System.out.println("Nhập họ và tên: ");
		String name = sc.nextLine();

		System.out.println("Nhập ngày tháng năm(dd/MM/yyyy) nhập viện: ");
		String ngayNhapVien = sc.nextLine();

		System.out.println("Phòng theo yêu cầu: ");
		boolean phongTheoYC = Boolean.valueOf(sc.nextLine());

		System.out.println("Nhập mã bảo hiểm xã hội: ");
		String maBHXH = sc.nextLine();

		BENHNHAN bn = new BENHNHANBAOHIEMXAHOI(id, name, ngayNhapVien, phongTheoYC, maBHXH);
		return bn;
	}
	

	public static void main(String[] args) {
		DANHSACHBENHNHAN list = new DANHSACHBENHNHAN();
		int choice;
		do {
			System.out.println("-----MENU CÔNG VIỆC------");
			System.out.println("1. Nhập thông tin bệnh nhân bảo hiểm y tế");
			System.out.println("2. Nhập thông tin bệnh nhân bảo hiểm xã hội");
			System.out.println("3. In danh sách bệnh nhân");
			System.out.println("4. Xóa bệnh nhân theo mã bệnh nhân");
			System.out.println("5. Tìm kiếm bệnh nhân theo mã bệnh nhân");
			System.out.println("6. Tính tổng tiền viện phí cho từng loại bệnh nhân");
			System.out.println("7. Đọc thông tin bệnh nhân từ file");
			System.out.println("8. Ghi thông tin bệnh nhân vào file");
			System.out.println("0. Thoát chương trình");

			System.out.println("Nhập lựu chọn của bạn: ");
			
			choice = Integer.parseInt(sc.nextLine());

			if (choice == 1) // Nhập thông tin bệnh nhân bảo hiểm y tế
			{
				BENHNHAN bn = nhapBNBHYT();
				list.themBenhNhan(bn);
			} else if (choice == 2) // Nhập thông tin bệnh nhân bảo hiểm xã hội
			{
				BENHNHAN bn = nhapBNBHXH();
				list.themBenhNhan(bn);
			} else if (choice == 3) // In danh sách bệnh nhân
			{
				System.out.println("Danh sách bệnh nhân: ");
				list.inDSBenhNhan();
			} else if (choice == 4) // Xóa bệnh nhân theo mã bệnh nhân
			{
				System.out.println("Nhập mã bệnh nhân cần xóa: ");
				String id = sc.nextLine();
				list.xoaBenhNhan(id);
				System.out.println("Đã xóa thành công");
			} else if (choice == 5) // Tìm kiếm bệnh nhân theo mã bệnh nhân
			{
				System.out.println("Nhập mã bệnh nhân cần tìm: ");
				String id = sc.nextLine();
				BENHNHAN kq = list.timKiemBenhNhan(id);
				System.out.println(kq != null ? kq : "Không tìm thấy bênh nhân");
			} else if (choice == 6) // Tính tổng tiền viện phí cho từng loại bệnh nhân
			{
				System.out.println("Tổng tiền BNBHYT: " + list.tongTienBNBHYT());
				System.out.println("Tổng tiền BNBHXH: " + list.tongTienBNBHXH());
			} else if (choice == 7) // Đọc thông tin bệnh nhân từ file
			{
				System.out.println("Nhập đường dẫn tới file cần đọc: ");
				String fileName = sc.nextLine();
				list.readFile(fileName);
			} else if (choice == 8) // Ghi thông tin bệnh nhân vào file
			{
				System.out.println("Nhập đường dẫn tới tên file cần ghi: ");
				String fileName = sc.nextLine();
				list.writeFile(fileName);
			}
			
			System.out.println("\nPress Enter key to continue...");
			sc.nextLine();

		} while (choice >= 0 && choice <= 8);

		sc.close();
	}
}
