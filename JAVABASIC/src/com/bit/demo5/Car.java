package com.bit.demo5;
import java.time.LocalDateTime; // Newwww
import java.util.Date; //old

//Model is Type
public class Car {
	//������
	private String id; // ���� ��ȣ
	private Date in ; //���� �ð� ����
	private Date out ; // �����ð� ����
	private double price;
	// ������ �޼��带 ��ü�ϴ� �� �Դϴ� -> override
	
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
