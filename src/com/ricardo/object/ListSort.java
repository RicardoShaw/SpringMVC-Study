package com.ricardo.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



public class ListSort {
	@SuppressWarnings("unchecked")
	public static void main(String [] args){
		Student zlj = new Student("丁小雨",21);
		Student dxy = new Student("赵四",22);
		Student cjc = new Student("张三",11);
		Student lgc = new Student("刘武",19);
		
		java.util.List<Student> studentlist = new ArrayList<Student>();
		studentlist.add(zlj);
		studentlist.add(dxy);
		studentlist.add(cjc);
		studentlist.add(lgc);
		
		
		Collections.sort(studentlist,new studentComparator());
		
		
		Iterator<Student> iter = studentlist.iterator();
		
		while(iter.hasNext()){
			Student student =  iter.next();
			student.printInfo();
		}
		
	}
	
	
	
	
	
	

}


class studentComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	    if (o1==null) {
	        return 1;
	      } else if (o2 == null) {
	        return -1;
	      }
	    
	   Student one = (Student) o1;
	   Student two = (Student) o2;
	   
	   String one_name = one.getName();
	   String two_name = two.getName();
	   
	   return one_name.compareTo(two_name) ;
	    

	}


	
}

class Student{
	
	private String name;
	private int age;
	
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void printInfo(){
		System.out.println(this.name+" "+this.age);
	}
	
}