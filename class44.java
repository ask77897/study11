package project11;

import java.util.Scanner;

public class class44 {

	public static void main(String[] args) {
//		System.out.println(class44_Math.add(1, 2));
//		System.out.println(class44_Math.add(1.2, 2.2));
//		System.out.println(class44_Math.add(1, 2, 3));
//		System.out.println(class44_Math.add(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7));
		class44_Math m1 = new class44_Math();
		class44_Circle c1 = new class44_Circle();
		class44_Circle c2 = new class44_Circle();
		class44_Square s1 = new class44_Square();
		class44_Square s2 = new class44_Square2();
		class44_Square s3 = new class44_Square();
		class44_Triangle t1 = new class44_Triangle();
		
//		System.out.println(m1);//반지름으로 원넓이
//		System.out.println(c1);//지름으로 원넓이
//		System.out.println(c2);//둘레, 반지름으로 원넓이
//		System.out.println(m1.toString(3));//직사각형 넓이
//		System.out.println(s1);//마름모 넓이
		System.out.println(s2);//정사각형 넓이
//		System.out.println(s1.toString(6,3));//사다리꼴넓이
//		System.out.println(t1);//삼각형
		
//		System.out.println(Math.sqrt(25));//제곱근(루트)
//		System.out.println(Math.cbrt(64));//세제곱근
//		System.out.println(Math.pow(256, 1.0/4.0));//세제곱근 이상
//		System.out.println(Math.pow(4, 3));//제곱(a=제곱할 숫자, b=제곱)
		
//		System.out.println(class44_Math.circle(3));//반지름으로 원넓이
//		System.out.println(class44_Circle.circle(3.5));//지름으로 원넓이
//		System.out.println(class44_Circle.circle(3.2, 4.5));//둘레, 반지름으로 원넓이
//		System.out.println(class44_Math.square(6, 3));//직사각형 넓이
//		System.out.println(class44_Square.square(5, 8));//마름모 넓이
//		System.out.println(class44_Square.square(5));//정사각 넓이
//		System.out.println(class44_Square.square(5, 6, 3));//사다리꼴 넓이
//		System.out.println(class44_Triangle.triangle(5, 6));//삼각형
		

		Circle circle1 = new Circle();
		Circle circle2 = new Circle(5);
		circle1.toArea();
		circle2.toArea();
		
		System.out.println(circle1);
		System.out.println(circle2);
		
		System.out.println((int) '0');
		
		Rectangle rectangle;

		
//		Scanner sc = new Scanner(System.in);
//		double x = Math.PI;
//
//		double y = sc.nextInt();
//		double z = sc.nextInt();
//		System.out.println(math.polymer(x,y,z));

	}

}

//class math{
//	public static double polymer(double x, double y, double a){
//		return (a*Math.pow(y, 2))/(4*Math.tan(x/a));
//	}
//}

//다형성N6b0b(Polymorphism)

//1. 메소드 오버로딩(Overloading)
//메소드를 선언할 때, 똑같은 이름 메소드 ex)생성자
//메소드 오버라이딩 -> 자식클래스에서 동일한 이름과 매개변수를 정의하여 부모 클래스의 메소드를 대처하는 것.
//메소드 오버로딩 -> 같은 이름의 메소드를 매개변수의 갯수, 타입, 순서 등의 차이를 이용하여 메소드 여러개 정의하는 것.

//모든 클래스가 상속받는 절대적인 클래스 -> java.lang.Object

//toString() : 객체의 문자열을 생성하는 메소드
//equals(Object obj) : 두 객체의 동등성 여부를 나타내는 메소드
//clone() : 객체의 복사본을 리턴하는 메소드
//finalize() : 객체가 메모리에서 해체될 때 실행되는 메소드
//getClass() : 클래스의 정보를 얻는 메소드
//notify() : 
//wait() : 객체가 바뀔 때까지 기다리는 메소드
//wait(long timeout) : 객체가 변경될 때까지 timeout 만큼 대기하는 메소드
