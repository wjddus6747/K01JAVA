package ex13interface;
/*
 * 추상클래스를 interface로 변경하기
 * abstract class => interface
 * 
 * 메소드의 경우 public abstract를 제거
 * 
 * 멤버상수인 경우 public static final을 제거
 */

//프로젝트 전체에서 기준이 될 수 있는 추상클래스 정의
interface PersonalNumberStorageInter
{
	 void addPersonalInfo(String juminNum, String name);

	 String searchPersonalInfo(String juminNum);
}

class PersonalInfoVO
{
	// 멤버변수
	private String name;
	private String juminNum;

	// 생성자
	public PersonalInfoVO(String name, String juminNum)
	{
		this.name = name;
		this.juminNum = juminNum;
	}

	// getter 메소드
	public String getName()
	{
		return name;
	}

	public String getJuminNum()
	{
		return juminNum;
	}

}

/*
 * 클래스가 클래스를 상속받을때 => extends사용
 * 클래스가 인터페이스를 상속받을때 => implements 사용
 * 인터페이스가 인터페이스를 상속받을때 => extends 사용
 * 
 * extends는'상속'이라 표현하고, implements는 '구현'이라 표현한다.
 */
class PersonalNumberStorageImpl implements PersonalNumberStorageInter
{
	// 멤버변수
	PersonalInfoVO[] personalArr;// 정보저장용 객체배열
	int numOfPerInfo;// 입력정보 카운트용 변수

	// 생성자
	public PersonalNumberStorageImpl(int arrSize)
	{
		personalArr = new PersonalInfoVO[arrSize];
		numOfPerInfo = 0;
	}

	@Override
	public void addPersonalInfo(String juminNum, String name)
	{
		personalArr[numOfPerInfo] = new PersonalInfoVO(name, juminNum);
		numOfPerInfo++;
	}

	@Override
	public String searchPersonalInfo(String juminNum)
	{
		for (int i = 0; i < numOfPerInfo; i++)
		{
			if (juminNum.compareTo(personalArr[i].getJuminNum()) == 0)
			{
		
				// getter를 통해 이름을 반환한다.
				return personalArr[i].getName();
			}
		}
		return null; // 검색결과가 없는 경우 null반환
	}
}

public class E02AbstractToInterface2
{
	public static void main(String[] args)
	{
		PersonalNumberStorageInter storage = new PersonalNumberStorageImpl(10);

		// 정보저장
		storage.addPersonalInfo("951207-1111111", "이준승");
		storage.addPersonalInfo("970919-2222222", "이정연");

		// 검색
		System.out.println(storage.searchPersonalInfo("951207-1111111"));
		System.out.println(storage.searchPersonalInfo("970919-2222222"));
		System.out.println(storage.searchPersonalInfo("010301-1111111"));
	}
}



