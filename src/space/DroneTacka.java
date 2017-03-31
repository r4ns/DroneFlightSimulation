package space;

import drone.StandardDrone;


public class DroneTacka extends DoubleCubeDrone implements StandardDrone {

	private int c[] = new int[3];

	private String poruka = "";

	public DroneTacka(int c[]){
		this.c = c;

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
		
		
		
		
		/*if(osa == 0 ){
			if(uIvici(1) || uIvici(2)){
				if(c[osa] + za >= space.getsGranica1()[osa] && c[osa] + za <= space.getsGranica2()[osa]){
					return true;
				}
				return false;
			}else{
				if(c[osa] + za >= space.getsGranica1()[osa] && c[osa] + za <= space.getuGranica1()[osa] || c[osa] + za >= space.getsGranica2()[osa] && c[osa] + za <= space.getuGranica2()[osa]){
					return true;
				}
				return false;
			}
		}else if(osa == 1){
			if(uIvici(0) || uIvici(2)){
				if(c[osa] + za >= space.getsGranica1()[osa] && c[osa] + za <= space.getsGranica2()[osa]){
					return true;
				}
				return false;
			}else{
				if(c[osa] + za >= space.getsGranica1()[osa] && c[osa] + za <= space.getuGranica1()[osa] || c[osa] + za >= space.getsGranica2()[osa] && c[osa] + za <= space.getuGranica2()[osa]){
					return true;
				}
				return false;
			}
		}else if(osa == 2){
			if(uIvici(0) || uIvici(1)){
				if(c[osa] + za >= space.getsGranica1()[osa] && c[osa] + za <= space.getsGranica2()[osa]){
					return true;
				}
				return false;
			}else{
				if(c[osa] + za >= space.getsGranica1()[osa] && c[osa] + za <= space.getuGranica1()[osa] || c[osa] + za >= space.getsGranica2()[osa] && c[osa] + za <= space.getuGranica2()[osa]){
					return true;
				}
				return false;
			}
		}*/
		return false;
	}
	/*private int pomeri(int k, int i){

		poruka = "";
		if(k + i == sGranica1 || k + i == sGranica2){
			poruka = "//udario";
			return k + i;
		}
		if(k == sGranica1 && i == -1 || k == sGranica2  && i == 1){
			return k;
		}
		return k + i;
	}

	private int pomeriSigurno(int k, int i){

		poruka = "";
		if(k + i == sGranica1 || k + i == uGranica1 || k + i == uGranica2 || k + i == sGranica2){
			poruka = "//udario";
			return k + i;
		}
		if(k == sGranica1 && i == -1 || k == uGranica1  && i == 1|| k == uGranica2  && i == -1|| k == sGranica2  && i == 1){

			return k;
		}
		return k + i;
	}*/



	public String moveUp() {
		if(sme(1,1))
			c[1]++;
		return getFormatedCoordinates();
	}


	public String moveDown() {
		if(sme(1,-1))
			c[1]--;
		return getFormatedCoordinates();
	}


	public String moveRight() {
		if(sme(0,1))
			c[0]++;
		return getFormatedCoordinates();
	}


	public String moveLeft() {
		if(sme(0,-1))
			c[0]--;
		return getFormatedCoordinates();
	}


	public String moveBack() {
		if(sme(2,1))
			c[2]++;
		return getFormatedCoordinates();
	}


	public String moveForth() {
		if(sme(2,-1))
			c[2]--;
		return getFormatedCoordinates();
	}

	public String getFormatedCoordinates()
	{

		return "My position is: (" + Integer.toString(c[0]) + ","
				+ Integer.toString(c[1]) + ","  
				+ Integer.toString(c[2]) + ") ";
	}


}
