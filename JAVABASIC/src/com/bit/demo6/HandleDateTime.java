package com.bit.demo6;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class HandleDateTime {

	static void step01() {
		//현재 컴퓨터의 시간 값 가져오기 !
		//1970년 기준 경과 시간 표시 -> 초, 밀리초
		long milli = System.currentTimeMillis();
		//System.out.println(milli);
		// / 1000 = 초단위 /60 / 분단위 ...
		//Deprecated : 1.8버전
		// 시간 정수 -> 사람이 아는 형식 맞춰 조정하는 작업 해야한다.
		Date dt = new Date();
		System.out.println(dt);
		System.out.println(dt.getYear() + "년");
		System.out.printf("%d월 %d일 \n",
				dt.getMonth(),
				dt.getDate());
		long mdt = dt.getTime();
		mdt = mdt/1000;
		System.out.println(mdt);
		//new 생성을 하지 못한다.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		long mmdt = cal.getTimeInMillis();
		System.out.println(mmdt);
		
		//over 1.8
		Instant cur = Instant.now();
		System.out.println(cur);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		int a = ldt.getHour();
		int b = ldt.getMinute();
		int c = ldt.getSecond();
		System.out.printf("%d시 %d분 %d초\n",a,b,c);
		
	}
	static void step02() {
		//시간 정하기!
		//Date Instant LocalDateTime
		
		long longdt = Date.UTC(120, 6, 29, 10, 30, 0);
		Date dt = new Date();
		dt.setTime(longdt);
		System.out.println(dt);
		
		Instant ist = Instant.now();
		
		LocalDate ldof = LocalDate.of(2020, 6, 30);
		LocalTime ltof = LocalTime.of(10, 30, 1);
		System.out.println(ldof);
		System.out.println(ltof);
		LocalDateTime ldt = LocalDateTime.of(ldof, ltof);
		System.out.println(ldt);
	}
	
	static void step03() {
		LocalDateTime in = LocalDateTime.of(2020, 6, 28, 9, 30);
		LocalDateTime out = LocalDateTime.now();
		// ChronoUnit
		// java.time
		// Period Duration
		Period diffdate = Period.between(	in.toLocalDate(), out.toLocalDate());//날짜
		Duration difftime = Duration.between(in.toLocalTime(), out.toLocalTime());//시간
		System.out.println(diffdate.getDays()+ " : " + difftime.getSeconds());
		
	}
	
	
	public static void main(String[] args) {
		
		step01(); // 현재 시간 가저오기!
		step02(); // 임의 시간 지정하기!
		step03(); // 시간 차 구하기!
	}

}
