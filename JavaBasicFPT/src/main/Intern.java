package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Intern extends Candidate {
	private String specialized;
	private String semester;
	private String school;
	private Date expectedDate;

	public Intern() {
		super();
	}

	public Intern(String specialized, String semester, String school, Date expectedDate) {
		super();
		this.specialized = specialized;
		this.semester = semester;
		this.school = school;
		this.expectedDate = expectedDate;
	}

	public Intern(String fullName, Date dob, String address, String hometown, String phone, String email,
			String specialized, String semester, String school, Date expectedDate) {
		super(fullName, dob, address, hometown, phone, email);
		this.specialized = specialized;
		this.semester = semester;
		this.school = school;
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

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getExpectedDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String res = sdf.format(expectedDate);
		return res;
	}

	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}

	@Override
	public String toString() {
		return "Intern [specialized=" + specialized + ", semester=" + semester + ", school=" + school
				+ ", expectedDate=" + getExpectedDate() + ", FullName=" + getFullName() + ", Dob=" + getDob() + ", Address="
				+ getAddress() + ", Hometown=" + getHometown() + ", Phone=" + getPhone() + ", Email=" + getEmail()
				+ "]";
	}

}
