package com.cg.spring.core.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
       private int sid;
       private String studentName;
       private Long phoneNumber;
       
       public Student() {
    	   super();
       }

	public Student(int sid, String studentName, Long phoneNumber) {
		super();
		this.sid = sid;
		this.studentName = studentName;
		this.phoneNumber = phoneNumber;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studentName=" + studentName + ", phoneNumber=" + phoneNumber + "]";
	}
       
}
