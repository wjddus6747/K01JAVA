package ex10accessmodifier;

public class E06AccountMain
{

	public static void main(String[] args)
	{
		AccountDAO cap = new AccountDAO();
		//초기화
		cap.init("홍길동", "1234-5667-8", 100000);
		//통장정보출력
		cap.printAccount();
		//출금처리
		cap.withdraw(20000);
		cap.withdraw(30000);
		//입금처리
		cap.deposit(1000);
		//통장정보출력
		cap.printAccount();
	}

}
