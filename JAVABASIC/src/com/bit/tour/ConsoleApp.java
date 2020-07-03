package com.bit.tour;

public class ConsoleApp {
	// 1. 접수한사람이 각기 다른 상품을 구입..
	// 2. 
	
	
	public static void main(String[] args) {
		Service crew1 = new TourService();
		Service crew2 = new TourService();
		Service crew3 = new TourService();
		
		
		
		//현재 직원이 바쁘면 다음 직원이 일을 한다.
		while(true) {
			crew1.regist();
			break;
		}
	}

}
