package main;

import java.util.ArrayList;
import java.util.Date;

public class Experience extends Candidate {
	private double numExp;
	private ArrayList<String> skills;
	private String workspace;

	public Experience() {
		super();
	}

	public Experience(double numExp, ArrayList<String> skills, String workspace) {
		super();
		this.numExp = numExp;
		this.skills = skills;
		this.workspace = workspace;
	}

	public Experience(String fullName, Date dob, String address, String hometown, String phone, String email,
			double numExp, ArrayList<String> skills, String workspace) {
		super(fullName, dob, address, hometown, phone, email);
		this.numExp = numExp;
		this.skills = skills;
		this.workspace = workspace;
	}

	public double getNumExp() {
		return numExp;
	}

	public void setNumExp(int numExp) {
		this.numExp = numExp;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public String getWorkspace() {
		return workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
	}

	@Override
	public String toString() {
		return "Experience [numExp=" + numExp + ", skills=" + skills + ", workspace=" + workspace + ", fullName="
				+ getFullName() + ", dob=" + getDob() + ", Address=" + getAddress() + ", Hometown=" + getHometown()
				+ ", Phone=" + getPhone() + ", Email=" + getEmail() + "]";
	}
}