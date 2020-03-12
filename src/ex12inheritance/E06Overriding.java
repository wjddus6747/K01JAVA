package ex12inheritance;
/*
 * 오버라이딩(overriding)
 * :클래스가 상속관계에 있을때 하위클래스에서 상위클레스의 
 * 멤버메소드와 완전히 동일한 모양으로 재정의하는것을
 * 말한다
 *오버로딩(overriding)과 다른점은 메개변수의 갯수, 타입,
 *반환형이 완전히 똑같은 형태로 정의하는것이다
 *하위클래스에서 오버라이딩한 메소드는 상위클래스위 메소드를
 *가리게 되므로 항상 최상위 클래스에서 오버라이당한 메소드가 호출되게된다.
 */

//일반적인 스피커를 추상화
class Speaker
{
	private int volumnRate;

	//setter메소드
	public void setVolum(int vol)
	{
		volumnRate = vol;
	}

	//상속관계에서 오버라이딩을 목적으로 정의한 메소드
	public void showState()
	{
		System.out.println("스피커의 볼륨크기:" + volumnRate);
	}
}
//일반적인 스피커에 중저음이 보강된 스피커를 추상화
class BaseSpeaker extends Speaker
{
	private int baseRate;

	public void setBase(int bas)
	{
		baseRate = bas;
	}

	/*
	 * @Override : '어노테이션'이라 부르고 오버라이딩 된
	 * 메소드애 붙어 컴파일러에게 알려주는 역할을 한다.
	 */
	@Override
	public void showState()
	{	//super를 통해 부모클래스에 정의된 멤버메소드를 호출한다.
		super.showState();
		System.out.println("베이스 볼륨크기:" + baseRate);
	}
}

public class E06Overriding
{

	public static void main(String[] args)
	{
		BaseSpeaker baseSpeaker = new BaseSpeaker();
		baseSpeaker.setVolum(10);
		baseSpeaker.setBase(20);
		baseSpeaker.showState();/*
		하위클래스에 오버라이딩된 showState()메소드가 호츨된다.
*/
		System.out.println();
		/*
		 * 부모클래스의 참조변수가 자식클래스의 객체를 참조할수 있다
		 * 이경우 접근범위는 부모클래스로 제한된다
		 * 즉 아래 호츨부분에서 speaker참조변수를 통해서는setBase()
		 * 메소드는 호출할수 없다 
		 * setBase()는 자식클래스에 정의된 멤버메소드이기 때문이다
		 * 단, 오버라이딩 처리된 메소드가 있는경우 하위클래스의메소드가 
		 * 호출되게 된다.
		 */
		Speaker speaker = new BaseSpeaker();
		speaker.setVolum(30);
		//speaker.setBase(40);
		speaker.showState();
	}

}
