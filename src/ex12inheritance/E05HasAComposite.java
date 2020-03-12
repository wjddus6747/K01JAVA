package ex12inheritance;
/*
구성관계로 표현하기 위해 적합한 Has-A 관계
: X has a Y -> X가 Y를 소유하고 있다.
- 경찰이 권총을 소유한다.
- 경찰이 수갑을 소유한다.

Has-A와 같이 소유의 관계를 상속으로 표현하면 클래스간의 강한
연결고리가 형성되어 권총이 없는 경찰을 표현하기가 힘들어진다.
따라서 이경우에는 구성관계로 표현하는 것이 적합하다.
구성관계는 클래스의 멤버로 또 다른 객채를 정의하는 것을 말한다.
*/
import java.security.Policy;

class Gun{
	int bullet;
	public Gun(int bNum) {
		bullet = bNum;
	}
	//총을 쏘는 행위를 표현 
	public void shutGun()
	{
		System.out.println("빵야");
		//탄환이 감소됨
		bullet--;
	}
}
class police{
	int handCuffs;//수갑 보유개수
	Gun gun;//보유한 총
	
	public police(int bNum, int hCuff) {
		handCuffs = hCuff;
			gun = new Gun(bNum);
		
	}
	//수갑을 채우는 행위
	public void putHandcuff()
	{
		System.out.println("수갑채움");
		handCuffs--;
	}//경찰이 권총을 발사하는 헹위
	public void shut() {
		if(gun == null) {
			System.out.println("보유한 권총 없음");
		}
		else {
			gun.shutGun();
		}
	}
}
public class E05HasAComposite
{

	public static void main(String[] args)
	{
		//권총을 보유한 경찰을 표현
		System.out.println("=경찰=======");
		police police1 = new police(5,3);
		police1.shut();
		police1.putHandcuff();
		
		//권총을 보유하지 않은 경찰을 표현
		System.out.println("=경찰2=======");
		police police2 = new police(0,3);
		police2.shut();
		police2.putHandcuff();
	}

}
