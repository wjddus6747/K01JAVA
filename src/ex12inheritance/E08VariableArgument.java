package ex12inheritance;
/*
 * 가변인자(VariableArgument)
 * :매소드 오버로딩을 대체할 수 있는 문법으로, 하나의
 * 메소드로 여러가지 호출형식을 대체할수 있다.
 * 형식]
 * 메소드명(자료형 ... 매개변수명){
 * 실행문;
 * }
 * -필요에 따라 매개변수를 가변적으로 조정할수 있는 문법으로
 * JDK1.5부터 지원한다.
 * -메게변수는 여러개를 한꺼번애 받아야 하므로 배열로 반환한다.
 */
public class E08VariableArgument
{

//	static int getTotal(int param) {
//		int total = 0;
//		total += param;
//		return total;
//	}
//	
//	static int getTotal(int param1,int param2) {
//		int total = 0;
//		total += (param1+param2);
//		return total;
//	}
//	
//	static int getTotal(int param1, int param2,int param3) {
//		int total = 0;
//		total += (param1+param2+param3);
//		return total;
//	}
	/*
	 * 가변인자 를 통한 메소드정의
	 * :단, 매개변수가 하나의 타입일때만 가능하다
	 * 둘 이상의 타입이라면 정의할수 없다.
	 */
	static int getTotal(int ...param) {
		int tatal =0;
		for(int i=0; i< param.length; i++) {
			tatal  += param[i];
		}
		return tatal;
	}
	
	public static void main(String[] args)
	{
		System.out.println("getTotal(args1호출:"+ getTotal(10));
		System.out.println("getTotal(args2호출:"+ getTotal(10,20));
		System.out.println("getTotal(args3호출:"+ getTotal(10,20,30));
		System.out.println("getTotal(args1호출:"+ getTotal(10,20,30,40,50,60,70));
		
		//매개변수의 타입이 double이므로 호출이 불가능하다
		//System.out.println("getTotal(args2호출:"+ getTotal(10,20.0));
		
	}

}
