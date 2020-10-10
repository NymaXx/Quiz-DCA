package Model;

import processing.core.PApplet;

 public class Figure extends PApplet {
	int posX, posY;
	int tam;
	int dir;
	float r,g,b;
	PApplet app;
	String [] atributes;
	String one,two,three,four,five,six,seven;
	
	String []oneL;
	String []twoL;
	String []threeL;
	String []fourL;
	String []fiveL;
	String []sixL;
	String []sevenL;
	
	
	
	
	
	public Figure(int posX, int posY, int tam, int dir,float r, float g, float b, PApplet app){
		this.posX=posX;
		this.posY=posY;
		this.tam=tam;
		this.dir=dir;
		this.r=r;
		this.g=g;
		this.b=b;
		this.app=app;
		atributes= app.loadStrings("QuizAtributes.txt");
		
		
	}
	
	
	public void checkArray() { //recorro el txt y guardo cada linea de texto como un string
		for(int i=0; i< atributes.length; i++) {
		one=atributes[0];
		two=atributes[1];
		three=atributes[2];
		four=atributes[3];
		five=atributes[4];
		six=atributes[5];
		seven=atributes[6];
		
		oneL= one.split(" ");
		twoL= two.split(" ");
		threeL= three.split(" ");
		fourL= four.split(" ");
		fiveL= five.split(" ");
		sixL= six.split(" ");
		sevenL= seven.split(" ");
		
		
		
	}
		}
		
		
		
	
	
	public void paintWithTxt() {
		
		for(int e=0; e<oneL.length; e++) {
			System.out.println(oneL[0]);
			//if(oneL[0])
		}
		//for(int i=0; i< oneL.length; i++) {
		/*if(!oneL.equals(null)) {
			if(oneL[0]=="cuadrado") {
				float a= Float.parseFloat(oneL[1]);
				float b= Float.parseFloat(oneL[2]);
				float c= Float.parseFloat(oneL[3]);
				app.rect(b,c,a,a);
				
			}
		}*/
		
			
	}
	
	public void move(){
		
		
		
	}
	
	void bounce() {
		
	}
	
	void stopMove() {
		if(PApplet.dist(this.posX, this.posY, app.mouseX,app.mouseY )<= this.tam) {
			this.dir*=0;
		}
	}
	
		
	void paintWithClick() {
	//Sobreescrito en cada clase HIJA	
	}


	
	//getters and setters
	
	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public int getTam() {
		return tam;
	}


	public void setTam(int tam) {
		this.tam = tam;
	}


	public int getDir() {
		return dir;
	}


	public void setDir(int dir) {
		this.dir = dir;
	}

/*
	public String[] getAtributes() {
		return Atributes;
	}


	public void setAtributes(String[] atributes) {
		Atributes = atributes;
	}*/
	
	
	
	
	
	
}
