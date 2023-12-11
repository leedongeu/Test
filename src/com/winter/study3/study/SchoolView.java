package com.winter.study3.study;

public class SchoolView {
	//view
	//학생들의 정보를 받아서 학생 수 만큼 출력
	public static void main(String[] args) {
		int a;
		a= 1;
		System.out.println(a+1); // 2
		
		a= 2;
		System.out.println(a+1);  //3
		
		
		double b = 1.1;
		System.out.println(b+1.1);
		
		b = 2.1;
		System.out.println(b+1.1);
		
		
		String first = "coding";
		System.out.println(first+"" + "everybody");
		
		String a1, b1;
		a1="coding";
		b1=" everybody";
		System.out.println(a1+b1);
		
		for(int n=0;n<10;n++) {
			if(n%2==0) {
				System.out.println(n);
			}
		}
		//0-10미만의 숫자 중 짝수만 출력
		//단, if문 사용 x
		for(int n=0;n<10;n=n+2) {
			System.out.println(n);
			//n++;
		}
		//a~z 출력
		for(int e='a';e<='z';e++) {
			System.out.println((char)e);
		}
		
		
	}
		
	

	
}
