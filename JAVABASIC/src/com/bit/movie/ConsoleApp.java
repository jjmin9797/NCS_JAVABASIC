package com.bit.movie;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
		Repository repo = new ArrayRepository();
		Movie sample = new Movie(
				"���� ��ȥ��",
				LocalDateTime.now(),
				"Comic",
				new String[] {"�庸��","�ڵ���"},
				"������",
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
					System.out.println("��ϵ� ��ȭ�� �����ϴ� ! \n"
							+ "��ȭ�� ������ּ��� ! ");
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
