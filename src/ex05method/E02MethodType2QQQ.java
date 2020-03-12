package ex05method;

public class E02MethodType2QQQ {

	static void noPramNoReturn() {
		System.out.println("==메뉴를 선택하세욤==");
		System.out.println("1., 2., 3.");
		System.out.println("=====");
	}
	
	static void noParamNoReturn3() {
		System.out.println("[Return문 이전]");
		int returnValue = 88;
		
		if(returnValue%2==0) {
			System.out.println(returnValue +"는 짝수이다.");
			return;////////Q.리턴이 없어도 실행이 되고 if문에서 탈출하는데 굳이 리턴이 필요한지?
		}
		
		System.out.println(returnValue +"는 홀수이다.");
		System.out.println("[Return문 이후]");
	}
	
	public static void main(String[] args) {
		noPramNoReturn();
		noParamNoReturn3();
	}
}