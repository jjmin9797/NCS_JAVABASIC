package com.bit.tour;
// Tour Model_2
public class Place {
	private int placecode;//����ڵ�
	private String placename;//��Ҹ�
	private String placeadd;//����ּ�
	private long placeprice; // ��� ����
	
	public Place() {
		
	}
	
	
	public int getPlacecode() {
		return placecode;
	}
	public void setPlacecode(int placecode) {
		this.placecode = placecode;
	}
	public String getPlacename() {
		return placename;
	}
	public void setPlacename(String placename) {
		this.placename = placename;
	}
	public String getPlaceadd() {
		return placeadd;
	}
	public void setPlaceadd(String placeadd) {
		this.placeadd = placeadd;
	}
	public long getPlaceprice() {
		return placeprice;
	}
	public void setPlaceprice(long placeprice) {
		this.placeprice = placeprice;
	}

	
}
