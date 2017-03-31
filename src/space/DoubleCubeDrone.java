package space;

import java.util.ArrayList;

import drone.StandardDrone;


public class DoubleCubeDrone implements StandardDrone {
	
	private ArrayList<DroneTacka> tacke = new ArrayList<DroneTacka>();
	
	public FlySpace space;
	
	int start[] = {30,0,30};
	
	public DoubleCubeDrone(){
		dodajTacke(start);
		space = new FlySpace();
	}
	
	public DoubleCubeDrone(int c[]){
		dodajTacke(c);
		space = new FlySpace();
	}
	
	private void dodajTacke(int c[]){
		
		tacke.add(new DroneTacka(c));
		tacke.add(new DroneTacka(c[0], c[1], c[2] - 1));
		tacke.add(new DroneTacka(c[0], c[1] + 1, c[2]));
		tacke.add(new DroneTacka(c[0], c[1] + 1, c[2] - 1));
		
		tacke.add(new DroneTacka(c[0] + 1, c[1], c[2]));
		tacke.add(new DroneTacka(c[0] + 1, c[1], c[2] - 1));
		tacke.add(new DroneTacka(c[0] + 1, c[1] + 1, c[2]));
		tacke.add(new DroneTacka(c[0] + 1, c[1] + 1, c[2] - 1));
		
		tacke.add(new DroneTacka(c[0] + 1, c[1] + 2, c[2]));
		tacke.add(new DroneTacka(c[0] + 1, c[1] + 2, c[2] - 1));
		
		tacke.add(new DroneTacka(c[0] + 2, c[1] + 1, c[2]));
		tacke.add(new DroneTacka(c[0] + 2, c[1] + 1, c[2] - 1));
		tacke.add(new DroneTacka(c[0] + 2, c[1] + 2, c[2]));
		tacke.add(new DroneTacka(c[0] + 2, c[1] + 2, c[2] - 1));
		
		
		
	}

	
	
	public ArrayList<DroneTacka> getTacke() {
		return tacke;
	}

	public void setTacke(ArrayList<DroneTacka> tacke) {
		this.tacke = tacke;
	}
	
	
	public String moveUp() {
		for(DroneTacka d : tacke){
			 if(!d.sme(1, 1))
				 return getFormatedCoordinates();
		}
		
		for(DroneTacka d : tacke){
			 d.moveUp();
		}
		return getFormatedCoordinates();
	}


	public String moveDown() {
		
		for(DroneTacka d : tacke){
			 if(!d.sme(1, -1))
				 return getFormatedCoordinates();
		}
		
		for(DroneTacka d : tacke){
			 d.moveDown();
		}
		return getFormatedCoordinates();
	}


	public String moveRight() {
		
		for(DroneTacka d : tacke){
			 if(!d.sme(0, 1))
				 return getFormatedCoordinates();
		}
		
		for(DroneTacka d : tacke){
			 d.moveRight();
		}
		return getFormatedCoordinates();
	}


	public String moveLeft() {
		
		for(DroneTacka d : tacke){
			 if(!d.sme(0, -1))
				 return getFormatedCoordinates();
		}
		
		for(DroneTacka d : tacke){
			 d.moveLeft();
		}
		return getFormatedCoordinates();
	}


	public String moveBack() {
		
		for(DroneTacka d : tacke){
			 if(!d.sme(2, 1))
				 return getFormatedCoordinates();
		}
		
		for(DroneTacka d : tacke){
			 d.moveBack();
		}
		return getFormatedCoordinates();
	}


	public String moveForth() {
		for(DroneTacka d : tacke){
			 if(!d.sme(2, -1))
				 return getFormatedCoordinates();
		}
		
		for(DroneTacka d : tacke){
			 d.moveForth();
		}
		return getFormatedCoordinates();
	}

	
	
	public String getFormatedCoordinates()
	{
		
		
		return tacke.get(0).getFormatedCoordinates();
	}
	
	
}
