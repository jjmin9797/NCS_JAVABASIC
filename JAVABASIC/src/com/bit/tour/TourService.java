package com.bit.tour;

public class TourService implements Service {
	Repository rp = new MemberRepository();
	
	
	
	@Override
	public void regist() {
		rp.read();

	}

	@Override
	public void report() {
		// TODO Auto-generated method stub

	}

}
