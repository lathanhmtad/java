package model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Student {
	private String id;
	private String name;
	private Province province;
	private Date dob;
	private boolean gender;
	private float math;
	private float physical;
	private float chemistry;
	
	public Student() {
		super();
		math = 0;
		physical = 0;
		chemistry = 0;
	}
	
	
	public Student(String id, String name, Province province, Date dob, boolean gender, float math, float physical, float chemistry) {
		super();
		this.id = id;
		this.name = name;
		this.province = province;
		this.dob = dob;
		this.gender = gender;
		this.math = math;
		this.physical = physical;
		this.chemistry = chemistry;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}


	public String getDateOfBirth() {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return formatter.format(dob);
	}
	
	public Date getDateOfBirth(String s)
	{
		setDateOfBirth(s);
		return dob;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dob = dateOfBirth;
	}
	
	public void setDateOfBirth(String str)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date date;
		try {
			date = formatter.parse(str);
			dob = new Date(date.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public boolean isGender() {
		return gender;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getGender()
	{
		return gender ? "Nam" : "Nữ";
	}
	
	public float getMath() {
		return math;
	}
	
	public void setMath(float math) {
		this.math = math;
	}
	
	public float getPhysical() {
		return physical;
	}
	
	public void setPhysical(float physical) {
		this.physical = physical;
	}
	
	public float getChemistry() {
		return chemistry;
	}
	
	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + province.getName() + ", dateOfBirth=" + dob
				+ ", gender=" + gender + ", math=" + math + ", physical=" + physical + ", chemistry=" + chemistry + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(chemistry, dob, gender, id, math, name, physical, province);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id.equals(other.getId());
	}
	
	
	
	
	
}
