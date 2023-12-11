package com.dong.eun;

public class Study3 {
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		int num1=30;
		long num2 = 50L;
		//형변환
		num2 = num1; //자동형변환(묵시적형변환), 값의 변화가  x
		num1 = (int)num2; //강제형변환 (명시적형변환), 값의 변화가 있을 수 있음
		
		float f1 = num2;
		num2 = (long)f1;
		
		num1 = 33;
		num1 = num1 /2;
		f1 = 33/ 2.0F;
		System.out.println(num1);
		System.out.println(f1);
		
		System.out.println("======================");
		int sum = 100;
		int count = 3;
		
		double result=0;
		result =  (double)sum/count;
		
		result = result*100;
		sum = (int)result;
		result = sum/100.0;
		
		System.out.println(result);
		System.out.println(sum);
		
		
		System.out.println("======================");
		
		char ch = 'A';
		int num = ch;
		num=num+1;
		ch=(char)num;
		System.out.println(num);
		System.out.println(ch);
		System.out.println("프로그램의 종료");
	}
}
