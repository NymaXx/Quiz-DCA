package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class CanvasM {
	
	public ArrayList<Square> squares;
	public ArrayList<Circle> circles;
	public Square square;
	public Circle circle;
	
	PApplet app;
	int sizeX, sizeY;
	
	
	public CanvasM(int sizeX, int sizeY, PApplet app){
		this.app=app;
		this.sizeX=sizeX;
		this.sizeY=sizeY;
		squares = new ArrayList<Square>();
		circles = new ArrayList<Circle>();
		
		square= new Square(50,50,50,50,50,50,50,app);
		circle= new Circle(50,50,50,50,50,50,50,app);
		
		
	}
	
	public void createClicks() {
		if(!squares.equals(null)) {
		for(int i= squares.size()- 1; i>=0; i--) {
			squares.get(i).paintWithClick();
			//square.bounce();
		}
		}

		if(!circles.equals(null)) {
		for(int e= circles.size()- 1; e>=0; e--) {
			circles.get(e).paintWithClick();
			//circle.bounce();
		}
		}
		
		
}
	
	
	public void WClick() {
		int num =(int) app.random(0,2);
		switch(num) {
		case 0:
			circles.add(new Circle(app.mouseX, app.mouseY,(int)app.random(30,80),1, app.random(255), app.random(255), app.random(255),app));
			System.out.println(circles);
			break;
		case 1: 
			squares.add(new Square(app.mouseX, app.mouseY,(int)app.random(30,80),1, app.random(255), app.random(255), app.random(255),app));
			break;
	}
	}
	
	public void WTxt() {
		square.checkArray();
		circle.checkArray();
		square.paintWithTxt();
		circle.paintWithTxt();
	}
}
