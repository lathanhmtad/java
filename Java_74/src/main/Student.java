package main;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Comparable<Student>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private int yearOfBirth;
	private float mediumScore;
	
	
	
	public Student(String id) {
		super();
		this.id = id;
	}

	public Student(String id, String name, int yearOfBirth, float mediumScore) {
		super();
		this.id = id;
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.mediumScore = mediumScore;
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

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public float getMediumScore() {
		return mediumScore;
	}

	public void setMediumScore(float mediumScore) {
		this.mediumScore = mediumScore;
	}

	@Override
	public String toString() {
		return "Sinh viên [id = " + id + ", name = " + name + ", năm sinh = " + yearOfBirth + ", điểm trung bình = " + mediumScore
				+ "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return id.compareTo(o.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, mediumScore, name, yearOfBirth);
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
		return Objects.equals(id, other.id);
	}

	
	
	
	
}
