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
	
	
	

	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		canvas = new Canvas(500,500,this);
		fig = new Figure(50,50,50,50,50,50,50,this);
		
	}
	
	public void draw() {
		background(0);
		canvas.basicPaint();
		//fig.checkArray();
        //fig.paintWithTxt();
        canvas.txtPaint();
		
		
		
		
	}
	
	
	public void mousePressed() {
		canvas.paintWClick();
		
		
		
			
	}
	}
	
	//System.out.println("funciona");

