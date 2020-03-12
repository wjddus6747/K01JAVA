package ex08class;
/*
시나리오] 은행계좌를 추상화 해보자
멤버변수 : 예금주(name)
		계좌번호(accountNumber)
		잔고(balance)

멤버메소드 : 입금하다(deposit())
 		출금하다(withdraw())
 		계좌잔고 출력하기(showAccount())

조건1 : 입금은 무제한으로 가능함
조건2 : 잔고가 부족할 경우에는 출금불능 처리
*/

class Account
{
	String name;
	String accountNumber;
	int balance;

	void deposit(int mony)
	{
		balance += mony;
		System.out.println(mony + "원이 입금됨");
	}

	void withdraw(int mony)
	{
		// 출금을 위헤 잔고와 출금요청금액을 비교
		if (balance >= mony)
		{// 잔고가 충분한경우
			balance -= mony;
			System.out.println("계좌에서" + mony + "원이 입금됨");
		} else
		{
			// 잔고가 부족한 경우 불능처리
			System.out.println("잔고부족으로 출금 불가능");
		}
	}

	void showAccount()
	{
		System.out.println("계좌주:" + name);
		System.out.println("계좌번호:" + accountNumber);
		System.out.println("잔고:" + balance);
	}

	// 초기화 메소드
	void init(String n, String a, int b)
	{
		name = n;
		accountNumber = a;
		balance = b;
	}
}

public class E04AccountMain
{

	public static void main(String[] args)
	{
		Account account = new Account();
		account.init("장동건", "111-22-8888", 1000);
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount();

		Account account2 = new Account();
		account2.name = "정우성";
		account2.accountNumber = "123-45-67890";
		account2.balance = 90000;
		account2.showAccount();
	}

}
