package ex14innerclass;

/*
 * 내부정적클래스
 * : 클래스안에 정의하는 클래스로 static을 붙여준다
 * -이와같이 내부클래스를 static으러 선언하면 Nested클래스라고 한다
 * -정적 멤버변수 & 멤버메소드를 가질수 있다.
 * -외부클래스의 인스턴스형 맴버는 사용할수 없다
 * -외부클래스명$내부클래스명.class파일이 생성된다.
 * 
 * 원래 클래스앞에 static을 붙일수 없으나 내부클래스에는 허용된다.
 */
class OuterClass{
	//인스턴스형 멤버변수
	InnerStaticClass innerStaticClass = new InnerStaticClass();
	int outerMemberVar;
	//인스턴스형 멤버메소드
	
	void outerMemberMethod() {
		/*
		 * 외부클레스의 멤버메소드에서는 내부정적클래스의 멤버를 접근할수 있다.
		 * (Heap영역에서는 Method영역을 참조할수 있다.)
		 */
		System.out.println("외브클래스의 멤버메소드 홏출됨");
		innerStaticClass.innerMemberVar = 100;//내부클래스의 맴버변수
		InnerStaticClass.innerStaticVar = 101;//내부클래스의 정적변수
	}
	
	//외부클래스의 정적멤버변수 & 메소드
	static int outerStaticVar;
	static void outerStaticMethod() {
		/*
		 * 외부클래스의 정적멤버 메소드에서는 내부클래스의 정적멤버만 접근할수 있다.
		 * (Method영역에서는 Heap영역을 참조할 수 없다.)
		 */
		System.out.println("외부클래스의 정적메소드 호출됨");
		
//		InnerStaticClass.innerMemberVar = 102; //에러발생
//		innerStaticClass.innerMemberMethod(); //에러발생
		
		InnerStaticClass.innerStaticVar = 103;
		InnerStaticClass.innerStaticMenthod();
		
//		InnerStaticClass.innerMemberVar = 104; //에러발생
//		InnerStaticClass.innerMemberMethod(); //에러발생
	}
	//내부정적클래스(Nested Class)
	static class InnerStaticClass{
	
		//인스턴스형 멤버
		int innerMemberVar;
		void innerMenberMethod() {
			System.out.println("내부클래스의 멤버메소드 호출");
		}
		//정적맴버
		static int innerStaticVar;
		static void innerStaticMenthod() {
			System.out.println("내부클랴스이 정적메소드 호출");
		}
	}
}
public class E02InnerStaticClass
{

	public static void main(String[] args)
	{
		/*
		 * 외부클래스가 아님 다른 클래스에서 접근할때의 방법은 아래와 같다.
		 */
		
		/*
		 * 내부정적 클래스의 정적멤버에 접근할때는 외부클래스의 객채 생성없이
		 * 클래스명으로 바로 접근이 가능하다.
		 */

		OuterClass.InnerStaticClass.innerStaticVar =1;
		OuterClass.InnerStaticClass.innerStaticMenthod();
		
		/*
		 * 내부정적 클래스의 인스턴스맴버에 접근할때는 객체를 생성한후 참조변수를 통해서 접근해야한다.
		 */
		OuterClass.InnerStaticClass innerStaticStaticClass = new OuterClass.InnerStaticClass();
		innerStaticStaticClass.innerMemberVar = 2;
		innerStaticStaticClass.innerMenberMethod();
		
		/*
		 * 그외는 클래스 접근의 일반적인 방법을 따른다.
		 
		 * 외부클래스의 맴버변수(메소드)는 객체생성후 참조변수를 통해 접근한다.
		 */
		OuterClass outerClass = new OuterClass();
		outerClass.outerMemberVar = 3;
		outerClass.outerMemberMethod();
		
		/*
		 * 외부클레스의 정적맴버는 클래스명으로 바로 접근한다.
		 */
		OuterClass.outerStaticVar =4;
		OuterClass.outerStaticMethod();
	}

}
