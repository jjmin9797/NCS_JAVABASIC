package com.bit.tour;
//Tour Model_3
public class Member {
	private int memberid;
	private String membername;//�̸�
	private String phonenum;//����ó
	//� ������ ���?
	
	public Member() {
		super();
	}
	public Member(String membername, String phonenum) {
		this.membername = membername;
		this.phonenum = phonenum;
	}
	
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}


	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", membername=" + membername + ", phonenum=" + phonenum + "]";
	}
	
	
}
