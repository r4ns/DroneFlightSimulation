package space;

import java.util.ArrayList;


import drone.Cube;

public class FlySpace {
	
	private Cube vecaKocka;
	private Cube manjaKocka;
	private ArrayList<Cube> prepreke= new ArrayList<Cube>();
	
	
	
	public FlySpace(int[] start, int duzina, int razmak){
		
		vecaKocka= new Cube(start,duzina);
		int x=start[0]+razmak;
		int y=start[1]+razmak;
		int z=start[2]+razmak;
		int d=duzina-razmak-razmak;
		manjaKocka= new Cube(new int[]{x,y,z},d);
		
		
	}



	public Cube getVecaKocka() {
		return vecaKocka;
	}


	public Cube getManjaKocka() {
		return manjaKocka;
	}


	

	public void setVecaKocka(Cube vecaKocka) {
		this.vecaKocka = vecaKocka;
	}


	public void setManjaKocka(Cube manjaKocka) {
		this.manjaKocka = manjaKocka;
	}



	public ArrayList<Cube> getPrepreke() {
		return prepreke;
	}



	public void setPrepreke(ArrayList<Cube> prepreke) {
		this.prepreke = prepreke;
	}
	public void dodajPrepreku(int[] start){
		Cube prepreka=new Cube(start,2);
		if(!manjaKocka.checkCubeIntersection(prepreka)&&vecaKocka.checkCoordinates(start)){
			prepreke.add(prepreka);
		}
	}




	

	
	
}
