package com.bit.demo5;
import com.bit.demo5.Member;
public class MemberService {
	private Member[] list = new Member [10]; // 실제 배열이 아님 !
	// inMemory :  프로그램이 종료되면 다 사라진다 ! -> 영속성
	private int idx = 0;
	
	
	public void create(String name, String email) {
		Member mb = new Member();
		mb.setName(name);
		mb.setEmail(email);		
		
		list[idx] = mb;
		++idx;
		
	}
	
	public Member[] read() {
		Member [] rt = new Member[idx];
		for(int i= 0; i <idx;++i) {
			rt[i] =  list[i]; //  참조복사		
		}
		return rt;
	}
	
	//수정할 대상을 선택, 객체 참조 다루고 있다. 참조값 확인
	public void update(Member member) {
		
	}
	
	public void delete(int index) {
		list[index] = null;
		//빵꾸난다 데이터가
		//데이터의 순서가 중요하지 않은 경우 -> 
		Member t = list[idx-1];
		list[index] = t;
		--idx;
	}
	
	public Member getMemberByIndex(int index) {
		if(0 <= index && index < list.length) {
			
		
			if (list[index] != null) {
				return list[index];
			}else {
				return null;
			}
		}else {
			return null;
		}
	}
}

