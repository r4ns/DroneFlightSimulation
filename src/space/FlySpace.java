package space;

import utility.Cube;

public class FlySpace {
	private Cube velikaKocka;
	private Cube malaKocka;
	public int granica=0;
	private Cube [] nizPrepreka;
	private Cube prepreka;
	private Cube prepreka1;
	
	
	public FlySpace(Cube velikaKocka, Cube malaKocka, int granica, Cube[] nizPrepreka) {
		this.velikaKocka = velikaKocka;
		this.malaKocka = malaKocka;
		this.granica = granica;
		this.nizPrepreka = nizPrepreka;
	}
	
	
	public FlySpace(Cube velikaKocka, Cube malaKocka, int granica) {
		this.velikaKocka = velikaKocka;
		this.malaKocka = malaKocka;
		this.granica = granica;
	}
	
	public FlySpace(Cube velikaKocka, Cube malaKocka, int granica, Cube prepreka){
		this(velikaKocka, malaKocka, granica);
		this.prepreka=prepreka;
		
	}
	public FlySpace(Cube velikaKocka, Cube malaKocka, int granica, Cube prepreka, Cube prepreka1){
		this(velikaKocka, malaKocka, granica,prepreka);
		this.prepreka1=prepreka1;
		
	}
	

	public Cube getVelikaKocka() {
		return velikaKocka;
	}

	public Cube getMalaKocka() {
		return malaKocka;
	}

	public int getGranica() {
		return granica;
	}

	public void setVelikaKocka(Cube velikaKocka) {
		this.velikaKocka = velikaKocka;
	}

	public void setMalaKocka(Cube malaKocka) {
		this.malaKocka = malaKocka;
	}

	public void setGranica(int granica) {
		this.granica = granica;
	}
	
	public Cube getPrepreka() {
		return prepreka;
	}
	public void setPrepreka(Cube prepreka) {
		this.prepreka = prepreka;
	}
	public Cube[] getNizPrepreka() {
		return nizPrepreka;
	}
	public void setNizPrepreka(Cube[] nizPrepreka) {
		this.nizPrepreka = nizPrepreka;
	}


	public Cube getPrepreka1() {
		return prepreka1;
	}


	public void setPrepreka1(Cube prepreka1) {
		this.prepreka1 = prepreka1;
	}
	
	
	
	
	
}
