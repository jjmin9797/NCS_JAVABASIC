package com.bit.movie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �ܼ־� -> �ֽܼ����
 * 1. Movie ��� ����Ǿ� �ִ°�?
 * 2. ��ü - ������ ����,��ȯ  : ������ �� �� �ΰ�? �ľ� �ؾ��Ѵ�. ! ! !
 * 3. ������ �� �ִٸ� ������ �� �ִ�... !
 * 4. ������ ������ �ϰų�, �纻�� �����ؼ� ����,��ȯ
 * �޸𸮿� �����͵��� �����ϰ� �ִٺ���...
 * @author bitcamp
 * 
 */

public class ConsoleApp {

	public static void main(String[] args) {	
		Service sv = new Service();
		Scanner kb = new Scanner(System.in);
		int cmd ;
		int dircount= 1; 
		int actorcount = 1;
		
		
		
		
		
		while (true) {
			int count = 1;
			
			System.out.println("Movie Mangement System\n"
					+ "0. ����  1.��ȭ ���� ����  2.���� ���� ����  3.��� ���� ����");
			cmd = kb.nextInt(); kb.nextLine();
			
			if (cmd == 0) {
				break;
			}
			
			
			//��ȭ ����----------------------------------------------------------------------------------
			if (cmd == 1) {
				System.out.println("1. ��ȭ ��� ����  2. ��ȭ �߰�  3. ��ȭ ����   4. ��ȭ ���� 5.��ȭ�˻� -> ���");
				System.out.println( "cmd > ");
				cmd = kb.nextInt(); kb.nextLine();
				
				if (cmd == 1) {
					Movie[] list  = sv.findAllMovie();
					if (list.length == 0 ) {
						System.out.println("��ϵ� ��ȭ�� �����ϴ� ! \n"
								+ "��ȭ�� ������ּ��� ! ");
					}else {
						for(Movie movie : list) {
							
							System.out.println(count + "->"+ movie);
							count++;
							
							
						}
					}
					count = 1;
					continue;
				}//list end
				
				if (cmd == 2) {
					//��ȭ�̸� �ð� �帣 ��� ���� ��ŷ
					System.out.println("����ϴ� ��ȭ �̸��� �Է��� �ּ��� >");
					String a = kb.nextLine(); // ����
					System.out.println("��ȭ�� �������� ������ ������ �Է����ּ��� !");
					int year = kb.nextInt(); kb.nextLine();
					int month = kb.nextInt(); kb.nextLine();
					int dayOfMonth = kb.nextInt(); kb.nextLine();
					LocalDate date = LocalDate.of(year, month, dayOfMonth);
					LocalTime time = LocalTime.of(0, 0);
					LocalDateTime b = LocalDateTime.of(date,time); //�ð�
					System.out.println("��ȭ�� �帣�� �Է��ϼ���. >");
					String c = kb.nextLine();//�帣
					Actor[] list = sv.findAllactor();
					for (Actor actor : list) {
						System.out.println(count + " -> " + actor.toString());
						count++;
					}
					String[] lists = new String[3];
					for (int i = 0; i<3;i++) {
						System.out.println("���ϴ� ��츦 ������ �ּ���");
						int d = kb.nextInt();  kb.nextLine();
						String e = sv.rtActorName(d);
						lists[i] = e;
					}										
					// lists  ��   ���
					System.out.println("���ϴ� ������ ������ �ּ���");
					long f = kb.nextLong();  kb.nextLine();
					String g = sv.rtDirName(f); //  ����					
					System.out.println("���� ��ŷ�� �Է����ּ��� .");
					int h = kb.nextInt();  kb.nextLine(); //  ��ŷ
					Movie sample = new Movie(a,b,c,lists,g,h) ;					
					sv.saveMovie(new Movie(sample));
					//repo.save(new Movie(sample));
					continue;
					
				}//new end
				
				if (cmd == 3) {
					System.out.println("Edit ID > ");
					long edit = kb.nextLong(); kb.nextLine();
					Movie movie = sv.findOneByIdMovie(edit);
					//repo.findOneById(edit);
					System.out.println(movie);
					if (movie != null) {
						System.out.println("Title : ");
						String title = kb.nextLine();
						movie.setTitle(title);
						sv.updateMovie(movie);
						//repo.update(movie);
						continue;
					}
				}//edit end
				
				if (cmd == 4) {
					System.out.println("Delete Id >");
					long del = kb.nextInt(); kb.nextLine();
					sv.removeMovie(del);
					//repo.remove(del);
					System.out.println("�����Ϸ� !");
					continue;
				}
				
				if (cmd == 5) {
					System.out.println("��ȭ�� �˻��� ��ȭ�� �Է����ּ���! >");
					String movie = kb.nextLine();
					String[] result = sv.findActor(movie);
					for (int i = 0; i < result.length ; i++) {
						System.out.println(result[i]);
					}
					
				}
				
			}//end ��ȭ���þ���-----------------------------------------------------------------------------------------------
			
			
			
			//���� ���� ����-----------------------------------------------------------------------------------------------
			if (cmd == 2 ) {
				System.out.println("1. ���� ��� ����  2. ���� �߰�  3. ���� ����   4. ���� ����");
				System.out.println( "cmd > ");
				cmd = kb.nextInt(); kb.nextLine();
				
				if (cmd == 1) {
					Object[] list  = sv.findAllDir();
					//dirrepo.findAll();
					if (list.length == 0 ) {
						System.out.println("��ϵ�  �������� �����ϴ� ! \n"
								+ "������ ������ּ��� ! ");
					}else {
						for(Object actor : list) {
							
							System.out.println(count + "->"+ actor.toString());
							count++;
							
							
						}
					}
					count = 1;
					continue;
				}
				
				
				if (cmd == 2) {
					//�̸� ���� ���� ���̵� ���� Ű ������\
					//"������",24, "����",1,LocalDateTime.now(),180,{"����","¯"}
					System.out.println("����� ������ �̸��� �Է����ּ���. >");
					String dirname = kb.nextLine();
					System.out.println("����� ������ ���̸� �Է��ϼ��� >");
					int age = kb.nextInt(); kb.nextLine();
					System.out.println("����� ������ ������ �Է����ּ���. >");
					String sex = kb.nextLine();
					int dirid = dircount;
					dircount ++;
					LocalDateTime time = sv.rtdateDir();
					//dirrepo.rtdate();
					System.out.println("����� ������ Ű�� �Է��ϼ��� >");
					int hei = kb.nextInt(); kb.nextLine();
					String[] award = new String[2];
					System.out.println("����� ������ �������� �Է����ּ���. >");
					String award1 = kb.nextLine();
					String award2 = kb.nextLine();
					award[0] = award1;
					award[1] = award2;
					Director sample1 = new Director(dirname,age,sex,dirid,time,hei,award ) ;					
					sv.saveDir(sample1);
					//dirrepo.save(sample1);
					continue;
				}
				
				if (cmd == 3) {
					System.out.println("Edit ID > ");
					long edit = kb.nextLong(); kb.nextLine();
					Director dir = sv.findOneByIdDir(edit);
					//dirrepo.findOneById(edit);
					System.out.println(dir.toString());
					if (dir != null) {
						System.out.println("Rename : ");
						String name = kb.nextLine();
						dir.setName(name);
						sv.updateDir(dir);
						//dirrepo.update(dir);
						continue;
					}
				}
				if (cmd == 4) {
					System.out.println("Delete Id >");
					long del = kb.nextInt(); kb.nextLine();
					sv.removeDir(del);
					//dirrepo.remove(del);
					dircount --;
					continue;
				}
				
			}//�������� ���� end-----------------------------------------------------------------------------------------------
			
			
			
			//��� ���� ����-----------------------------------------------------------------------------------------------
			if (cmd == 3 ) {
				System.out.println("1. ��� ��� ����  2. ��� �߰�  3. ��� ����   4. ��� ����   5.��캰 ��ǰ �˻�");
				System.out.println( "cmd > ");
				cmd = kb.nextInt(); kb.nextLine();
				
				
				//��� ��� ����
				if (cmd == 1) {
					Object[] list  = sv.findAllactor();
					//actorrepo.findAll();
					if (list.length == 0 ) {
						System.out.println("��ϵ� ��찡 �����ϴ� ! \n"
								+ "��츦 ������ּ��� ! ");
					}else {
						for(Object actor : list) {
							
							System.out.println(count + "->"+ actor.toString());
							count++;
							
							
						}
					}
					count = 1;
					continue;
				}//����Ϻ��� end
				
				//��� �߰�
				if (cmd == 2) {
					//�̸� ���� ���� ���̵� ���� Ű ������\
					//"������",24, "����",1,LocalDateTime.now(),180,{"����","¯"}
					System.out.println("�����  ����� �̸��� �Է����ּ���. >");
					String dirname = kb.nextLine();
					System.out.println("����� ����� ���̸� �Է��ϼ��� >");
					int age = kb.nextInt(); kb.nextLine();
					System.out.println("����� ����� ������ �Է����ּ���. >");
					String sex = kb.nextLine();
					int dirid = actorcount;
					actorcount ++;
					LocalDateTime time = sv.rtdateActor();
					//actorrepo.rtdate();
					System.out.println("����� ����� Ű�� �Է��ϼ��� >");
					int hei = kb.nextInt(); kb.nextLine();
					String[] award = new String[2];
					System.out.println("����� ����� �������� �Է����ּ���. >");
					String award1 = kb.nextLine();
					String award2 = kb.nextLine();
					award[0] = award1;
					award[1] = award2;
					Actor sample1 = new Actor(dirname,age,sex,dirid,time,hei,award) ;				
					sv.saveActor(sample1);
					//actorrepo.save(sample1);
					continue;
				}
				
				if (cmd == 3) {
					System.out.println("Edit ID > ");
					long edit = kb.nextLong(); kb.nextLine();
					Actor actor = sv.findOneByIdActor(edit);
					//actorrepo.findOneById(edit);
					System.out.println(actor.toString());
					if (actor != null) {
						System.out.println("Rename : ");
						String name = kb.nextLine();
						actor.setName(name);
						sv.updateActor(actor);
						//actorrepo.update(actor);
					}
					continue;
				}
				
				if (cmd == 4) {
					System.out.println("Delete Id >");
					long del = kb.nextInt(); kb.nextLine();
					sv.removeActor(del);
					//actorrepo.remove(del);
					actorcount --;
					continue;
				}
			
				
				if(cmd == 5) {
					System.out.println("ã���ִ� ����� �̸��� �Է����ּ��� >");
					String actorname = kb.nextLine();
					String[] result = sv.findMovie(actorname);
					if (result != null) {
						for (int i=0; i<result.length;i++) {
							System.out.println(result[i]);
						}
					}else {
						System.out.println("�˻� ����� �����ϴ�.");
					}
					
					
					continue;
				}
			
			}// ��� ���� ���� end-----------------------------------------------------------------------------------------------
			
		}//while end
		

		
		kb.close();
	}
	

}
