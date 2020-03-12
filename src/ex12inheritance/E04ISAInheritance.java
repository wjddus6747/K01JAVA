package ex12inheritance;
/*
Is-A 관계
	: X Is A Y -> X는 Y의 일종이다로 표현가능
	- 노트북은 컴퓨터의 일종이다.
	- 휴대폰은 전화기의 일종이다.
	이와 같이 Is-A관계가 성립하는 개체를 상속으로 표현하기에 적합하다.
 */
/*
 * 컴퓨터를 표헌
 * : 기본적인 컴퓨팅 환경을 제공하여 입력된 내용을 계산한다
 */
class Computer{
	String owner;
	
	public Computer(String name) {
		owner = name;
	}
	/*
	 * private 접근지정자로 선언된 멤버메소드는 외부클래스 혹은
	 * 상속받은 클래스에서 접근이 불가능하므로
	 * public으로 선언된 메소드를 통해서 간접 호출을 해야한다
	 * 상속관계라면 protected로 선언된 메소드로 호출할수 있다.
	 */
	private void KeyboardTouch() {
		System.out.println("키보드를 통해서 입력한");
	}
	
	private void calculate() {
		System.out.println("요청한 내용을 계산한다");
	}
	public void caculateFunc()
	{
		KeyboardTouch();
		calculate();
	}
	/*
	 * 해당메소드는 내부에서만 접근되므로 호출순서를 지켜
	 * 실행할 수 있도록 캡슐화 하여 정의하였다.
	 */
}

/*
 * 컴퓨터를 상속한 노트북컴퓨터
 *  : 컴퓨터가 가지고 있는 기본기능에 휴대이용 부분을 확장하여 정의하였음
 *  휴대이용을 위해 베터리 멤버변수가 추가됨
 */
class NotebookComputer extends Computer{
	int battary;//베터리 충전량
	public NotebookComputer(String name, int initCharge)
	{//부모생성자 호출을 위해 사용하는 super()는 생략은 가능하지만
		//앞에 다른 문장이 먼저 오게되면 오류가 발생되므로 주의해야한다.
		super(name);
		battary = initCharge;
		
	}
	//베터리 충전을 표현
	public void charging()
	{
		battary +=5;
	}
	//휴대하면서 컴퓨팅을 할 수 있는것을 표현
	public void movingCal()
	{
		//베터리양을 체크하여 사용여부 판단
		if(battary <1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		System.out.println("이동하면서");
		
		/*
		 * 아래 메소드는 private으로 선언되었으므로 상속받은
		 * 자식클래스애서도 접근은 불가능하다.
		 */
		//KeyboardTouch();
		//calculate();
		
		caculateFunc();
		battary -= 1;//베터리 차감
	}
}
/*
 * 테블릿 노트북 컴퓨터
 *  : 컴퓨터의 기본기능, 휴대이용에 펜으로 드로잉 할 수 있는 기능까지 추가된 클래스
 */
class TabletNotebook extends NotebookComputer{
	String registPencil;//테블릿을 사용하기 위한 펜슬
	
	public TabletNotebook(String name, int initCharge, String pen) {
		super(name, initCharge);
		registPencil = pen;
	}
	//테블릿 사용을 위해서 베터이양 체크 및 등록된 펜인지 체크
	public void write(String penInfo)
	{
		if(battary <1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		/*
		 * A.compareTo(B)
		 * : 문자열A와 B를 비교하여 0이 반환되면 같은 문자열로 판단하고, 
		 * -1혹은 1이 반환되면 서로 다른 문자열로 판단하는 String클래스에 정의된 메소드
		 */
		if(registPencil.compareTo(penInfo)!= 0) {
			System.out.println(" 등록된 팬 아님");
			return;
		}
		movingCal();
		System.out.println("스크린에 펜으로 그림을 그린다");
		battary -= 1;
	}
}
public class E04ISAInheritance
{  

	public static void main(String[] args)
	{
		NotebookComputer notebookComputer = new NotebookComputer("공유", 5);
		TabletNotebook tablet = new TabletNotebook("이동윽", 5, "23874");
		
		System.out.println("노트북 사용==========");
		notebookComputer.movingCal();
		notebookComputer.movingCal();
		notebookComputer.movingCal();
		notebookComputer.movingCal();
		notebookComputer.movingCal();
		notebookComputer.movingCal();
		notebookComputer.movingCal();
		notebookComputer.movingCal();
		
		System.out.println("23874펜사용");
		tablet.write("23874");
		
		System.out.println("42534");
		tablet.write("42534");
		
		
	}

}