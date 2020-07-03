package com.bit.movie;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * ��ȭ ���� model
 * Value Object
 * ��ü�� �ڽ��� �ʵ带 �� �����ؾ��Ѵ� !!!.!!!
 * 
 * @author bitcamp
 *
 */


public class Movie {
	//filed ����
	public Movie() { //�⺻������ �߰��ؾ� new ����
		super();
	}
	
	
	
	public Movie(String title, LocalDateTime playdate, String genr, String[] actor, String director, int rank) {
		
		this.title = title;
		this.playdate = playdate;
		this.genr = genr;
		this.actor = actor;
		this.director = director;
		this.rank = rank;
	}
	
	//���� ������ !
	public Movie(Movie arg) {
		this.title = arg.getTitle();
		this.playdate = arg.getPlaydate();
		this.genr = arg.getGenr();
		this.actor = arg.getActor().clone();
		this.director = arg.getDirector();
		this.rank = arg.getRank();
	}
	
	
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", playdate=" +  playdate.toLocalDate() + "\n genr=" + genr + " actor="
				+ Arrays.toString(actor) + ", director=" + director + ", rank=" + rank + "]";
	}



	private long id; // �ĺ���
	private String title ; // ����
	private LocalDateTime playdate; //������
	private String genr; //  �帣
	private String[] actor;// ���
	//private int actorId;
	private String director ;
	//private int directorId ;// ����
	private int rank; // ��ũ
	public long getId() {
		return id;
	}
	
	// getter setter
	public void setId(long id) {
		if (this.id == 0) {
		this.id = id;
		}
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDateTime getPlaydate() {
		return playdate;
	}
	public void setPlaydate(LocalDateTime playdate) {
		this.playdate = playdate;
	}
	public String getGenr() {
		return genr;
	}
	public void setGenr(String genr) {
		this.genr = genr;
	}
	public String[] getActor() {
		return actor;
	}
	public void setActor(String[] actor) {
		this.actor = actor;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
}
