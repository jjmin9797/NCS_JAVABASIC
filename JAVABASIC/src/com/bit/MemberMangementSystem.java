/*
 * 객체 지향은 여러 개의 객체들이 상호 작용하는 프로그램
 * - 객체 간의 관계 (상속, 구현)
 * - 서로 간 실행을 위해 전달, 반환, 호출하는 흐름 !
 * - 객체 자체가 여러 개, 개발하는 사람 여러 명, 여러 개의 프로젝트 !
 */



package com.bit;
import java.util.Date;
import java.util.Scanner;
import com.bit.demo5.MemberService;
import com.bit.demo5.Member;
import com.bit.demo5.CarParking;
import com.bit.demo5.Car;
public class MemberMangementSystem {

	
	
	private MemberService MS;

	
	// 메인 함수 호출
	public static void main(String[] args) {
//		mgrMember();
		parking();
	}
	
	
	
	public static void parking() {
		Scanner sc = new Scanner(System.in);
		CarParking service = new CarParking(10); //뒤에 20은 최대 20개까지 데이터를 집어넣을수 있당
		
		while (true) {		
			
			String state = service.getState();
			System.out.println("-----------Parking System-----------\n"
					+ "1.차량 In  2.차량 Out  3.주차장 현황판   4.종료 \n"
					+ service);	
			
			int usernum = sc.nextInt(); sc.nextLine();
			
			
			
			
			if (usernum == 1) {
				String inputid = sc.nextLine();
				Date intime = new Date();
				Date outtime = new Date();
				Car car = new Car();
				service.insert(inputid, intime , outtime , 5000);
				
			}
			
			if (usernum == 2) {
				System.out.println("차량 번호 >");
				String carnum =  sc.nextLine();
				
				service.getCar(carnum);
				
				//Car car = service.getCar();
				//car.getPrice();
				//service.removeCar();
			}
			
			
			
			if (usernum == 4) {
				break;				
			}
		}
		
		sc.close();
	}
	
	
	
	
	
	
	public static void mgrMember() {
		
		MemberMangementSystem console = new MemberMangementSystem();
		console.MS = new MemberService();
		// 사용자 입력(키보드) , 출력(콘솔)-> 텍스트 기반 !
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------Member Management System-------\n"
					+ "0.종료  1. 추가  2.조회  3.삭제  4.수정\n"
					+ "------------------------------------");
			int userCH = sc.nextInt(); sc.nextLine();
			
			if (userCH == 0) {
				break;
			}
			
			
			//create
			else if (userCH == 1){
				System.out.println("Name >");
				String inputname = sc.nextLine();
				System.out.println("Email >");
				String inputemail = sc.nextLine(); 
				console.MS.create(inputname, inputemail);
			}
			
			
			//Read
			else if (userCH == 2) {
				Member[] list = console.MS.read();
				for (int i = 0; i <list.length  ; i++) {
					String s = "";
					s += i + " : ";
					s += list[i].getName() + ",";
					s += list[i].getEmail();
					System.out.println(s);
				}
			}
			
			else if(userCH == 3) {
				Member[] list = console.MS.read();
				for (int i = 0; i < list.length; i++) {
					String s = "";
					s += i + " : ";
					s += list[i].getName();
					s += list[i].getEmail();
					System.out.println(s);
					System.out.println("수정할 번호를 입력하세요 >");
					int index = sc.nextInt(); sc.nextLine();
					Member member = console.MS.getMemberByIndex(index);
					if (member != null) {
						//수정절차
						System.out.println("Name : ");
						member.setName(sc.nextLine());
					}
					console.MS.update(member);
				}
			}
			
			else if (userCH == 4) {
				System.out.println("삭제할 번호를 입력하세요 >");
				int index = sc.nextInt(); sc.nextLine();
				console.MS.delete(index);
				
			}
			
			
		}
		
		
		

		
		
		
		
		console.MS = null;
		console = null;
		sc.close();
		//닫기
	}

}
