package project11;

public class class46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//@Override
//public boolean equals(Object obj){
//	obj.toString() == this.toString();
//	obj.studentNumber == obj.studentNumber...
//}



//최상위 클래스 Object
//public boolean equals(Object obj)
//모든 클래스들은 Object에 들어갈 수 있다.
//Object obj = new Child();
//Object obj = new Tiger();

//equals 원래는 Object 클래스에서 주소값을 비교하여 같은 지 판단하는 것.

//Object obj = new Unit();
//return this.name == obj.name && this.level == obj.level;
//obj.name과 obj.level에 빨간 줄이 뜨는 이유는 Object 상에서 자기한테 name이 있는지 level이 있는지 알 수가 없기 때문
//
//명확하게 obj가 어떤 클래스인지 검증하고 나면 자기한테 name이 있는지 level이 있는지 알 수가 있다.
//참조변수 instanceof 클래스이름 -> 타입: boolean

//p1 instanceof Child -> p1 클래스가 Child야? -> false
//p1 instanceof Parent -> p1 클래스가 Parent야? -> true
//p1 instanceof Object -> p1 클래스가 Object야? -> true

//c1 instanceof Child -> c1 클래스가 Child야? -> true
//c1 instanceof Parent -> c1 클래스가 Parent야? -> true
//c1 instanceof Object -> c1 클래스가 Object야? -> true

//객체 -> 추상클래스, 인터페이스

//추상클래스(Abstract class)
//인스턴스 변수를 생성할 수 없는 클래스(혼자 있으면 아무것도 할 수 없다.)
//다른 클래스에 상속을 해주기 위한 용도로 사용
//메소드의 시그니처(이름, 매개변수, 반환타입)만 선언을 하고 나머지는 자식 클래스에서 작성하라고 넘겨준다.<- 추상메소드
//객체 생성 불가능
//일반적인 메소드와 변수를 가질 수 있다.
//하나 이상의 추상 메소드를 가질 수 있다.
//추상 클래스는 자식 클래스에서 추상 메소드를 반드시 구현하도록 강제한다.
//클래스 선언 abstract class
//메소드 선언 abstract 자료형
//자식클래스에서 추상 메소드를 재구성할 때, 반드시 @Override를 붙여줘야 한다.
//예시(class45참조)
//abstract class Animal{
//	abstract void speak();
//}
//부모는 하나만 extends는 하나만 받아진다.
//추상클래스 vs 일반클래스(잘 선택해야함)







 

