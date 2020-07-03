package com.bit.tour;
// Tour Model_2
public class Place {
	private int placecode;//장소코드
	private String placename;//장소명
	private String placeadd;//장소주소
	private long placeprice; // 장소 가격
	
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
