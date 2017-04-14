package com.ricardo.object;

public class Test4 {
	public static void main(String[] args){
		System.out.println(digui(30));
		
		
		char a = '的';//中文是完整的16位unicode编码
		char b = 'd';//英文是一般的8位unicode编码
		
		System.out.println();
	}
	
	public static int digui(int i){
		if(i == 0){
			return 0;
		}
		
		
		if(i==1){
			return 1;
		}
		
		
		int a = i-2;
		int b = i-1;
		return digui(a)+digui(b);
	}
}
