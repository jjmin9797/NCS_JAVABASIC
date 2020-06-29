/*
 * ��ü ������ ���� ���� ��ü���� ��ȣ �ۿ��ϴ� ���α׷�
 * - ��ü ���� ���� (���, ����)
 * - ���� �� ������ ���� ����, ��ȯ, ȣ���ϴ� �帧 !
 * - ��ü ��ü�� ���� ��, �����ϴ� ��� ���� ��, ���� ���� ������Ʈ !
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

	
	// ���� �Լ� ȣ��
	public static void main(String[] args) {
//		mgrMember();
		parking();
	}
	
	
	
	public static void parking() {
		Scanner sc = new Scanner(System.in);
		CarParking service = new CarParking(10); //�ڿ� 20�� �ִ� 20������ �����͸� ��������� �ִ�
		
		while (true) {		
			
			String state = service.getState();
			System.out.println("-----------Parking System-----------\n"
					+ "1.���� In  2.���� Out  3.������ ��Ȳ��   4.���� \n"
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
				System.out.println("���� ��ȣ >");
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
		// ����� �Է�(Ű����) , ���(�ܼ�)-> �ؽ�Ʈ ��� !
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------Member Management System-------\n"
					+ "0.����  1. �߰�  2.��ȸ  3.����  4.����\n"
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
					System.out.println("������ ��ȣ�� �Է��ϼ��� >");
					int index = sc.nextInt(); sc.nextLine();
					Member member = console.MS.getMemberByIndex(index);
					if (member != null) {
						//��������
						System.out.println("Name : ");
						member.setName(sc.nextLine());
					}
					console.MS.update(member);
				}
			}
			
			else if (userCH == 4) {
				System.out.println("������ ��ȣ�� �Է��ϼ��� >");
				int index = sc.nextInt(); sc.nextLine();
				console.MS.delete(index);
				
			}
			
			
		}
		
		
		

		
		
		
		
		console.MS = null;
		console = null;
		sc.close();
		//�ݱ�
	}

}
