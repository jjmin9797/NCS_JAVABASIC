package com.bit.movie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 콘솔앱 -> 콘솔실행용
 * 1. Movie 어디에 저장되어 있는가?
 * 2. 객체 - 참조로 전달,반환  : 개수는 몇 개 인가? 파악 해야한다. ! ! !
 * 3. 참조할 수 있다면 변경할 수 있다... !
 * 4. 접근자 제한을 하거나, 사본을 생성해서 전달,반환
 * 메모리에 데이터들을 저장하고 있다보니...
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
					+ "0. 종료  1.영화 관련 업무  2.감독 관련 업무  3.배우 관련 업무");
			cmd = kb.nextInt(); kb.nextLine();
			
			if (cmd == 0) {
				break;
			}
			
			
			//영화 관련----------------------------------------------------------------------------------
			if (cmd == 1) {
				System.out.println("1. 영화 목록 보기  2. 영화 추가  3. 영화 수정   4. 영화 삭제 5.영화검색 -> 배우");
				System.out.println( "cmd > ");
				cmd = kb.nextInt(); kb.nextLine();
				
				if (cmd == 1) {
					Movie[] list  = sv.findAllMovie();
					if (list.length == 0 ) {
						System.out.println("등록된 영화가 없습니다 ! \n"
								+ "영화를 등록해주세요 ! ");
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
					//영화이름 시간 장르 배우 감독 랭킹
					System.out.println("등록하는 영화 이름을 입력해 주세요 >");
					String a = kb.nextLine(); // 제목
					System.out.println("영화의 개봉일을 연월일 순으로 입력해주세요 !");
					int year = kb.nextInt(); kb.nextLine();
					int month = kb.nextInt(); kb.nextLine();
					int dayOfMonth = kb.nextInt(); kb.nextLine();
					LocalDate date = LocalDate.of(year, month, dayOfMonth);
					LocalTime time = LocalTime.of(0, 0);
					LocalDateTime b = LocalDateTime.of(date,time); //시간
					System.out.println("영화의 장르를 입력하세요. >");
					String c = kb.nextLine();//장르
					Actor[] list = sv.findAllactor();
					for (Actor actor : list) {
						System.out.println(count + " -> " + actor.toString());
						count++;
					}
					String[] lists = new String[3];
					for (int i = 0; i<3;i++) {
						System.out.println("원하는 배우를 선택해 주세요");
						int d = kb.nextInt();  kb.nextLine();
						String e = sv.rtActorName(d);
						lists[i] = e;
					}										
					// lists  는   배우
					System.out.println("원하는 감독을 선택해 주세요");
					long f = kb.nextLong();  kb.nextLine();
					String g = sv.rtDirName(f); //  감독					
					System.out.println("현재 랭킹을 입력해주세요 .");
					int h = kb.nextInt();  kb.nextLine(); //  랭킹
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
					System.out.println("삭제완료 !");
					continue;
				}
				
				if (cmd == 5) {
					System.out.println("영화를 검색할 영화를 입력해주세요! >");
					String movie = kb.nextLine();
					String[] result = sv.findActor(movie);
					for (int i = 0; i < result.length ; i++) {
						System.out.println(result[i]);
					}
					
				}
				
			}//end 영화관련업무-----------------------------------------------------------------------------------------------
			
			
			
			//감독 관련 업무-----------------------------------------------------------------------------------------------
			if (cmd == 2 ) {
				System.out.println("1. 감독 목록 보기  2. 감독 추가  3. 감독 수정   4. 감독 삭제");
				System.out.println( "cmd > ");
				cmd = kb.nextInt(); kb.nextLine();
				
				if (cmd == 1) {
					Object[] list  = sv.findAllDir();
					//dirrepo.findAll();
					if (list.length == 0 ) {
						System.out.println("등록된  감독님이 없습니다 ! \n"
								+ "감독을 등록해주세요 ! ");
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
					//이름 나이 성별 아이디 생일 키 수상경력\
					//"신정민",24, "남자",1,LocalDateTime.now(),180,{"정민","짱"}
					System.out.println("등록할 감독의 이름을 입력해주세요. >");
					String dirname = kb.nextLine();
					System.out.println("등록할 감독의 나이를 입력하세요 >");
					int age = kb.nextInt(); kb.nextLine();
					System.out.println("등록할 감독의 성별을 입력해주세요. >");
					String sex = kb.nextLine();
					int dirid = dircount;
					dircount ++;
					LocalDateTime time = sv.rtdateDir();
					//dirrepo.rtdate();
					System.out.println("등록할 감독의 키를 입력하세요 >");
					int hei = kb.nextInt(); kb.nextLine();
					String[] award = new String[2];
					System.out.println("등록할 감독의 수상경력을 입력해주세요. >");
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
				
			}//감독관련 업무 end-----------------------------------------------------------------------------------------------
			
			
			
			//배우 관련 업무-----------------------------------------------------------------------------------------------
			if (cmd == 3 ) {
				System.out.println("1. 배우 목록 보기  2. 배우 추가  3. 배우 수정   4. 배우 삭제   5.배우별 작품 검색");
				System.out.println( "cmd > ");
				cmd = kb.nextInt(); kb.nextLine();
				
				
				//배우 목록 보기
				if (cmd == 1) {
					Object[] list  = sv.findAllactor();
					//actorrepo.findAll();
					if (list.length == 0 ) {
						System.out.println("등록된 배우가 없습니다 ! \n"
								+ "배우를 등록해주세요 ! ");
					}else {
						for(Object actor : list) {
							
							System.out.println(count + "->"+ actor.toString());
							count++;
							
							
						}
					}
					count = 1;
					continue;
				}//배우목록보기 end
				
				//배우 추가
				if (cmd == 2) {
					//이름 나이 성별 아이디 생일 키 수상경력\
					//"신정민",24, "남자",1,LocalDateTime.now(),180,{"정민","짱"}
					System.out.println("등록할  배우의 이름을 입력해주세요. >");
					String dirname = kb.nextLine();
					System.out.println("등록할 배우의 나이를 입력하세요 >");
					int age = kb.nextInt(); kb.nextLine();
					System.out.println("등록할 배우의 성별을 입력해주세요. >");
					String sex = kb.nextLine();
					int dirid = actorcount;
					actorcount ++;
					LocalDateTime time = sv.rtdateActor();
					//actorrepo.rtdate();
					System.out.println("등록할 배우의 키를 입력하세요 >");
					int hei = kb.nextInt(); kb.nextLine();
					String[] award = new String[2];
					System.out.println("등록할 배우의 수상경력을 입력해주세요. >");
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
					System.out.println("찾고있는 배우의 이름을 입력해주세요 >");
					String actorname = kb.nextLine();
					String[] result = sv.findMovie(actorname);
					if (result != null) {
						for (int i=0; i<result.length;i++) {
							System.out.println(result[i]);
						}
					}else {
						System.out.println("검색 결과가 없습니다.");
					}
					
					
					continue;
				}
			
			}// 배우 관련 업무 end-----------------------------------------------------------------------------------------------
			
		}//while end
		

		
		kb.close();
	}
	

}
