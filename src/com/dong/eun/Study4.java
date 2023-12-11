package com.dong.eun;

public class Study4 {
	public static void main(String [] args) {
		// 연산자
		//+,-,*,/,%
		//1200%1000
		//무인편의점
		//물건의 합계 값
		int total=28640;
		//손님이 낸돈
		int money = 50000;
		//거스름 돈 계산
		int jandon = money-total;
		
		//만원짜리 갯수를 담을 변수
		int man= jandon / 10000;
		//천원짜리 갯수를 담을 변수
		int chon=jandon%10000/1000;
		//백원짜리 갯수를 담을 변수
		int baeg=jandon%10000%1000/100;
		//십원짜리 갯수를 담을 변수
		int sib=jandon%10000%1000%100/10;
		
		
		
		
		//계산
		System.out.println(jandon);
		System.out.println("만원 : "+man+ "개"); //2
		System.out.println("천원 : "+chon+ "개");//1
		System.out.println("백원 : "+baeg+ "개");//1
		System.out.println("십원 : "+sib+ "개");//1
	}
}
