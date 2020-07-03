package com.bit.movie;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * 영화 정보 model
 * Value Object
 * 객체는 자신의 필드를 잘 관리해야한다 !!!.!!!
 * 
 * @author bitcamp
 *
 */


public class Movie {
	//filed 정리
	public Movie() { //기본생성자 추가해야 new 가능
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
	
	//복사 생성자 !
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



	private long id; // 식별값
	private String title ; // 제목
	private LocalDateTime playdate; //개봉일
	private String genr; //  장르
	private String[] actor;// 배우
	//private int actorId;
	private String director ;
	//private int directorId ;// 디렉터
	private int rank; // 랭크
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
