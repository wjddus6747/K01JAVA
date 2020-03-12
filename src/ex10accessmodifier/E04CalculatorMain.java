package ex10accessmodifier;

import ex10accessmodifier.cal.Calculator;

public class E04CalculatorMain
{

	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		
		System.out.println("10+20=" + cal.addTwoNumber(10, 20));
		System.out.println("10+20=" + cal.addTwoNumber(10, 20));
		System.out.println("100-20=" + cal.subTwoNumber(100, 20));
		
		cal.showOpratingTimes();
	}

}
