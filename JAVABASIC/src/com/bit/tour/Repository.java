package com.bit.tour;
//Tour Data Management
interface Repository<T> { //T자리에 자료형을 쓰면 나중에 알아서 바뀜 ! 자료형 대체, 치환 문법
	public T read(); // 읽어오기
	public void write(T arg); //작성
	public T[] readall();
	
	
}
