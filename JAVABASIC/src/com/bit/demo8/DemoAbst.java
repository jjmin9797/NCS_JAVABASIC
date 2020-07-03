package com.bit.demo8;

import java.io.File;

// �߻�
// abstract : Ŭ����, �޼���
// �������� ���� �̿ϼ��̴�
// ����ü (�ϼ�ü) �� ������ �Ѵ�.
// extends -> �߻� Ŭ����.

// 1. ���� ���� ������ �� ����.. ���� ���Ѵ�..
// 2. ������ ���� ��ü : ���� ������ ����.
// 3. �Ϻ� �߿��� �κ�, ���� �ϰ� ���� �κ� ����� �д�...
// 4. ������ �ϴ� �޼��尡 ���� �˷��ش�... ������ !
// 

//�߻� �޼��尡 �ִٸ�, �� Ŭ������ �ݵ�� �߻� Ŭ������ ������ �ؾ��Ѵ� !
abstract class Dao{
	//Data Access Object
	public void show() {
		System.out.println("");
	}
	public abstract Object read(); // ���� ���� ���� �޼��� - > �߻� �޼���
	public abstract void save(Object arg); 
}

class ArrayDao extends Dao{
	private Object[] array;
	
	@Override
	public Object[] read() {
		
		return null;
	}
	@Override
	public void save(Object arg) {
		// TODO Auto-generated method stub
		
	}

}


class FileDao extends Dao{
	private File data;
	// �޼��� ��ü : override!

	@Override
	public Object read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Object arg) {
		// TODO Auto-generated method stub
	}
	
	
}


public class DemoAbst {
	
	
	
	public static void main(String[] args) {
		
		ArrayDao dao = new ArrayDao();
		dao.read();
		FileDao f = new FileDao();
		f.read();
		
		Dao daoo = new FileDao();
		daoo.read();
	}

}
