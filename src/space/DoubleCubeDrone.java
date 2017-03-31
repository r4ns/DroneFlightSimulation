package space;
import drone.*;


public class DoubleCubeDrone{
	
	int x,y,z;
	
	int[]prvaTacka = {x,y,z};
	int[]drugaTacka = {x,y,z};
	int[]trecaTacka = {x,y,z};
	int[]cetvrtaTacka = {x,y,z};
	
	
	public DoubleCubeDrone(int[]a,int[]b,int[]g,int[]d){

			this.prvaTacka = a;
			this.prvaTacka = b;
			this.trecaTacka = g;
			this.cetvrtaTacka = d;
			
	}
	
	
	public String moveUp(){
		
		
		this.prvaTacka[1]++;
		this.prvaTacka[1]++;
		this.trecaTacka[1]++;
		this.cetvrtaTacka[1]++;
		
		return "Prva tacka : " + "("+prvaTacka[0]+","+prvaTacka[1]+","+prvaTacka[2]+")"+
			   "Druga tacka : " + "("+drugaTacka[0]+","+drugaTacka[1]+","+drugaTacka[2]+")"+
			   "Treca tacka : " + "("+trecaTacka[0]+","+trecaTacka[1]+","+trecaTacka[2]+")"+
			   "Cetvrta tacka : " + "("+cetvrtaTacka[0]+","+cetvrtaTacka[1]+","+cetvrtaTacka[2]+")";
		
	}
	
	
	public String moveDown(){
		
		this.prvaTacka[1]--;
		this.prvaTacka[1]--;
		this.trecaTacka[1]--;
		this.cetvrtaTacka[1]--;
		
		return "Prva tacka : " + "("+prvaTacka[0]+","+prvaTacka[1]+","+prvaTacka[2]+")"+
			   "Druga tacka : " + "("+drugaTacka[0]+","+drugaTacka[1]+","+drugaTacka[2]+")"+
			   "Treca tacka : " + "("+trecaTacka[0]+","+trecaTacka[1]+","+trecaTacka[2]+")"+
			   "Cetvrta tacka : " + "("+cetvrtaTacka[0]+","+cetvrtaTacka[1]+","+cetvrtaTacka[2]+")";
	}
	
	public String moveRight(){
		
		this.prvaTacka[0]++;
		this.prvaTacka[0]++;
		this.trecaTacka[0]++;
		this.cetvrtaTacka[0]++;
		
		return "Prva tacka : " + "("+prvaTacka[0]+","+prvaTacka[1]+","+prvaTacka[2]+")"+
			   "Druga tacka : " + "("+drugaTacka[0]+","+drugaTacka[1]+","+drugaTacka[2]+")"+
			   "Treca tacka : " + "("+trecaTacka[0]+","+trecaTacka[1]+","+trecaTacka[2]+")"+
			   "Cetvrta tacka : " + "("+cetvrtaTacka[0]+","+cetvrtaTacka[1]+","+cetvrtaTacka[2]+")";
	}
	
	public String moveLeft(){
		
		this.prvaTacka[0]--;
		this.prvaTacka[0]--;
		this.trecaTacka[0]--;
		this.cetvrtaTacka[0]--;
		
		return "Prva tacka : " + "("+prvaTacka[0]+","+prvaTacka[1]+","+prvaTacka[2]+")"+
			   "Druga tacka : " + "("+drugaTacka[0]+","+drugaTacka[1]+","+drugaTacka[2]+")"+
			   "Treca tacka : " + "("+trecaTacka[0]+","+trecaTacka[1]+","+trecaTacka[2]+")"+
			   "Cetvrta tacka : " + "("+cetvrtaTacka[0]+","+cetvrtaTacka[1]+","+cetvrtaTacka[2]+")";
	}
	
	public String moveBack(){
		
		this.prvaTacka[2]++;
		this.prvaTacka[2]++;
		this.trecaTacka[2]++;
		this.cetvrtaTacka[2]++;
		
		return "Prva tacka : " + "("+prvaTacka[0]+","+prvaTacka[1]+","+prvaTacka[2]+")"+
			   "Druga tacka : " + "("+drugaTacka[0]+","+drugaTacka[1]+","+drugaTacka[2]+")"+
			   "Treca tacka : " + "("+trecaTacka[0]+","+trecaTacka[1]+","+trecaTacka[2]+")"+
			   "Cetvrta tacka : " + "("+cetvrtaTacka[0]+","+cetvrtaTacka[1]+","+cetvrtaTacka[2]+")";
	}
	
	public String moveForth(){
		
		this.prvaTacka[2]--;
		this.prvaTacka[2]--;
		this.trecaTacka[2]--;
		this.cetvrtaTacka[2]--;
		
		return "Prva tacka : " + "("+prvaTacka[0]+","+prvaTacka[1]+","+prvaTacka[2]+")"+
			   "Druga tacka : " + "("+drugaTacka[0]+","+drugaTacka[1]+","+drugaTacka[2]+")"+
			   "Treca tacka : " + "("+trecaTacka[0]+","+trecaTacka[1]+","+trecaTacka[2]+")"+
			   "Cetvrta tacka : " + "("+cetvrtaTacka[0]+","+cetvrtaTacka[1]+","+cetvrtaTacka[2]+")";
	}
	
	public int[] getDonjaLevaTacka() {
		return prvaTacka;
	}
	public void setDonjaLevaTacka(int[] donjaLevaTacka) {
		this.prvaTacka = donjaLevaTacka;
	}
	public int[] getDonjaDesnaTacka() {
		return prvaTacka;
	}
	public void setDonjaDesnaTacka(int[] donjaDesnaTacka) {
		this.prvaTacka = donjaDesnaTacka;
	}
	public int[] getGornjaLevaGranica() {
		return trecaTacka;
	}
	public void setGornjaLevaGranica(int[] gornjaLevaGranica) {
		this.trecaTacka = gornjaLevaGranica;
	}
	public int[] getGornjaDesnaGranica() {
		return cetvrtaTacka;
	}
	public void setGornjaDesnaGranica(int[] gornjaDesnaGranica) {
		this.cetvrtaTacka = gornjaDesnaGranica;
	}
	
	
}
