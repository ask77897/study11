package project11;

public class class44_Triangle extends class44_Math{
    
    public static int triangle(int a, int b) {//a=밑변, b=높이
		return a*b/2;
	}
    @Override
    public String toString() {
    	a = sc.nextInt();
    	b = sc.nextInt();
    	c = a*b/2;
    	return "삼각형의 넓이: "+c+", 밑변: "+a+", 높이: "+b;
    }
}
