package Model;

import processing.core.PApplet;

public class Circle extends Figure{
	String [] atributes;
	public Circle(int posX, int posY, int tam, int dir,float r, float g, float b,PApplet app) {
		super(posX, posY, tam, dir,r,g,b,  app);
		// TODO Auto-generated constructor stub
		//atributes= app.loadStrings("QuizAtributes.txt");
	}
	
	public void checkArray() {
		super.checkArray();
	}

	void paintWithTxt() {
		//app.ellipse(150, 150, 150, 150);
	}
	
	public void move(){
		
	}
	
	void bounce() {
		
	}
	
	void stopMove() {
		
	}
	
	
	
	public void paintWithClick() {
		app.fill(this.r,this.g, this.b);
		app.ellipse(this.posX, this.posY, this.tam, this.tam);
		
	}

}
