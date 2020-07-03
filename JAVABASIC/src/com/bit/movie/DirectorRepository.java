package com.bit.movie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
public class DirectorRepository implements PersonRepository<Director>{

	private Director[] dirlist;
	private int seq;
	Scanner kb = new Scanner(System.in);
	public DirectorRepository() {
		dirlist = new Director[10];
		seq = 0;

	}

	@Override
	public void save(Director arg) {
		if (arg != null) {
			dirlist[seq] = arg;
			++seq;
			arg.setId(seq);// 1~ ++
			System.out.println(seq+"명의 감독 존재");
		}
		
	}

	@Override
	public Director[] findAll() {
		Director[] rt = Arrays.copyOf(dirlist,seq);
		return rt;
	}

	@Override
	public Director findOneById(long id) {
		for (Director m : dirlist) { //꽉찬 상태 아님 !
			if(m.getId() == id) {
				return m;
			}
		}
		System.out.println("not found : " + id);
		return null;
	}

	@Override
	public void update(Director ob) {
		for(int i=0;i<dirlist.length;++i) {
			if(dirlist[i] != null) {
				if( dirlist[i].getId() == ob.getId() ) {
					dirlist[i] = ob;
					break;
				}
			}
		}
		
	}

	@Override
	public void remove(long id) {
		for(int i=0; i<seq;++i) {
			if(dirlist[i].getId() == id) {
				dirlist[i] = dirlist[seq-1];
				dirlist[seq-1] = null;
				--seq;// 저장된 개수가 감소
				break;
			}
		}
		
	}

	@Override
	public String rtname(long id) {
		for(int i=0 ; i < dirlist.length; i++) {
			if (dirlist[i].getId() == id) {
				return dirlist[i].getName();
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		return null;
	}

	@Override
	public LocalDateTime rtdate() {
		System.out.println("감독의 생일을 년,월,일 순으로 하나씩 입력해주세요!");
		int year = kb.nextInt(); kb.nextLine();
		int month = kb.nextInt(); kb.nextLine();
		int dayOfMonth = kb.nextInt(); kb.nextLine();
		LocalDate date = LocalDate.of(year, month, dayOfMonth);
		LocalTime time = LocalTime.of(0, 0);
		LocalDateTime b = LocalDateTime.of(date,time); //시간
		return b;
	}
	

	
}
