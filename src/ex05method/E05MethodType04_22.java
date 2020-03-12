package ex05method;

import java.util.Scanner;

public class E05MethodType04_22 {
	
	public static void main(String[] args) {
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값: "+ maxValue1);
	}
	
	static int returnMaxNumber(int numberCnt) {
		
		Scanner scanner = new Scanner(System.in);		
		
		int maxVal = 0;//최대값을 저장할 변수
		for(int i=1 ; i<=numberCnt ; i++) {
			System.out.println("정수를 입력하세요: ");
			int inputNum = scanner.nextInt();
			
			if(i==1) {///첫번째로, 비교의 기준값 설정
				maxVal = inputNum;
			}
			else {//그 후부터, 새로운입력값이 큰지 비교해서 그대로 남겨둔다. for문 돌면서 계속비교.
				if(maxVal<inputNum) {
					maxVal=inputNum;
				}
			}
		
		}
		return maxVal;
		
	}
}