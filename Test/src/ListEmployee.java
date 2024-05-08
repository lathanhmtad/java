import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;

public class ListEmployee {
	
	private Hashtable<String, Employee> list;

	public ListEmployee() {
		list = new Hashtable<String, Employee>();
	}
	
	public void inputData() {
		char  style = ' ', t = 'y';
		Scanner sc = new Scanner(System.in);
		while (t == 'y' || t =='Y') {
			System.out.print("Nhap e (Experience), f (Fresher), i (Intern): ");
			style = sc.nextLine().charAt(0);
			if (style == 'e' || style == 'f' || style == 'i') {
				Employee employee;
				switch (style) {
					case 'e':
						employee = new Experience();
						break;
					case 'f':
						employee = new Fresher();
						break;
					case 'i':
						employee = new Intern();
						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + style);
				}
				employee.inputData();
				this.list.put(employee.getCode(), employee);
			}
			System.out.print("Nhap y/Y de tiep tuc, bat ky de ket thuc: ");
			t = sc.nextLine().charAt(0);
		}
		
	}
	
	public Employee findEmployee (String code) {
		return this.list.get(code);
	}
	
	public void removeEmployee (String code) {
		this.list.remove(code);
	}
	
	public void printData() {
		for (Employee employee : this.list.values()) {
			employee.printData();
		}
	}
	
	public void readFile(String path) {
		File file = new File(path);
		try {
			if(!file.exists())
			{
				System.out.println("File khong ton tai hoac duong dan sai!");
				return;
			}
			BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while((line = br.readLine()) != null)
			{
				String delim = ", ";
				String[] data = line.split(delim);
				String type = data[0];
				String id = data[1];
				String fn = data[2];
				String dobStr = data[3];
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date dob = null;
				try {
					dob = sdf.parse(dobStr);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				String address = data[4];
				String hometown = data[5];
				String sdt = data[6];
				String mail = data[7];
				if(type.equals("e")) {
					int numExp = Integer.parseInt(data[8]);
					String[] skillData = data[9].split(" ");
					ArrayList<String> skills = new ArrayList<String>();
					for(int i = 0; i < skillData.length; i++) {
						skills.add(skillData[i]);
					}
					String workspace = data[10];
					Employee e = new Experience(id, fn, dob, address, hometown, sdt, mail, numExp, skills, workspace);
					list.put(id, e);					
				}
				else if(type.equals("f")) {
					int graduationYear = Integer.parseInt(data[8]);
					String graduationSchool = data[9];					
					String grad = data[10];					
					Employee e = new Fresher(id, fn, dob, address, hometown, sdt, mail, graduationYear, graduationSchool, grad);					
					list.put(id, e);
				} 
				else if(type.equals("i")) {
					String specialized = data[8];
					String semester = data[9];					
					String expected = data[10];
					Date expectedDate = null;
					try {
						expectedDate = sdf.parse(expected);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}					
					Employee e = new Intern(id, fn, dob, address, hometown, sdt, mail, specialized, semester, expectedDate);					
					list.put(id, e);
				}
			}			
			System.out.println("Da doc du lieu thanh cong tu file!");			
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("resource")
	public void writeFile(String path)
	{
		File file = new File(path);
		try {
			if(!file.exists()) {
				System.out.println("File khong ton tai hoac duong dan sai, toi se tao file moi cho ban voi duong dan: " + path);
				boolean isSuccess = file.createNewFile();
				if(!isSuccess) {
					System.out.println("Khong the tao file nay!");
					return;
				}
			}
			PrintWriter pw = new PrintWriter(new File(path));
			String strinfor = "";
			String strerr = "";
			DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
			for (Employee employee : this.list.values()) {
				if (employee instanceof Experience) {
					strinfor += "e, ";
					strinfor += employee.code + ", " 
					+ employee.fullName + ", "
					+ d.format(employee.birthday) + ", "
					+ employee.address + ", "
					+ employee.hometown + ", "
					+ employee.phoneNumber + ", "
					+ employee.email + ", "
					+ ((Experience) employee).getNumExp() + ", "
					+ ((Experience) employee).getSkill() + ", "
					+ ((Experience) employee).getWorkspace() + "\r\n";
				} 
				else 
					if (employee instanceof Fresher) {
						strinfor += "f, ";
						strinfor += employee.code + ", " 
						+ employee.fullName + ", "
						+ d.format(employee.birthday) + ", "
						+ employee.address + ", "
						+ employee.hometown + ", "
						+ employee.phoneNumber + ", "
						+ employee.email + ", "
						+ ((Fresher) employee).getGraduationYear() + ", "
						+ ((Fresher) employee).getGraduationSchool() + ", "
						+ ((Fresher) employee).getGrad() + "\r\n";
					} 
					else 
						if (employee instanceof Intern) {
							strinfor += "i, ";
							strinfor += employee.code + ", " 
							+ employee.fullName + ", "
							+ d.format(employee.birthday) + ", "
							+ employee.address + ", "
							+ employee.hometown + ", "
							+ employee.phoneNumber + ", "
							+ employee.email + ", "
							+ ((Intern) employee).getSpecialized() + ", "
							+ ((Intern) employee).getSemester() + ", "
							+ d.format(((Intern) employee).getExpectedDate()) + "\r\n";
						} 
						else
							throw new IllegalArgumentException("Unexpected value");
			}
			pw.write(strinfor);
			pw.flush();
			pw.close();
			System.out.println("Da ghi du lieu thanh cong xuong file");
		} 
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
