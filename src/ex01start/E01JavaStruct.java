package ex01start;

import java.text.SimpleDateFormat;
import java.util.Date;

public class E01JavaStruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자바의 간략한 구조");
		Date toDayOfDate = new Date();

		System.out.println("오늘 날짜:" + toDayOfDate);
		SimpleDateFormat simple = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String toDayString = simple.format(toDayOfDate);
		System.out.println("변형된 날짜:" + toDayString);
	}
}