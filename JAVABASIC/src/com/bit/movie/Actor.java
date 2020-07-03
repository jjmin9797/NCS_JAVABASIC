package com.bit.movie;

import java.time.LocalDateTime;

public class Actor extends Person{

	
	
	public Actor(String name, int age, String sex, int id, LocalDateTime DOB, int height, String[] awards) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = id;
		this.DOB = DOB;
		this.height = height;
		this.awards = awards;
	}
	
	public Actor(Person arg) {
		this.name = arg.getName();
		this.age = arg.getAge();
		this.sex = arg.getSex();
		this.id = arg.getId();
		this.DOB = arg.getDOB();
		this.height = arg.getHeight();
		this.awards = arg.getAwards();
	}

	
}
