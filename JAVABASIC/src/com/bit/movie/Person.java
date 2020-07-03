package com.bit.movie;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Person {
	
	protected String name;
	protected int age;
	protected String sex; // T : 남자 F :여자
	protected int id;
	protected LocalDateTime DOB;
	protected int height;
	protected String[] awards; // 수상경력
	
	public Person() {
		
	}//이름 나이 성별 아이디 생일 키 수상경력
	public Person(String name, int age, String sex, int id, LocalDateTime DOB, int height, String[] awards) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = id;
		this.DOB = DOB;
		this.height = height;
		this.awards = awards;
	}
	
	public Person(Person arg) {
		this.name = arg.getName();
		this.age = arg.getAge();
		this.sex = arg.getSex();
		this.id = arg.getId();
		this.DOB = arg.getDOB();
		this.height = arg.getHeight();
		this.awards = arg.getAwards();
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getDOB() {
		return DOB;
	}
	public void setDOB(LocalDateTime dOB) {
		DOB = dOB;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String[] getAwards() {
		return awards;
	}
	public void setAwards(String[] awards) {
		this.awards = awards;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", id=" + id + ", DOB=" + DOB + ", height="
				+ height + ", awards=" + Arrays.toString(awards) + "]";
	}
	
	
	
	
	
	
}