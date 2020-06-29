package com.bit.demo5;
import com.bit.demo5.Member;
public class MemberService {
	private Member[] list = new Member [10]; // ���� �迭�� �ƴ� !
	// inMemory :  ���α׷��� ����Ǹ� �� ������� ! -> ���Ӽ�
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
			rt[i] =  list[i]; //  ��������		
		}
		return rt;
	}
	
	//������ ����� ����, ��ü ���� �ٷ�� �ִ�. ������ Ȯ��
	public void update(Member member) {
		
	}
	
	public void delete(int index) {
		list[index] = null;
		//���ٳ��� �����Ͱ�
		//�������� ������ �߿����� ���� ��� -> 
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

