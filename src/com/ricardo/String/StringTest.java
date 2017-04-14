package com.ricardo.String;

public class StringTest {
	
	
	public void testToStringAndIntern(){
		
		/**
		 * String类的intern()方法可以向String Pool中动态添加对象,
		 * 调用intern方法时，如果池中已经包含一个等于此String对象的字符串(通过equals(Object)方法确定)，则返回池中的字符串。
		 * 否则，将此String对象添加到池中，并且返回此String对象的引用。
		 */
		String s1 = new StringBuilder("go")
    	.append("od").toString();
	System.out.println(s1.intern() == s1); //true
	String s2 = new StringBuilder("ja")
		.append("va").toString();
	System.out.println(s2.intern() == s2); //(因为jvm在运行的时候就已经把java字符串加入到字符串常量池里面了,所以s2其实深copy了一个java字符串对象,而不是对字符串常量池里面的引用)false
	
	String s3 = new StringBuilder("test").append("hehe").toString();
	System.out.println(s3.intern() == s3);
	
	}
	
	
	public void test2(){
		String str1 = "HelloWorld"; //str1指向方法区的HelloWorld字符串的引用
		String str2 = new String("HelloWorld");//str2指向堆上的HelloWorld字符串对象的引用
		String str3 = "Hello";
		String str4 = "World";
		String str5 = "Hello" + "World"; //等同于"HelloWorld"
		
		/**
		 * 字符串的+操作其本质是创建了StringBuilder对象进行append操作，
		 * 然后将拼接后的StringBuilder对象用toString方法处理成String对象
		 */
		String str6 = str3 + str4;  //等于在堆中创建了一个新的HelloWorld字符串对象
		System.out.println( str1 == str2);    //(方法区的HelloWorld与堆上的HelloWorld不是同一个引用)false
		System.out.println( str1 == str5); 		// true
		System.out.println( str1 == str6);		//false
		System.out.println( str1 == str6.intern()); //true
		System.out.println( str2 == str2.intern());	//false
		System.out.println( str2 == str6); //false
		
		
	
	}
	
	
	
	public static void main(String [] args){
		
		StringTest test = new StringTest();
		test.testToStringAndIntern();
		test.test2();
		
	}
	
}
