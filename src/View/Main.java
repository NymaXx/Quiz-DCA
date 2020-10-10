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
		fig= new Figure(50,50,50,50,50,5,5,this);
		squ= new Square(50,50,50,50,50,5,5,this);
		//cir= new Circle(50,50,50,50,50,this);
		
		
		
		
		
		
		
		
		
	}
	
	public void draw() {
		background(0);
		//squ.paintWithTxt();
		//cir.paintWithTxt();
		
		squ.checkArray();
		
		canvasM.create();
		fig.move();
		
		
	}
	
	
	public void mousePressed() {
		canvasM.WClick();
		System.out.println("funciona");
		
		
			
	}
	}
	
	//System.out.println("funciona");

