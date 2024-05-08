package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidate {
	private String fullName;
	private Date dob;
	private String address;
	private String hometown;
	private String phone;
	private String email;

	public Candidate() {
		super();
	}

	public Candidate(String fullName, Date dob, String address, String hometown, String phone, String email) {
		super();
		this.fullName = fullName;
		this.dob = dob;
		this.address = address;
		this.hometown = hometown;
		this.phone = phone;
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDob() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String res = sdf.format(dob);
		return res;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Candidate [fullName=" + fullName + ", dob=" + getDob() + ", address=" + address + ", hometown="
				+ hometown + ", phone=" + phone + ", email=" + email + "]";
	}
}
