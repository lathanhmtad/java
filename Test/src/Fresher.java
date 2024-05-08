import java.util.Date;
import java.util.Scanner;

public class Fresher extends Employee {
	private int graduationYear;
	private String graduationSchool;
	private String grad;
	
	public Fresher() {
		super();
	}

	public Fresher(String code, String fullName, Date birthday, String address, String hometown, String phoneNumber,
			String email, int graduationYear, String graduationSchool, String grad) {
		super(code, fullName, birthday, address, hometown, phoneNumber, email);
		this.graduationYear = graduationYear;
		this.graduationSchool = graduationSchool;
		this.grad = grad;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getGraduationSchool() {
		return graduationSchool;
	}

	public void setGraduationSchool(String graduationSchool) {
		this.graduationSchool = graduationSchool;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}
	
	public void inputData() {
		super.inputData();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter graduate year: ");
		this.graduationYear = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter graduate school: ");
		this.graduationSchool = sc.nextLine();
		System.out.print("Enter grad: ");
		this.grad = sc.nextLine();
	}
	
	public void printData() {
		super.printData();
		System.out.println("Graduate year: " + this.graduationYear);
		System.out.println("Graduate school: " + this.graduationSchool);
		System.out.println("Grad: " + this.grad);
		System.out.println();
	}
}
