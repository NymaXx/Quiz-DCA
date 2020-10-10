package View;

import Model.Figure;
import processing.core.PApplet;

public class Main extends PApplet {
	
	Canvas canvas;
	Figure fig;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	
	

	int f =5;
	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		canvas = new Canvas(500,500,this);
		fig= new Figure(50,50,50,50,50,this);
		fig.checkArray();
		
		
	}
	
	public void draw() {
		background(0);
		
		
	}
	
	
}
