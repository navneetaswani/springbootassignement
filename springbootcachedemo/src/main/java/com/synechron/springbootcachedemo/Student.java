package com.synechron.springbootcachedemo;

public class Student {
	
	public Student(Long id, String name, String college) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
	}
	public Long id;
	public String name;
	public String college;

	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

}
