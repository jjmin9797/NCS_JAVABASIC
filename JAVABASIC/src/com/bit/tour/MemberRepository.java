package com.bit.tour;

import java.util.Arrays;

public class MemberRepository implements Repository<Member> {
	private Member[] memberlist;
	private int seq ;
	
	
	
	public MemberRepository() {
		memberlist = new Member[20];
		seq = 0;
	}
	
	
	@Override
	public Member read() {
		System.out.println("Test");
		return null;
	}
	
	
	
	@Override
	public Member[] readall() {

		
		Member[] rt = Arrays.copyOf(memberlist, seq);
			
			
		
		return rt;
	}

	@Override
	public void write(Member arg) {
		if (arg != null) {
			memberlist[seq] = arg;
			seq ++;
			arg.setMemberid(seq);
			System.out.println("�� ȸ�� : " + seq + "��.");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
	}

}
