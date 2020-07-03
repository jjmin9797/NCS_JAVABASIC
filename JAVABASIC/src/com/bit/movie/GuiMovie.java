package com.bit.movie;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class GuiMovie {
	Service sv = new Service();
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Frame main = new Frame("Movie Management System") ;
		Panel p1 = new Panel();
		
		
		Button movieWork = new Button();
		Button dirWork = new Button();
		Button actorWork = new Button();
		Button exit = new Button();
		
		
		Label info = new Label("원하는 버튼을 클릭하세요.");
		
		
		TextField tf1 = new TextField("검색/입력",20);
		
		
		movieWork.setLabel("영화 관련 업무");
		dirWork.setLabel("감독 관련 업무");
		actorWork.setLabel("배우 관련 업무");
		exit.setLabel("종료");
		
		
		
		
		p1.add(info);
		p1.add(movieWork);
		p1.add(dirWork);
		p1.add(actorWork);
		p1.add(exit);
		
		p1.add(tf1);
		main.add(p1);
		
		
		main.setLocation(300, 300);
		main.setSize(500,500);
		main.setVisible(true);
	}

}
