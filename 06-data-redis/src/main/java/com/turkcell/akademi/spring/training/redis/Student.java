package com.turkcell.akademi.spring.training.redis;

import java.io.Serializable;

public class Student implements Serializable {

	private Long id;
	private String name;
	
	public Student() {
	}

	public Student(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("id : %d, name: %s", id, name);
	}

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
	
	
}
