package View;

import java.util.ArrayList;

import Model.CanvasM;
import Model.Circle;
import Model.Figure;
import Model.Square;
import processing.core.PApplet;

public class Main extends PApplet {
	
	CanvasM canvasM;
	Figure fig;
	Square squ;
	Circle cir;
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	
	
	public ArrayList<Square> squares;
	public ArrayList<Circle> circles;
	int f =5;
	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		canvasM = new CanvasM(500,500,this);
		//fig= new Figure(50,50,50,50,50,this);
		//squ= new Square(50,50,50,50,50,this);
		//cir= new Circle(50,50,50,50,50,this);
		
		squares = new ArrayList<Square>();
		circles = new ArrayList<Circle>();
		
		
		
		
		
		
		
	}
	
	public void draw() {
		background(0);
		//squ.paintWithTxt();
		//cir.paintWithTxt();
		//fig.move();
		//squ.checkArray();
		
		canvasM.create();

		/*for(int i= squares.size()- 1; i>=0; i--) {
			Square square = squares.get(i);
			square.paintWithClick();
			
		}

		for(int e= circles.size()- 1; e>=0; e--) {
			Circle circle = circles.get(e);
			circle.paintWithClick();
			System.out.println("funciona");
			
		}*/
		
		
	}
	
	
	public void mousePressed() {
		canvasM.WClick();
		System.out.println("funciona");
		
		/*int num = (int) random(0,3);
		switch(num) {
		case 0:
			circles.add(new Circle(mouseX, mouseY,(int)random(30,80),1, random(255), random(255), random(255), this));
			System.out.println("agarra");
			break;
		case 1: 
			squares.add(new Square(mouseX, mouseY,(int)random(30,80),1, random(255), random(255), random(255), this));
			break;*/
			
	}
	}
	
	//System.out.println("funciona");

