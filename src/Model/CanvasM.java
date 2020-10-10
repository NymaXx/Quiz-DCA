package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class CanvasM {
	
	public ArrayList<Square> squares;
	public ArrayList<Circle> circles;
	
	
	PApplet app;
	int sizeX, sizeY;
	
	
	public CanvasM(int sizeX, int sizeY, PApplet app){
		this.app=app;
		this.sizeX=sizeX;
		this.sizeY=sizeY;
		squares = new ArrayList<Square>();
		circles = new ArrayList<Circle>();
		
		
	}
	
	public void create() {
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
}
