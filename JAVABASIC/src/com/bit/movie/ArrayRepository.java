package com.bit.movie;

import java.util.Arrays;

public class ArrayRepository implements Repository{
	private Movie[] repo;
	private int seq;// 저장할 요소번호, 현재 길이
	
	public ArrayRepository() {
		repo = new Movie[5];
		seq = 0;

		
	}

	@Override
	public void save(Movie arg) {
		if(arg != null) {
			repo[seq] = arg;
			++seq;
			arg.setId(seq);// 1~ ++
			System.out.println(seq+"개 저장됨");
		}
		if (seq == repo.length) {
			//배열이 차면 더 긴 새배열을 만든뒤 옮긴다 !
			System.out.println("배열 확장");
			Movie[] temp = new Movie[seq + 5];
			for (int i=0; i<seq; ++i) {
				temp[i] = repo[i];
			}
			repo = temp;
		}
		
		
		
	}

	@Override
	public Movie[] findAll() {
		// 현재까지 저장되어 있는 것만 반환
		//배열 요소들을 연속된 상태로 저장한다. ...메서드, 클레스
		Movie[] rt = Arrays.copyOf(repo,seq);
		return rt;
	}

	@Override
	public Movie findOneById(long id) {
		for (Movie m : repo) { //꽉찬 상태 아님 !
			if(m.getId() == id) {
				return m;
			}
		}
		System.out.println("not found : " + id);
		return null;
	}

	@Override
	public void update(Movie movie) {
		
		
		// 수정 - 교체
		for(int i=0;i<repo.length;++i) {
			if(repo[i] != null) {
				if( repo[i].getId() == movie.getId() ) {
					repo[i] = movie;
					break;
				}
			}
		}
		
		
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		// 연속성 유지해야 한다..
		for(int i=0; i<seq;++i) {
			if(repo[i].getId() == id) {
				repo[i] = repo[seq-1];
				repo[seq-1] = null;
				--seq;// 저장된 개수가 감소
				break;
			}
		}
		
	}
	
}
