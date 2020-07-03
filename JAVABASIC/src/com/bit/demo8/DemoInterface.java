package com.bit.demo8;
// �������̽� : Ŭ������ �ƴմϴ� ! �ƴ��ϴ�. �׷��� �ʽ��ϴ�.
// - ���� : API (Application Programming Interface)
// - �߻�޼��常 �ۼ� ���� -> �����ϸ� �ȵȴ� �߼��޼���θ� �����Ǿ�� �Ѵ�
// - filed : ����� �ۼ� ����(final)
// - ���� : ���� , ���� , ������ , ����� 
// - �����ӿ�ũ(spring) : �������̽� �������� ���� !

// ���� - ��ȹ
// �������̽� -> �߻� Ŭ���� -> ���� Ŭ���� ->

interface Workable {
	// �����Ѵٴ� ������ ������ !
	// interface �ȿ��� final �ʵ常 ����� �� �ִ�
	// �����ϸ� final�� �����
	final int a = 3;
	final String b = "3";
	
	public abstract void todo() ;
	public abstract void something();
	
}
class WorkImpl implements Workable{

	@Override
	public void todo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void something() {
		// TODO Auto-generated method stub
		
	}
	
}

public class DemoInterface {
	
	static void process(Workable param){
		param.todo();
		param.something();
	}
	
	public static void main(String[] args) {
		process(new WorkImpl() /*Workface �� ����ü !�� �־��־�� �Ѵ� ����*/);

	}

}
