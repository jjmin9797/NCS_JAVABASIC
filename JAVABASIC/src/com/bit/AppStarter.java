package com.bit;
import com.bit.demo5.ADummy;
import com.bit.demo5.BDummy;
import com.bit.demo5.CDummy;
import com.bit.demo5.Member;
import com.bit.demo5.FinalKeyword;
public class AppStarter {
	static void view(Member member) {
		System.out.println(member.getName());
		System.out.println(member.getEmail());
	}
	// ������ ���޹��� �Լ��� ������ �����ϴ� !
	
	//�ܼ� ������ !
	public static void main(String[] args) {
		FinalKeyword fk = new FinalKeyword();
		fk.number = 1;
		//fk.id1 = 10 ; <- final�� ���� �Ұ�
	}
	
	
	
	
	
	
	public static void main_03() {
		//member �߰�,����
		Member mem = new Member() ;
		//Member ���� ����
		mem.setName("������");
		mem.setEmail("jjmin9797@naver.com");
		// ���
		view(mem);
		//Member  ����
		
		
		//Member ����
		//mem = null; //�޸𸮿��� ��������.  �� �̻� ����� �� ����,
		
	}
	
	
	
	
	
	
	//Ŭ���� ����, �ν��Ͻ� ������ ���� - static �� ����
	// Ŭ������ ���� - ��� ���� �� �˾Ƶα� (��ü��, �ν��Ͻ� ��)
	
	// static �� ������ ��� ������ ���� ���� �������ְ�
	// �پ����� ������ �� �ν��Ͻ����� ���� ���Ѵ�.
	public static void main_2() {
		CDummy instance; // Ŭ������ ����, ������ ����
		instance = new CDummy(); //��ü ����
		instance.setName("Jangs");
		System.out.println(instance.getName());
		instance.code = "12345" ;
		
		CDummy object;
		object = new CDummy() ;
		System.out.println(object.getName());
		System.out.println(object.code);
		
	}
	
	
	public static void main_01() {
		//  ����Ϸ��� Ŭ������ ���� Ŭ������ ��Ű���� �ٸ���.
		//  import �ؾ��Ѵ�.
		//  Ŭ���� ��� �� �ν��Ͻ��� �����ؼ� ���
		ADummy AD = new ADummy();
		// �ν��Ͻ��� ������� ����Ѵ�...
		// public �� �ƴ� ������� �ٷ� ����� �� ����...
		// ���� ������ ���ų�, �޼���� ��� -> �����־�� �Ѵ�.
		//System.out.println(AD.value);
		AD.value = 10;
		
		BDummy BD = new BDummy().setValue2(30);
		//�޼��带 ���ؼ� ������Ѵ�... -> ��ü�� ��û, ����
		//BD.setValue1(33);
		System.out.println(BD.getValue());
		//BD.value = 10;
		
		
	}

}
