package Model;

import processing.core.PApplet;

public class Figure extends PApplet {
	int posX, posY;
	int tamX, tamY;
	int dir;
	PApplet app;
	String [] Atributes;
	
	Figure(int posX, int posY, int tamX, int tamY, int dir, PApplet app){
		this.posX=posX;
		this.posY=posY;
		this.tamX=tamX;
		this.tamY=tamY;
		this.dir=dir;
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


	public String[] getAtributes() {
		return Atributes;
	}


	public void setAtributes(String[] atributes) {
		Atributes = atributes;
	}
	
	
	
	
	
	
}
