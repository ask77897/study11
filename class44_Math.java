package project11;

import java.util.Scanner;

public class class44_Math {
	Scanner sc = new Scanner(System.in);
	double p = Math.PI;
	double x;
	double y;
	double z;
	int a;
	int b;
	int c;
	// public static int add(int a, int b) {
	// 	return a+b;
	// }
	
	// public static double add(double a, double b) {
	// 	return a+b;
	// }
	// public static int add(int a, int b, int c) {
	// 	return a+b+c;
	// }
	
	// public static double add(double...ds) {//double 여러개 전달
	// 	double sum = 0.0;
		
	// 	for(double d : ds) {//객체 리스트 덩어리를 할 때, ds를 하나씩 꺼내와서 d에 넣을거야.
	// 		sum += d;
	// 	}
	// 	return sum;
	// }
	
	
	public static double circle(double a) {//a=반지름
		return  a*a*Math.PI;
	}
	@Override
	public String toString() {
		a = sc.nextInt();
		x = Math.pow(a, 2)*p;
		return "반지름으로 원의 넓이: "+x+", 반지름: "+a;
	}
	
	public static int square(int a, int b) {//a=한 변의 길이, b=다른 한 변의 길이
		return a*b;
	}
//	@Override
//	public String toString() {
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = a*b;
//		return "직사각형의 넓이: "+c+", 한 변의 길이: "+a+", 다른 한 변의 길이: "+b;
//	}
	public static int triangle(int a, int b) {//a=밑변, b=높이
		return a*b/2;
	}
	

	//--------------------------------
	private double area;
	
	Shape() {
		area = 0;
	}
	
	Shape(double area) {
		this.area = area;
	}
	
	double getArea() {
		return area;
	}
	
	void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "넓이는 " + area + "입니다.";
	}






	
}
//도형 넓이 계산 -> 원, 사각형(직사각, 정사각, 마름모, 사다리꼴), 삼각형(이등변, 정삼각형, 예각, 둔각), 오각형
//사각형 변의 길이를 몇개 입력할지?, 정수, 실수, 15cm, 80mm, String?
//
