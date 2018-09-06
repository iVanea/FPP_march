package quiz0;

import java.time.LocalDate;

/**
 * Represents application information for a prospective graduate student
 * submitted to a university.
 */
public class ApplicantForGradSchool {
	private String name;
	private LocalDate bachelorsGraduationDate;
	private float gpa;
	private int classRank;
	public ApplicantForGradSchool(String name, LocalDate gradDate, float gpa, int rank) {
		this.name = name;
		this.bachelorsGraduationDate = gradDate;
		this.gpa = gpa;
		this.classRank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBachelorsGraduationDate() {
		return bachelorsGraduationDate;
	}
	public void setBachelorsGraduationDate(LocalDate bachelorsGraduationDate) {
		this.bachelorsGraduationDate = bachelorsGraduationDate;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public int getClassRank() {
		return classRank;
	}
	public void setClassRank(int classRank) {
		this.classRank = classRank;
	}
	public String toString() {
		return "(" + name + ": " + gpa + ", " + classRank + ", " + bachelorsGraduationDate + ")";
	}
	
}
