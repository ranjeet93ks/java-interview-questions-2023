package com.interviews.questions.onenetwork;

import java.util.*;

public class OneNetworkInterview {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Parent child = new Child();
		child.print(parent);// parent class

		int j = 0;
		for (int i = 0; i < 100; i++) {
			j = j++;
		}
		System.out.println(j);// 0

	}

}

class Parent {

	public void print(Parent p) {
		System.out.println("parent class");
	}
}

class Child extends Parent {
	public void print(Child c) {
		System.out.println("child class");
	}
}

//implement equals and hashcode
class Student {
	int id;
	String name;
	Map<String, Integer> map;

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		boolean nameEquals = (this.name == null && other.name == null)
				|| (this.name != null && this.name.equals(other.name));
		return this.id == other.id && nameEquals;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
}
