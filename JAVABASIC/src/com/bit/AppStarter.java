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
	// 참조를 전달받은 함수는 수정이 가능하다 !
	
	//콘솔 시작점 !
	public static void main(String[] args) {
		FinalKeyword fk = new FinalKeyword();
		fk.number = 1;
		//fk.id1 = 10 ; <- final은 수정 불가
	}
	
	
	
	
	
	
	public static void main_03() {
		//member 추가,생성
		Member mem = new Member() ;
		//Member 보기 수정
		mem.setName("신정민");
		mem.setEmail("jjmin9797@naver.com");
		// 출력
		view(mem);
		//Member  전달
		
		
		//Member 삭제
		//mem = null; //메모리에서 없어진다.  더 이상 사용할 수 없다,
		
	}
	
	
	
	
	
	
	//클래스 변수, 인스턴스 변수의 차이 - static 의 유무
	// 클래스형 변수 - 용어 개념 잘 알아두기 (객체명, 인스턴스 명)
	
	// static 이 붙은건 모든 곳에서 같은 값을 가지고있고
	// 붙어있지 않으면 각 인스턴스별로 값이 변한다.
	public static void main_2() {
		CDummy instance; // 클래스형 변수, 참조형 변수
		instance = new CDummy(); //객체 생성
		instance.setName("Jangs");
		System.out.println(instance.getName());
		instance.code = "12345" ;
		
		CDummy object;
		object = new CDummy() ;
		System.out.println(object.getName());
		System.out.println(object.code);
		
	}
	
	
	public static void main_01() {
		//  사용하려는 클래스와 사용될 클래스의 패키지가 다르다.
		//  import 해야한다.
		//  클래스 사용 시 인스턴스를 생성해서 사용
		ADummy AD = new ADummy();
		// 인스턴스의 멤버들을 사용한다...
		// public 이 아닌 멤버들은 바로 사용할 수 없다...
		// 접근 권한을 열거나, 메서드로 사용 -> 열려있어야 한다.
		//System.out.println(AD.value);
		AD.value = 10;
		
		BDummy BD = new BDummy().setValue2(30);
		//메서드를 통해서 입출력한다... -> 객체간 요청, 응답
		//BD.setValue1(33);
		System.out.println(BD.getValue());
		//BD.value = 10;
		
		
	}

}
