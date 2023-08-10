package project11;

public class class44_Square extends class44_Math{
    public static int square(int a, int b){//a=한 대각선의 길이, b=다른 대각선의 길이
        return a*b*1/2;
    }
    public static int square(int a) {//a=한 변의 길이
		return a*a;
	}
    public static int square(int a, int b, int h){//a=윗변, b=아랫변, h=높이
        return ((a+b)*h)/2;
    }
    @Override
    public String toString() {
    	a = sc.nextInt();
    	b = sc.nextInt();
    	c = a*b*1/2;
    	return "마름모의 넓이: "+c+", 한 대각선의 길이: "+a+", 다른 대각선의 길이: "+b;	
    }
}
class class44_Square2 extends class44_Square{
    @Override
    public String toString() {
    	a = sc.nextInt();
    	c = (int) Math.pow(a, 2);
    	return "정사각형의 넓이: "+c+", 한 변의 길이: "+a;
    }
    
    public String toString1() {
    	int h = sc.nextInt();
    	a = sc.nextInt();
    	b = sc.nextInt();
    	c = ((a+b)*h)/2;
    	return "사다리꼴의 넓이: "+c+", 윗변의 길이: "+a+", 아랫변의 길이: "+b+", 높이: "+h;
    }
    

//-----------------------------------------------------
    private double side;
	
	Rectangle() {
		
	}
	
	Rectangle(double side) {
		super(side*side);
	}
	
	Rectangle(double side1, double side2) {
		super(side1*side2);
	}
	
	Rectangle(double side1, double side2, double side3, double side4) {
		if(side1 == side2) {
			super.setArea(side1*side3);
		}
		else {
			super.setArea(side1*side2);
		}
	}
	
	Rectangle(String side) { //15cm -> 225 8미터
		for(int i=0; i<side.length(); i++) {
			if(side.charAt(i) < 65) {
				side = side.substring(0,i); //"15"
			}
		}
		int num = 0;
		for(int i=0; i < side.length(); i++) {
			num += (int) side.charAt(i) - 48;
			num *= 10;
		}
		num /= 10;
		
		super.setArea(num*num);
	}
	
	@Override
	public String toString() {
		return "넓이는 " + super.getArea() + "입니다.";
	}






}
