package ex15usefulclass;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class E05LocalDateTimeO
{

	public static void main(String[] args)
	{
		Instant start = Instant.now();
		
		LocalDate nowDate = LocalDate.now();
		System.out.println("오늘날짜:"+nowDate);
		
		LocalDate ofDate = LocalDate.of(2112, 4, 3);
		System.out.println("생년월일:"+ ofDate);
		
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println("지금이순간:"+ nowDateTime);
		
		LocalDateTime ofDateTime = LocalDateTime.of(2112, 4,3,5,56,30);
		System.out.println("생년월일과 시간:"+ofDateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm--dd HH:mm:ss.SSS");
		String dateStr = LocalDate.now().atStartOfDay().format(formatter);
		System.out.println("금일자정:"+ dateStr);
		
		LocalDateTime tommorrow = nowDateTime.plusDays(1);
		System.out.println("내일:"+ tommorrow);
		
		LocalDateTime day3Later = LocalDateTime.now().plusDays(3).with(LocalTime.NOON);
		System.out.println("3일후 12시:"+ day3Later);
		
		System.out.println("2시간후 10분후"+ nowDateTime.plusHours(2).plusMinutes(10));
		
		LocalDateTime nowSunday = LocalDateTime.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println("가장 가까운 다음 일요일:"+ nowSunday);
		
		LocalDate fourthSundauy = LocalDate.of(2020, 5, 8).with(TemporalAdjusters.dayOfWeekInMonth(4,DayOfWeek.SUNDAY));
		System.out.println("2020/5/8 기준, 네번째 일요일:"+ fourthSundauy);
		
		LocalDate first12Sunday = LocalDate.of(2020, 3, 7).with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		System.out.println("2020/3/7 기준 천번쨰 일요일:"+ first12Sunday);
		
		LocalDate xmas = LocalDate.of(LocalDate.now().getYear(), 12, 25);
		Period  left = Period.between(nowDate, xmas);
		System.out.println("X-mas까지 앞으로"+ left.getMonths()+ "개월"+ left.getDays()+"일");
		
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.println("틀래스 실행 시간 확인(두시간의 차):"+ duration.toMillis());
		
		System.out.println(nowDate.getMonth());
	}

}
