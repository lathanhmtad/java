package main;

import java.util.Date;

public class Fresher extends Candidate {
	private String graduationYear;
	private String graded;
	private String graduationSchool;

	public Fresher() {
		super();
	}

	public Fresher(String graduationYear, String graded, String graduationSchool) {
		super();
		this.graduationYear = graduationYear;
		this.graded = graded;
		this.graduationSchool = graduationSchool;
	}

	public Fresher(String fullName, Date dob, String address, String hometown, String phone, String email,
			String graduationYear, String graded, String graduationSchool) {
		super(fullName, dob, address, hometown, phone, email);
		this.graduationYear = graduationYear;
		this.graded = graded;
		this.graduationSchool = graduationSchool;
	}

	public String getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(String graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getGraded() {
		return graded;
	}

	public void setGraded(String graded) {
		this.graded = graded;
	}

	public String getGraduationSchool() {
		return graduationSchool;
	}

	public void setGraduationSchool(String graduationSchool) {
		this.graduationSchool = graduationSchool;
	}

	@Override
	public String toString() {
		return "Fresher [graduationYear=" + graduationYear + ", graded=" + graded + ", graduationSchool="
				+ graduationSchool + ", FullName=" + getFullName() + ", Dob=" + getDob() + ", Address=" + getAddress()
				+ ", Hometown=" + getHometown() + ", Phone=" + getPhone() + ", Email=" + getEmail() + "]";
	}
}
