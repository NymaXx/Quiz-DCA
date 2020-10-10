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
		
		
		
	
	
	public void paintWithTxt() { //metodo para recorrer los arreglos creados a partir de las lineas del archivo TXT
		//recorre individualmente cada linea con un for individual y pinta la figura correspondiente
		
		
		for(int e=0; e<oneL.length; e++) {
			System.out.println(oneL[0]);
			if(oneL[0].equals("cuadrado")==true) {
				float a= Float.parseFloat(oneL[1]);
				float b= Float.parseFloat(oneL[2]);
				float c= Float.parseFloat(oneL[3]);
				app.rect(b,c,a,a);;
				
			}
		}
		
		for(int e=0; e<oneL.length; e++) {
			System.out.println(twoL[0]);
			if(twoL[0].equals("circulo")==true) {
				float a= Float.parseFloat(twoL[1]);
				float b= Float.parseFloat(twoL[2]);
				float c= Float.parseFloat(twoL[3]);
				app.ellipse(b,c,a,a);;
				
			}
		}
		
		for(int e=0; e<threeL.length; e++) {
			System.out.println(threeL[0]);
			if(threeL[0].equals("cuadrado")==true) {
				float a= Float.parseFloat(threeL[1]);
				float b= Float.parseFloat(threeL[2]);
				float c= Float.parseFloat(threeL[3]);
				app.rect(b,c,a,a);;
				
			}
		}
		
		for(int e=0; e<fourL.length; e++) {
			System.out.println(oneL[0]);
			if(fourL[0].equals("circulo")==true) {
				float a= Float.parseFloat(fourL[1]);
				float b= Float.parseFloat(fourL[2]);
				float c= Float.parseFloat(fourL[3]);
				app.ellipse(b,c,a,a);;
				
			}
		}
		
		for(int e=0; e<fiveL.length; e++) {
			System.out.println(oneL[0]);
			if(fiveL[0].equals("circulo")==true) {
				float a= Float.parseFloat(fiveL[1]);
				float b= Float.parseFloat(fiveL[2]);
				float c= Float.parseFloat(fiveL[3]);
				app.ellipse(b,c,a,a);;
				
			}
		}
		
		for(int e=0; e<sixL.length; e++) {
			System.out.println(sixL[0]);
			if(sixL[0].equals("cuadrado")==true) {
				float a= Float.parseFloat(sixL[1]);
				float b= Float.parseFloat(sixL[2]);
				float c= Float.parseFloat(sixL[3]);
				app.rect(b,c,a,a);;
				
			}
		}
		
		for(int e=0; e<sevenL.length; e++) {
			System.out.println(sevenL[0]);
			if(oneL[0].equals("cuadrado")==true) {
				float a= Float.parseFloat(sevenL[1]);
				float b= Float.parseFloat(sevenL[2]);
				float c= Float.parseFloat(sevenL[3]);
				app.rect(b,c,a,a);;
				
			}
		}
		
		
			
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
