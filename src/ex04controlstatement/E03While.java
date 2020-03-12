package ex04controlstatement;

import java.util.Scanner;

/*
 * while문
 * : 반복의 횟수가 정해져 있지 않을때 주로 사용하는 반복문이다.
 * 반복의 횟수가 명확할때는 주로 for문을 사용한다.
 * 형식]
 * 		반복을 위한 변수의 초기값 선언:
 * 		while(반복의 조건) {
 * 			실행문;
 * 			변수의 증감식; <- 반복문 탈출을 위한
 * 							++,--와 같은 연산이 필요함.
 * 		}
 *  반복의 조건이 false일때 while문을 탈출한다.

 */

public class E03While
{

	public static void main(String[] args)
	{
		// 누적합을 저장하기 위한 변수선언 증가하는 i를 누적해서 더함
		int sum = 0;
		// 반복을 위한 변수의 선언 및 처기화
		int i = 1;
		while (i <= 10)
		{// 반복의 조건설정
			// 증가되는 i를 느적헤서 더함(1+2+3..)
			sum += i;
			// while문을 탈출하기위한 조건을 위해 증가연산
			i++;
		}
		System.out.println("1~10까지합" + sum);

		/*
		 * [시나리오] 1부터 100까지위 정수중 3의 배수이거나 5의 배수인 
		 * 수의 합을 구하여 출력하는 프로그램을 while을 사용해서 작성하시오
		 */
		int total = 0;
		int j = 1;
		while (j <= 100)
		{
			if (j % 3 == 0 || j % 5 == 0)
			{
				total += j;

			}
			j++;
		}
//		System.out.println("1~100사이 3또는 5의 배수합:" + total);
//		/*[시나리오] 구구단을 출력하는 프로그램을 while문을 작성하시오*/
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("단을 입력하시오: ");
//		int num = scanner.nextInt();
//		int a=1;
//		while(a<=9) {
//			System.out.printf("%d*%d=%d%n", num, a, (num *a));
//			a++;
//			
//		}
		
		
		
		System.out.println("-----------------------------------------");
		
		int dan=2;
		
		while(dan<=9) {
			int su = 1;
			while(su<=9) {
				
				System.out.printf("%d*%d=%d%n", dan,su, (dan*su) );
				su++;
			}
			dan++;
		}
		/*
		시나리오] 아래와같은 모양을 출력하는 while문을 작성하시오.
			출력결과
				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */
		
		int m=1;
		while(m<=4) {
			
			int n=1;
			while(n<=4) {
				
				//System.out.printf("m="+m,"n="+n);
				if(m==n) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				
				n++;
			}
			
			System.out.println();
			m++;
			
			
			
			
		}

		 
	}

}
