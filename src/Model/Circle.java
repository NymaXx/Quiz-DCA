package Model;

import processing.core.PApplet;

public class Circle extends Figure{
	String [] atributes;
	Circle(int posX, int posY, int tamX, int tamY, int dir,PApplet app) {
		super(posX, posY, tamX, tamY, dir,  app);
		// TODO Auto-generated constructor stub
		atributes= app.loadStrings("QuizAtributes.txt");
	}
	
	public void checkArray() {
		super.checkArray();
	}

	void paintWithTxt() {
		
	}
	
	void move(){
		
	}
	
	void bounce() {
		
	}
	
	void stopMove() {
		
	}
	
	
	
	void paintWithClick() {
		
	}

}
