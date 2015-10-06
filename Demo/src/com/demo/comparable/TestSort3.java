package com.demo.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort3 {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Shrikant", 24));
		al.add(new Student(106, "Nitesh", 28));
		al.add(new Student(104, "Sachin", 26));

		Collections.sort(al);
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollNo +" "+st.name +" "+st.age);
			

		}


	}

}
