package com.ricardo.object;

public class Test2 {
	public static void change1(Person p){
		p.setName("lisi");
	}
	public static void change2(Person p){
		Person person = new Person();
		person.setName("zhaoliu");
		p = person;
	}
	
	public static void main(String[] args){
		Person p = new Person();
		p.setName("zhangsan");
		change1(p);
		System.out.println(p.getName());
		
		
		Person p1 = new Person();
		p1.setName("wangwu");
		change2(p1);
		System.out.println(p1.getName());
	}
	
	
	
	
	
	
	
}

class Person{
	private String name;
	
	public Person(String name){
		this.name = name;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}