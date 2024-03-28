package com.Students;

public class Student {
	private int sId;
	private String sNmae;
	private int sAge;	

	public Student() {
		super();
	}
	public Student(int sId, String sNmae, int sAge) {
		super();
		this.sId = sId;
		this.sNmae = sNmae;
		this.sAge = sAge;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsNmae() {
		return sNmae;
	}
	public void setsNmae(String sNmae) {
		this.sNmae = sNmae;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sNmae=" + sNmae + ", sAge=" + sAge + "]";
	}

}
