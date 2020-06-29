package com.bit.demo5;
import java.time.LocalDateTime; // Newwww
import java.util.Date; //old

//Model is Type
public class Car {
	//주차장
	private String id; // 차량 번호
	private Date in ; //들어온 시간 ㅎㅎ
	private Date out ; // 나간시간 ㅎㅎ
	private double price;
	// 기존의 메서드를 교체하는 것 입니다 -> override
	
//	public Car(int id, Date in, LocalDateTime out, int a) {
		
//	}
	
	
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
	
	
	public Date getOut() {
		return out;
	}
	public void setOut(Date out) {
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
