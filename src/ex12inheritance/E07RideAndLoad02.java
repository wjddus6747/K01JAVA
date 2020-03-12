package ex12inheritance;

public class E07RideAndLoad02
{

	public static void main(String[] args)
	{
		System.out.println("child형 참조변수로 child객체 참조");
		DeChild child = new DeChild("이준승", 30, "14학번");
		
		/*
		 * 오버라이딩 처리된 메소드이므로 참조변수에 상관없이
		 * 무조건 자식쪽에 메소드가 호출됨.
		 */
		child.excecise();
		child.sleep();
		child.printPrarent();
		
		child.study();//자식에서 확장
		child.walk();//오버로딩 - 부모쪽
		child.walk(25);//오버로딩 - 자식쪽
		
		//정적메소드 - (때문에)클래스명으로 호출함
		DeChild.staticMethod();
		
/////////////////////////////////////////////////////////
		
		System.out.println("parent형 참조변수로 child객체참조");
		DeParent parent = new DeChild("이정연", 22, "16학변");
		
		/*
		 * 오버라이딩 처리된 메소드이므로 참조변수에 상관없이
		 * 무조건 자식쪽에 메소드가 호출됨.
		 * 참조변수에 영향을 받지 않는다.
		 */
		parent.excecise();
		parent.sleep();
		parent.printPrarent();
		
		//parent.study(); //자식에서 확장한 메소드- 접근불가
		parent.walk();
		//parent.walk(20); //자식에서 확장한 메소드 - 접근불가
		
		//정적메소드 - (때문에)클래스명으로 호출함
		DeParent.staticMethod();
	}

}
