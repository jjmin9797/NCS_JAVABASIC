package com.bit.movie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
public class ActorRepository implements PersonRepository<Actor>{
	//CRUD
	private Actor[] actorlist;
	private int seq;
	Scanner kb = new Scanner(System.in);
	public ActorRepository () {
		actorlist = new Actor[10];
		seq = 0;
	}
	@Override
	public void save(Actor arg) {
		if (arg != null) {
			actorlist[seq] = arg;
			++seq;
			arg.setId(seq);// 1~ ++
			System.out.println(seq+"명의 배우 존재");
		}
	}
	


	@Override
	public Actor[] findAll() {
		Actor[] rt = Arrays.copyOf(actorlist,seq);
		return rt;
	}

	@Override
	public Actor findOneById(long id) {
		for (Actor m : actorlist) { //꽉찬 상태 아님 !
			if(m.getId() == id) {
				return m;
			}
		}
		System.out.println("not found : " + id);
		return null;

	}

	@Override
	public void update(Actor ob) {
		for(int i=0;i<actorlist.length;++i) {
			if(actorlist[i] != null) {
				if( actorlist[i].getId() == ob.getId() ) {
					actorlist[i] = ob;
					break;
				}
			}
		}
		
	}

	@Override
	public void remove(long id) {
		for(int i=0; i<seq;++i) {
			if(actorlist[i].getId() == id) {
				actorlist[i] = actorlist[seq-1];
				actorlist[seq-1] = null;
				--seq;// 저장된 개수가 감소
				break;
			}
		}
		
	}
	@Override
	public String rtname(long id) {
		for(int i=0 ; i < actorlist.length; i++) {
			if (actorlist[i].getId() == id) {
				return actorlist[i].getName();
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		return null;
	}
	@Override
	public LocalDateTime rtdate() {
		System.out.println("배우의 생일을 년,월,일 순으로 하나씩 입력해주세요!");
		int year = kb.nextInt(); kb.nextLine();
		int month = kb.nextInt(); kb.nextLine();
		int dayOfMonth = kb.nextInt(); kb.nextLine();
		LocalDate date = LocalDate.of(year, month, dayOfMonth);
		LocalTime time = LocalTime.of(0, 0);
		LocalDateTime b = LocalDateTime.of(date,time); //시간
		return b;

	}
	
	

	
}
