package com.bit.demo5;
import java.time.LocalDateTime; // Newwww
import java.util.Date; //old
import java.util.Date;
//Model is Type
public class Car {
	//주차장
	private String id; // 차량 번호
	private Date in ; //들어온 시간 ㅎㅎ
	private LocalDateTime out ; // 나간시간 ㅎㅎ
	private double price;
	// 기존의 메서드를 교체하는 것 입니다 -> override
	
//	public Car(int id, Date in, LocalDateTime out, int a) {
		
//	}
	
	public double calculatePrice() {
		double extra = 0;
		// Date in vs LocalDataTime out
		long lin = in.getTime();
		long lout ;

		lout = Date.UTC(out.getYear(), out.getMonthValue(), out.getDayOfMonth(), out.getHour(), out.getMinute(), out.getSecond());
		extra = (((lout - lin)/60000) / 10) * 5000;
		price += extra;
		
		String sin = in.toString();
		String sout = out.toString();
		// 비교하려면 자료형이 같아야 한다.
		System.out.println(sin);
		String[] sin1 = sin.split(" ");
		//Tue Jun 30 13:43:47 KST 2020
		
		
		String[] s1 = sout.split("T");
		String[] sd = s1[0].split("-");
		String[] st = s1[1].split(":");
		int year = Integer.parseInt(sd[0]);
		int month = Integer.parseInt(sd[1]);
		int day = Integer.parseInt(sd[2]);
		
		int hour = Integer.parseInt(st[0]);
		int min = Integer.parseInt(st[1]);
		double sec = Double.parseDouble(st[2]);
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %2f초\n",year,month,day,hour,min,sec);
		System.out.println(sin + " : "+sout+ " : " + s1[0]);
		return price;
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	
	public Date getIn() {
		return in;
	}
	public void setIn(Date in) {
		this.in = in;
	}
	
	
	public LocalDateTime getOut() {
		return out;
	}
	public void setOut(LocalDateTime out) {
		this.out = out;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Car [id=" + id + ", in=" + in + ", out=" + out + ", price=" + price + "]";
	}
}
