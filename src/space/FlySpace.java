package space;

import utility.Cube;

public class FlySpace {
	private Cube velikaKocka;
	private Cube malaKocka;
	public int granica=0;
	private Cube prepreka;
	
	
	public FlySpace(Cube velikaKocka, Cube malaKocka, int granica) {
		
		this.velikaKocka = velikaKocka;
		this.malaKocka = malaKocka;
		this.granica = granica;
	}

	public FlySpace(Cube velikaKocka, Cube malaKocka, int granica, Cube prepreka) {
		
		this.velikaKocka = velikaKocka;
		this.malaKocka = malaKocka;
		this.granica = granica;
		this.prepreka = prepreka;
	}

	public Cube getPrepreka() {
		return prepreka;
	}

	

	public void setPrepreka(Cube prepreka) {
		this.prepreka = prepreka;
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
	
	
}