import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Intern extends Employee {
	private String specialized;
	private String semester;
	private Date expectedDate;
	
	public Intern() {
		super();
	}

	public Intern(String code, String fullName, Date birthday, String address, String hometown, String phoneNumber,
			String email, String specialized, String semester, Date expectedDate) {
		super(code, fullName, birthday, address, hometown, phoneNumber, email);
		this.specialized = specialized;
		this.semester = semester;
		this.expectedDate = expectedDate;
	}

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Date getExpectedDate() {
		return expectedDate;
	}

	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}
	
	public void inputData() {
		super.inputData();
		try {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
			System.out.print("Enter specialized: ");
			this.specialized = sc.nextLine();
			System.out.print("Enter semester: ");
			this.semester = sc.nextLine();
			System.out.print("Enter expected date: ");
			this.expectedDate = d.parse(sc.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void printData() {
		DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
		super.printData();
		System.out.println("Specialized: " + this.specialized);
		System.out.println("Semester: " + this.semester);
		System.out.println("Expected date: " + d.format(this.expectedDate));
		System.out.println();
	}
}
