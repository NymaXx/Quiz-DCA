package View;

import Model.CanvasM;
import processing.core.PApplet;

public class Canvas extends PApplet{

	int sizeX, sizeY;
	SquareV squ;
	CircleV cir;
	PApplet app;
	CanvasM canv;
	
	Canvas(int sizeX, int sizeY, PApplet app){
		this.sizeX= sizeX;
		this.sizeY=sizeY;
		this.app=app;
		canv= new CanvasM(500,500,app);
		
	}
	
	void txtPaint() {
		canv.WTxt();
	}
	
	void basicPaint() {
		canv.createClicks();
	}
	
	void paintWClick() {
		canv.WClick();
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
