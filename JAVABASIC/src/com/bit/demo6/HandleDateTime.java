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
		//���� ��ǻ���� �ð� �� �������� !
		//1970�� ���� ��� �ð� ǥ�� -> ��, �и���
		long milli = System.currentTimeMillis();
		//System.out.println(milli);
		// / 1000 = �ʴ��� /60 / �д��� ...
		//Deprecated : 1.8����
		// �ð� ���� -> ����� �ƴ� ���� ���� �����ϴ� �۾� �ؾ��Ѵ�.
		Date dt = new Date();
		System.out.println(dt);
		System.out.println(dt.getYear() + "��");
		System.out.printf("%d�� %d�� \n",
				dt.getMonth(),
				dt.getDate());
		long mdt = dt.getTime();
		mdt = mdt/1000;
		System.out.println(mdt);
		//new ������ ���� ���Ѵ�.
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
		System.out.printf("%d�� %d�� %d��\n",a,b,c);
		
	}
	static void step02() {
		//�ð� ���ϱ�!
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
		Period diffdate = Period.between(	in.toLocalDate(), out.toLocalDate());//��¥
		Duration difftime = Duration.between(in.toLocalTime(), out.toLocalTime());//�ð�
		System.out.println(diffdate.getDays()+ " : " + difftime.getSeconds());
		
	}
	
	
	public static void main(String[] args) {
		
		step01(); // ���� �ð� ��������!
		step02(); // ���� �ð� �����ϱ�!
		step03(); // �ð� �� ���ϱ�!
	}

}
