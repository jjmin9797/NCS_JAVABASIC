package com.bit.movie;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
		Repository repo = new ArrayRepository();
		Movie sample = new Movie(
				"느그 결혼식",
				LocalDateTime.now(),
				"Comic",
				new String[] {"장보영","박동건"},
				"신정민",
				1
				) ;
		
		Scanner kb = new Scanner(System.in);
		String cmd ;
		while (true) {
			System.out.println( "cmd > ");
			cmd = kb.nextLine();
			int count = 1;
			if (cmd.equals("quit")) {
				break;
			}
			
			if (cmd.equals("list")) {
				Movie[] list  = repo.findAll();
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
			}//list end
			
			if (cmd.equals("new")) {
				repo.save(new Movie(sample));

				
			}//new end
			
			if (cmd.equals("edit")) {
				System.out.println("Edit ID > ");
				long edit = kb.nextLong(); kb.nextLine();
				Movie movie = repo.findOneById(edit);
				System.out.println(movie);
				if (movie != null) {
					System.out.println("Title : ");
					String title = kb.nextLine();
					movie.setTitle(title);
					repo.update(movie);
				}
			}//edit end
			
			if (cmd.equals("del")) {
				System.out.println("Delete Id >");
				long del = kb.nextInt(); kb.nextLine();
				repo.remove(del);
			}
			
			
		}//while end
		

		
		kb.close();
	}
	

}
