import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {
	protected String code;
	protected String fullName;
	protected Date birthday;
	protected String address;
	protected String hometown;
	protected String phoneNumber;
	protected String email;
	
	public Employee() {
		super();
	}

	public Employee(String code, String fullName, Date birthday, String address, String hometown, String phoneNumber, String email) {
		super();
		this.code = code;
		this.fullName = fullName;
		this.birthday = birthday;
		this.address = address;
		this.hometown = hometown;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void inputData() {
		try {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
			System.out.print("Enter code: ");
			this.code = sc.nextLine();
			System.out.print("Enter full name: ");
			this.fullName = sc.nextLine();
			System.out.print("Enter birthday: ");
			this.birthday = d.parse(sc.nextLine());
			System.out.print("Enter address: ");
			this.address = sc.nextLine();
			System.out.print("Enter hometown: ");
			this.hometown = sc.nextLine();
			System.out.print("Enter phone number: ");
			this.phoneNumber = sc.nextLine();
			System.out.print("Enter email: ");
		    String strEmail = sc.nextLine();
			EmailCheck emailCheck = new EmailCheck();
			emailCheck.checkEmail(strEmail);
			this.email = strEmail;
			
		}
		catch (ParseException pe) {
			pe.getMessage();
		}
		catch (EmailException ee) {
			ee.getMessage();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	public void printData() {
		try {
			SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("Code: " + this.code);
			System.out.println("Full name: " + this.fullName);
			System.out.println("Birthday: " + d.format(this.birthday));
			System.out.println("Address: " + this.address);
			System.out.println("Hometown: " + this.hometown);
			System.out.println("Phone number: " + this.phoneNumber);
			System.out.println("Email: " + this.email);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
