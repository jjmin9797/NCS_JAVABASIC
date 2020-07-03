package com.bit.demo8;

import java.io.File;

// 추상
// abstract : 클래스, 메서드
// 구현되지 않은 미완성이다
// 구현체 (완성체) 를 만들어야 한다.
// extends -> 추상 클래스.

// 1. 실행 내용 결정할 수 없다.. 내가 안한다..
// 2. 데이터 저장 매체 : 변경 여지가 많다.
// 3. 일부 중요한 부분, 내가 하고 싶은 부분 만들어 둔다...
// 4. 만들어야 하는 메서드가 뭔지 알려준다... 강제적 !
// 

//추상 메서드가 있다면, 이 클래스는 반드시 추상 클래스로 지정을 해야한다 !
abstract class Dao{
	//Data Access Object
	public void show() {
		System.out.println("");
	}
	public abstract Object read(); // 구현 되지 않은 메서드 - > 추상 메서드
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
	// 메서드 대체 : override!

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
