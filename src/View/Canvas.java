package View;

import processing.core.PApplet;

public class Canvas extends PApplet{

	int sizeX, sizeY;
	SquareV squ;
	CircleV cir;
	PApplet app;
	
	Canvas(int sizeX, int sizeY, PApplet app){
		this.sizeX= sizeX;
		this.sizeY=sizeY;
		this.app=app;
		
	}
	
	void basicPaint() {
		
	}
	
	void paintWClick() {
		
	}
	
	
	//getters and setters

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	
	
}
