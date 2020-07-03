package com.bit.movie;

import java.util.Arrays;

public class ArrayRepository implements Repository{
	private Movie[] repo;
	private int seq;// ������ ��ҹ�ȣ, ���� ����
	
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
			System.out.println(seq+"�� �����");
		}
		if (seq == repo.length) {
			//�迭�� ���� �� �� ���迭�� ����� �ű�� !
			System.out.println("�迭 Ȯ��");
			Movie[] temp = new Movie[seq + 5];
			for (int i=0; i<seq; ++i) {
				temp[i] = repo[i];
			}
			repo = temp;
		}
		
		
		
	}

	@Override
	public Movie[] findAll() {
		// ������� ����Ǿ� �ִ� �͸� ��ȯ
		//�迭 ��ҵ��� ���ӵ� ���·� �����Ѵ�. ...�޼���, Ŭ����
		Movie[] rt = Arrays.copyOf(repo,seq);
		return rt;
	}

	@Override
	public Movie findOneById(long id) {
		for (Movie m : repo) { //���� ���� �ƴ� !
			if(m.getId() == id) {
				return m;
			}
		}
		System.out.println("not found : " + id);
		return null;
	}

	@Override
	public void update(Movie movie) {
		
		
		// ���� - ��ü
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
		// ���Ӽ� �����ؾ� �Ѵ�..
		for(int i=0; i<seq;++i) {
			if(repo[i].getId() == id) {
				repo[i] = repo[seq-1];
				repo[seq-1] = null;
				--seq;// ����� ������ ����
				break;
			}
		}
		
	}
	
}
