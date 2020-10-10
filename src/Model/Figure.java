package Model;

import processing.core.PApplet;

 public class Figure extends PApplet {
	int posX, posY;
	int tamX, tamY;
	int dir;
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
	
	
	
	
	
	public Figure(int posX, int posY, int tamX, int tamY, int dir, PApplet app){
		this.posX=posX;
		this.posY=posY;
		this.tamX=tamX;
		this.tamY=tamY;
		this.dir=dir;
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
		}
		
		oneL= one.split(" ");
		twoL= two.split(" ");
		threeL= three.split(" ");
		fourL= four.split(" ");
		fiveL= five.split(" ");
		sixL= six.split(" ");
		sevenL= seven.split(" ");
		
		System.out.println(one);
		
		
		
		
		
	}
	
	
	
	void move(){
		
	}
	
	void bounce() {
		
	}
	
	void stopMove() {
		
	}
	
	void paintWithTxt() {
		
	}
	
	void paintWithClick() {
		
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


	public int getTamX() {
		return tamX;
	}


	public void setTamX(int tamX) {
		this.tamX = tamX;
	}


	public int getTamY() {
		return tamY;
	}


	public void setTamY(int tamY) {
		this.tamY = tamY;
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
