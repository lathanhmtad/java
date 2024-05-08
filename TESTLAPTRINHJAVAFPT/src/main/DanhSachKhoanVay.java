package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Hashtable;
import java.util.Set;

public class DanhSachKhoanVay {
	private Hashtable<String, KhoanVay> hashTable;

	public DanhSachKhoanVay() {
		super();
		hashTable = new Hashtable<String, KhoanVay>();
	}

	public void addKhoanVay(KhoanVay kv) {
		hashTable.put(kv.getId(), kv);
	}

	public void readFile(String path) {
		File file = new File(path);

		if (!file.exists()) {
			System.out.println("File không tồn tại!");
			return;
		}
		try {

			BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while ((line = br.readLine()) != null) {
				String delim = ", ";
				String[] data = line.split(delim);

				int type = Integer.parseInt(data[0]);

				String id = data[1];
				String fullname = data[2];
				String cccd = data[3];
				String dob = data[4];
				String address = data[5];
				String sdt = data[6];
				double giaTriKhoanVay = Double.parseDouble(data[7]);
				String kyHanVay = data[8];
				String laiSuat = data[9];
				String mucDichVay = data[10];
				String phiPhat = data[11];

				// Khoản vay thế chấp nhà
				if (type == 1) {
					String chungNhan = data[12];
					String ngayChapQuyen = data[13];
					String chuSoHuu = data[14];
					double giaTri = Double.parseDouble(data[15]);

					KhoanVay kv = new VayTheChapNha(id, fullname, cccd, dob, address, sdt, giaTriKhoanVay, kyHanVay,
							laiSuat, mucDichVay, phiPhat, chungNhan, ngayChapQuyen, chuSoHuu, giaTri);
					addKhoanVay(kv);
				} else if (type == 2) { // Khoản vay thế chấp ô tô
					String bienSoXe = data[16];
					String loaiXe = data[17];
					String chuNhan = data[18];
					String soHopDong = data[19];
					double giaTri = Double.parseDouble(data[20]);
					String cavet = data[21];

					KhoanVay kv = new VayTheChapOTo(id, fullname, cccd, dob, address, sdt, giaTriKhoanVay, kyHanVay,
							laiSuat, mucDichVay, phiPhat, bienSoXe, loaiXe, chuNhan, soHopDong, giaTri, cavet);
					addKhoanVay(kv);
				} else if (type == 3) { // Khoản vay tín chấp
					String soHoKhau = data[21];
					String congTy = data[22];
					String noiLamViec = data[23];

					KhoanVay kv = new VayTinChap(id, fullname, cccd, dob, address, sdt, giaTriKhoanVay, kyHanVay,
							laiSuat, mucDichVay, phiPhat, soHoKhau, congTy, noiLamViec);
					addKhoanVay(kv);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Lỗi đọc File!");
			e.printStackTrace();
		}
		System.out.println("Đọc file thành công!");
	}

	public void exportErrorFile(String sourcePath, String destinationPath) {
		File fileSource = new File(sourcePath);
		File fileDestination = new File(destinationPath);

		if (!fileSource.exists() || !fileDestination.exists()) {
			System.out.println("Có một file không tồn tại!");
			return;
		}

		try {
			BufferedReader br = Files.newBufferedReader(fileSource.toPath(), StandardCharsets.UTF_8);
			PrintWriter pw = new PrintWriter(fileDestination);

			int i = 1;
			String line = null;
			while ((line = br.readLine()) != null) {
				String delim = ", ";
				String[] data = line.split(delim);

				int type = Integer.parseInt(data[0]);
				
				String dob = data[4];
				if (!CheckData.validDob(dob)) {
					pw.println("Dòng " + i + ": Sai định dạng ngày sinh");
				}

				String sdt = data[6];
				if (!CheckData.validPhoneNumber(sdt)) {
					pw.println("Dòng " + i + ": Sai định dạng số điện thoại");
				}

				double giaTriKhoanVay = Double.parseDouble(data[7]);
				if (!CheckData.validKhoanVay(giaTriKhoanVay)) {
					pw.println("Dòng " + i + ": Sai định dạng giá trị khoản vay");
				}

				if (type == 1) {
					String chungNhan = data[12];
					if (!CheckData.validChungNhanSuDungDat(chungNhan)) {
						pw.println("Dòng " + i + ": Sai định dạng mã giấy chứng nhận quyền sử dụng đất");
					}
				}

				i++;
			}

			pw.flush();
			pw.close();

			System.out.println("Đã ghi lỗi thành công dữ liệu xuống file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printData() {
		System.out.println("\n----THÔNG TIN DANH SÁCH CÁC KHOẢN VAY -------");
		Set<String> keySet = hashTable.keySet();

		for (String key : keySet) {
			KhoanVay kv = hashTable.get(key);
			kv.printData();
		}
	}
}
