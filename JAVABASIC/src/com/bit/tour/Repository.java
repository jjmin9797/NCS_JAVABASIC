package com.bit.tour;
//Tour Data Management
interface Repository<T> { //T�ڸ��� �ڷ����� ���� ���߿� �˾Ƽ� �ٲ� ! �ڷ��� ��ü, ġȯ ����
	public T read(); // �о����
	public void write(T arg); //�ۼ�
	public T[] readall();
	
	
}
