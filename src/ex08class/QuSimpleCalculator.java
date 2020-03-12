package ex08class;
/*
 * 기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.
 */
class CalculatorEx
{//멤버변수 : 연산의 횟수를 카운트할 용도로 사용
	int countAdd;
	int countMin;
	int countMul;
	int countDiv;
	public void init()
	{
		countAdd = 0;
		countDiv = 0;
		countMin = 0;
		countMul = 0;
	}

	public double add(int a, int b)
	{
		countAdd++;//덧샘 연산 횟수 카운트
		return a + b;
	}

	public double min(double a, double b)
	{
		countMin++;
		return a - b;
	}

	public double mul(double a, double b)
	{
		countMul++;
		return a * b;
	}

	public double div(double a, double b)
	{
		countDiv++;
		return a / b;
	}

	//연산횟수를 출력하는 멤버메소드
	public void showOpCunt()
	{
		System.out.println("덧셈횟수:" + countAdd);
		System.out.println("뺄셈횟수 :" + countMin);
		System.out.println("곱셈횟수 :" + countMul);
		System.out.println("나눗셈횟수 :" + countDiv);
	}

}

public class QuSimpleCalculator
{

	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1+2=" + cal.add(1, 2));
		System.out.println("10.5-4.2=" + cal.min(10.5, 4.2));
		System.out.println("1.0*3.2=" + cal.mul(1.0, 3.2));
		System.out.println("1.8/0.2=" + cal.div(1.8, 0.2));
		System.out.println("10* 2.0=" + cal.mul(10, 2.0));
		cal.showOpCunt();
	}

}
