package ex13interface;

import java.util.Scanner;

interface Week
{
	int MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6, SUN = 7;
}

public class E04InterfaceConstant
{

	public static void main(String[] args)
	{
		System.out.println("오늘의 요일을 선택하시오");
		System.out.println("1 월요일~7일요일");
		System.out.println("선택(정수입력");
		
		Scanner scanner = new Scanner(System.in);
		int sel = scanner.nextInt();
		switch (sel)
		{
		case Week.MON:
			System.out.println("주간회의 있음");
			break;

		case Week.TUE:
			System.out.println("프로젝트");
			break;
		case Week.WED:
			System.out.println("진행사항 보고");
			break;
		case Week.THU:
			System.out.println("축구시합날");
			break;
		case Week.FRI:
			System.out.println("프로젝트 마감일");
			break;
		case Week.SAT:
			System.out.println("가족과 즐거운 시간");
			break;
		case Week.SUN:
			System.out.println("휴일");
			break;
		}
		
	}

}
