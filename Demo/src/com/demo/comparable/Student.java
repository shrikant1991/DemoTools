package com.demo.comparable;

public class Student implements Comparable<Object> {

	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Object obj) {
		Student std = (Student) obj;
		if(age==std.age)
			return 0;
		else if (age>std.age) 
			return 1;
		else
			return -1;
	}

}
