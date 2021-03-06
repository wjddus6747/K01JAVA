package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*
 * do~while문
 * :반드시 한본은 실행해야 할 경우 사용하는 반복문
 * 즉 조건의 검사없이 무조건 한번은 실헹된다.
 * 형식]
 * 반복을 위한 초기값;
 * 	do{
 * 		실행문장;
 * 		증감식;} while(조건식); <= 반드시 ;으로 마무리한다
 */
public class E04DoWhile
{

	public static void main(String[] args) throws IOException
	{
		// 1~10까지의 합을 구하는 프로그램
		int sum = 0;
		int i = 1;
		do
		{
			sum += 1;
			i++;
		} while (i <= 10);
		System.out.println("누적합:" + sum);

		/*
		 * 시나리오] 1부터 1000까지의 정수 중 4의 배수이거나 7의 배수인 수의 합을 구하여 출력하는 프로그램을 작성하시오. 단, do ~
		 * while문을 사용해야 한다.
		 */
		int total = 0;
		int j = 1;
		do
		{
			if (j % 4 == 0 || j % 7 == 0)
			{
				System.out.println("j=" + j);
				total += j;
			}
			j++;
		} while (j <= 1000);
		System.out.println("배수합:" + total);

		/*
		 * 시나리오]국어, 영어, 수학 점수를 사용자로부터 입력받은 후 평균을 구해 A~F학점을 판단하여 출력하는 프로그램을 작성하시오. 단,
		 * 사E04DoWhile용자가 X,x(대소문자 구분없음)를 입력하면 프로그램이 종료되어야 하며 do~while문으로 구현해야 한다.
		 */
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;

		do
		{
			System.out.println("국어점수:");
			kor = scanner.nextInt();
			System.out.println("영어점수:");
			eng = scanner.nextInt();
			System.out.println("수학점수:");
			math = scanner.nextInt();

			avg = (kor + eng + math) / (3 * 10);
			switch (avg)
			{
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
			}
			System.out.println("종료하려면 X를 입력");
			System.out.println("게속해서 입력");
			exitCode = System.in.read();
		} while (!(exitCode == 'x' || exitCode == 'X'));
		/*
		 * x를 입력한 경우
		 * : (true OR false) => !true => false반환됨
		 * 즉 do~while문을 틸출함
		 * 
		 * a를 입력한 경우
		 * :위 경우와는 반대이므로 LOOP를 반복함
		 */

	}

}
