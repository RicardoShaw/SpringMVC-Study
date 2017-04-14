package com.ricardo.object;

public class Test3 {
	public static void main(String[] args){
		Animal a = new Dog();
		a.sayHi();// i'm bob wang;
		
		BullDog a1 =		new BullDog();
		a1.sayHi();
		a1.sayHi1();
		Animal b = a1;
		b.sayHi(); // i'm Mike wang;
		Dog dog = (Dog) b;
		dog.sayHi();// I'm MIke wang;
		check(dog);//I'm Mike.
		BullDog bulldog = (BullDog) b;
		check(bulldog);//I'm Mike
	}
	
	public static void check(Dog dog){
		System.out.println("check dog"+dog.getName()+".");
	}
	public static void check(BullDog dog){
		System.out.println("check Bulldog"+dog.getName()+".");
	}
	
}


interface Animal{
	public void sayHi();
	public String getName();
}

class Dog implements Animal{
	
	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("i'm"+getName()+bark());
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "bob";
	}
	
	private String bark(){
		return "wang";
	}
	
}

class BullDog extends Dog{
	@Override
	public String getName(){
		return "MIKE";
	}
	
	

	private String bark(){
		return "wow";
	}
	
	
	public void sayHi1() {
		// TODO Auto-generated method stub
		System.out.println("i'm"+getName()+bark());
	}
	
	
}
