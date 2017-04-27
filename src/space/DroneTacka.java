package space;

import drone.StandardDrone;


public class DroneTacka implements StandardDrone {
	
	FlySpace space = new FlySpace();
	
	static int brojTacaka = 0;
	
	private String idTacke;
	
	private int c[] = new int[3];

	public DroneTacka(){
		brojTacaka++;
		idTacke = "" + brojTacaka + ". ";
	}
	
	
	public DroneTacka(int c[]){
		this.c = c;
		brojTacaka++;
		idTacke = "" + brojTacaka + ". ";

	}
	public DroneTacka(int c[], FlySpace space){
		this.c = c;
		this.space = space;
		brojTacaka++;
		idTacke = "" + brojTacaka + ". ";

	}
	
	public DroneTacka(int x, int y, int z){
		c[0] = x;
		c[1] = y;
		c[2] = z;
		brojTacaka++;
		idTacke = "" + brojTacaka + ". ";

	}


	public String granice(){
		return space.graniceString();
	}
	
	private boolean uIvici(int osa){
		if(c[osa]>= space.getsGranica1()[osa] && c[osa] <=space.getuGranica1()[osa] || c[osa]>=space.getuGranica2()[osa] && c[osa] <= space.getsGranica2()[osa]){
			return true;
		}
		return false;
	}

	public boolean sme(int osa, int za){
		for(int a1 = 0; a1 < 3; a1++){
			int a2 = (a1 + 1) % 3;
			int a3 = (a1 + 2) % 3;
			
			if( osa == a1 ){
				if(uIvici(a2) || uIvici(a3)){
					if(c[osa] + za >= space.getsGranica1()[osa] && c[osa] + za <= space.getsGranica2()[osa]){
						return true;
					}
					return false;
				}else{
					if(c[osa] + za >= space.getsGranica1()[osa] && c[osa] + za <= space.getuGranica1()[osa] || c[osa] + za <= space.getsGranica2()[osa] && c[osa] + za >= space.getuGranica2()[osa]){
						return true;
					}
					return false;
				}
			}
		}
	
		return false;
	}

	public String moveUp() {
		
			c[1]++;
		return getFormatedCoordinates();
	}


	public String moveDown() {
		
			c[1]--;
		return getFormatedCoordinates();
	}


	public String moveRight() {
		
			c[0]++;
		return getFormatedCoordinates();
	}


	public String moveLeft() {
		
			c[0]--;
		return getFormatedCoordinates();
	}


	public String moveBack() {
		
			c[2]++;
		return getFormatedCoordinates();
	}


	public String moveForth() {
		
			c[2]--;
		return getFormatedCoordinates();
	}

	public String getFormatedCoordinates()
	{

		return  "(" + Integer.toString(c[0]) + ","
				+ Integer.toString(c[1]) + ","  
				+ Integer.toString(c[2]) + ") ";
	}


	

}
