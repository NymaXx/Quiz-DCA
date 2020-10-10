package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class CanvasM extends PApplet{
	
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
		for(int i= squares.size()- 1; i>=0; i--) {
			Square square = squares.get(i);
			square.paintWithClick();
			//square.move();
			//square.bounce();
		}

		for(int e= circles.size()- 1; e>=0; e--) {
			Circle circle = circles.get(e);
			circle.paintWithClick();
			//circle.move();
			//circle.bounce();
		}
		
		
}
	
	
	public void WClick() {
		int num = (int) app.random(0,3);
		switch(num) {
		case 0:
			circles.add(new Circle(app.mouseX, app.mouseY,(int)app.random(30,80),1, app.random(255), app.random(255), app.random(255), this));
			break;
		case 1: 
			squares.add(new Square(app.mouseX, app.mouseY,(int)app.random(30,80),1, app.random(255), app.random(255), app.random(255), this));
			break;
	}
	}
}
