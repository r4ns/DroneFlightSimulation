package drone;

public class Drone implements StandardDrone{
	
	private int koordinataX;
	private int koordinataY;
	private int koordinataZ;
	private boolean stop;
	
	public Drone(){ 
		this.koordinataX = 30;
		this.koordinataY = 0;
		this.koordinataZ = 30;
		this.stop = true;
	}


	public String getFormatedCoordinates() {
		if(koordinataX==0 && koordinataY==30 && koordinataZ==30){
			stop=false;
			return "Drone position: (" + koordinataX + ", " + koordinataY + ", " + koordinataZ + ") //Target reached";
		}
		else
		return "Drone position: (" + koordinataX + ", " + koordinataY + ", " + koordinataZ + ")";
	}
	
	public String moveUp() {
		if (koordinataY < 10 && koordinataX <= 40 && koordinataX >= 10 && koordinataZ <= 40 && koordinataZ >= 10){
			koordinataY ++; 
			if (koordinataY==10){
				stop=false;
				return getFormatedCoordinates() + "//Drone hits inner square border";
			}
			else{
				return getFormatedCoordinates();
			}
		}
		else if(koordinataY < 50){
			koordinataY++;
			if(koordinataY < 50){
			return getFormatedCoordinates();}
			else{
				stop=false;
				return getFormatedCoordinates() + "//Drone hits outer square border";
			}
		}
		else{
			return getFormatedCoordinates();
		}
	}

	public String moveDown() {
		if (koordinataY > 40 && koordinataX <=40 && koordinataX >= 10 && koordinataZ <= 40 && koordinataZ >= 10){
			koordinataY--;
			if(koordinataY==40){
				stop=false;
				return getFormatedCoordinates() + "//Drone hits inner square border";
			}
			else{
				return getFormatedCoordinates();
			}
		}
		else if(koordinataY > 0)
		{
			koordinataY--;
			if(koordinataY > 0){
			return getFormatedCoordinates();}
			else{
				stop=false;
				return getFormatedCoordinates() + "//Drone hits outer square border";
			}
		}
		else{
			return getFormatedCoordinates();
		}
	}

	public String moveLeft() {
		if (koordinataY <= 40 && koordinataY >= 10 && koordinataX >40 && koordinataZ <= 40 && koordinataZ >= 10){
			koordinataX--;
			if(koordinataX==40){
				stop=false;
				return getFormatedCoordinates() + "//Drone hits inner square border";
			}
			else{
				return getFormatedCoordinates();
			}
		}
		else if(koordinataX > 0)
		{
			koordinataX--;
			if(koordinataX > 0){
				return getFormatedCoordinates();}
			else{
				stop=false;
				return getFormatedCoordinates() + "//Drone hits outer square border";
				}
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveRight() {
		if ((koordinataY <= 40 && koordinataY >= 10) && koordinataX <10 && (koordinataZ <= 40 && koordinataZ >= 10)){
			koordinataX ++;
			if(koordinataX==10){
				stop=false;
				return getFormatedCoordinates() + "//Drone hits inner square border";
			}
			else{
				return getFormatedCoordinates();
			}
		}
		else if(koordinataX < 50){
			koordinataX++;
			if (koordinataX==50){
				stop=false;
				return getFormatedCoordinates() + "//Drone hits outer square border";
			}
			else{
				return getFormatedCoordinates();
			}
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveBack() {
		if(koordinataX>=10 && koordinataX<=40 && koordinataY>=10 && koordinataY<=40 && koordinataZ<10){
			koordinataZ++;
			if(koordinataZ==10){
				stop=false;
				return getFormatedCoordinates() + "//Drone hits inner square border";
			}
			else{
				return getFormatedCoordinates();
			}
		}
		else if(koordinataZ<50){
			koordinataZ++;
			if (koordinataZ==50){
				stop=false;
				return getFormatedCoordinates() + "//Drone hits outer square border";
			}
			else{
				return getFormatedCoordinates();
			}
			
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveForth() {
		if(koordinataX>=10 && koordinataX<=40 && koordinataY>=10 && koordinataY<=40 && koordinataZ>40){
			koordinataZ--;
			if(koordinataZ==50){
				stop=false;
				return getFormatedCoordinates() + "//Drone hits inner square border";
			}
			else{
				return getFormatedCoordinates();
			}
		}
		else if(koordinataZ>0){
			koordinataZ--;
			if(koordinataZ > 0){
				return getFormatedCoordinates();}
				else{
					stop=false;
					return getFormatedCoordinates() + "//Drone hits outer square border";
				}
		}
		else{
			return getFormatedCoordinates();
		}
	}

	public int getKoordinataX() {
		return koordinataX;
	}

	public void setKoordinataX(int koordinataX) {
		this.koordinataX = koordinataX;
	}

	public int getKoordinataY() {
		return koordinataY;
	}

	public void setKoordinataY(int koordinataY) {
		this.koordinataY = koordinataY;
	}

	public int getKoordinataZ() {
		return koordinataZ;
	}

	public void setKoordinataZ(int koordinataZ) {
		this.koordinataZ = koordinataZ;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
