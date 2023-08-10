package project11;

public class class44_Circle extends class44_Math{
	
	
	public static double circle(double a, double b) {//a=둘레, b=반지름
		return a*0.5*b;
	}
	public static double circle(double a) {//a=지름
		return a*Math.PI*0.5*(a/2);
	}
	@Override
	public String toString() {
		super.toString();
		y = sc.nextDouble();
		x = y*p*0.5*(y/2);
		return "지름으로 원의 넓이: "+x+", 지름: "+y;
	}
//	@Override
//	public String toString() {
//		z = sc.nextDouble();
//		y = sc.nextDouble();
//		x = z*0.5*y;
//		return "둘레, 반지름으로 원의 넓이: "+x+", 둘레: "+z+", 반지름: "+y;
//	}
	

//--------------------------------------------------------
	private double radius;
	private static final double PI = 3.141592;
	
	Circle() {
		radius = 0;
	}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	void setRadius() {
		this.radius = radius;
	}
	
	double toArea() {
		double area = radius*radius*PI;
		super.setArea(area);
		return area;
	}
	
	int toArea(int radius) {
		int area = (int) (radius*radius*PI);
		super.setArea(area);
		return area;
	}
	
	double toArea(double radius) {
		double area = radius*radius*PI;
		super.setArea(area);
		return area;
	}
	
	@Override
	public String toString() {
		return "넓이는 " + super.getArea() + "입니다.";
	}	








}
