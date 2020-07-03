package com.bit.movie;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Director extends Person{


	
	
	public Director(String name, int age, String sex, int id, LocalDateTime DOB, int height, String[] awards) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = id;
		this.DOB = DOB;
		this.height = height;
		this.awards = awards;
	}
	
	public Director(Person arg) {
		this.name = arg.getName();
		this.age = arg.getAge();
		this.sex = arg.getSex();
		this.id = arg.getId();
		this.DOB = arg.getDOB();
		this.height = arg.getHeight();
		this.awards = arg.getAwards();
	}
	


	
	
	
	
	
}
