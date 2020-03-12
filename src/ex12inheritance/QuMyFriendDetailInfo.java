package ex12inheritance;

/*
 * 다음 상속관계에 있는 두 클래스의 적절한 생성자를 정의해보자.
main 함수에서는 MyFriendDetailInfo 클래스를 통해서 객체를
 생성해야 하고 생성된 정보를 확인할 수 있도록 해보자.
 실행결과]
	이름: 이순신
	나이: 100
	주소: 성균관
	전화: 010-1000-8888
 */
class MyFriendInfo
{
	private String name;
	int age;

	//인자생성자
	public MyFriendInfo(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void ShowMyFriendInfo()
	{

		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}

//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo
{
	private String addr;
	private String phone;

	//인자 생성자
	public MyFriendDetailInfo(String addr, String phone, String name, int age) {
		super(name, age);
		this.addr = addr;
		this.phone = phone;
		ShowMyFriendDetailInfo();
	}
	public void ShowMyFriendDetailInfo()
	{
		/*
		 * 부모쿨래스의 멤버메소드를 호츨할때 명시적으로 super를 붙여주는것이 젛다
		 */
		super.ShowMyFriendInfo();
		System.out.println("주소: " + addr);
		System.out.println("전화: " + phone);
	}
}

class QuMyFriendDetailInfo
{
	public static void main(String[] args)
	{
		MyFriendDetailInfo info = new MyFriendDetailInfo("성균관","010-1000-8888","이순신",100);

		// 이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		// 정보Print
	}
}
