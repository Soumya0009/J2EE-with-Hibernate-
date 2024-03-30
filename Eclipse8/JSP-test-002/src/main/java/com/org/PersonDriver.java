package com.org;

public class PersonDriver {
	public static void main(String[] args) {
		Person p = new Person();
		p.setId(101);
		p.setName("Soumya");
		p.setAge(23);
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
}
