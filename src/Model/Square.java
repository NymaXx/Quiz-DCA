package Model;

import processing.core.PApplet;

public class Square extends Figure{

	
	public Square(int posX, int posY, int tam, int dir,float r, float g, float b, PApplet app) {
		super(posX, posY, tam, dir,r,g,b, app);
		
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void checkArray() {
		super.checkArray();
	}
	
	public void paintWithTxt() {
		//app.ellipse(50,50,50,50);
		super.paintWithTxt();
	}
	
	public void move(){
		
	}
	
	void bounce() {
		
	}
	
	void stopMove() {
		
	}
	
	
	
	 public void paintWithClick() {
		 app.rectMode(CENTER);
		app.fill(this.r,this.g, this.b);
		app.rect(this.posX, this.posY, this.tam,this.tam);
		
		
	}

}
