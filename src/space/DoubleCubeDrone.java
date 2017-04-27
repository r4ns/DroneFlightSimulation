package space;

import drone.*;
import space.FlySpace;
import space.Cube;



public class DoubleCubeDrone extends Drone{

	public FlySpace flyspace=new FlySpace();

	protected int[] coordinates;
	int [] boundaries=flyspace.getOuterBoundaries();
	protected int space=flyspace.getSpace();

	public DoubleCubeDrone(){

	}

	public DoubleCubeDrone(int [] coordinates){
		this.coordinates=coordinates;
	}

	public DoubleCubeDrone(int [] coordinates, int [] boundaries, int space){
		this.coordinates=coordinates;
		this.boundaries=boundaries;
		this.space=space;
	}
	public DoubleCubeDrone(int [] coordinates, int [] boundaries, int space, FlySpace flyspace){
		this.coordinates=coordinates;
		this.boundaries=boundaries;
		this.space=space;
		this.flyspace=flyspace;
	}

	public String moveUp(){

		if(coordinates[0]>=space-1 && coordinates[0]<boundaries[0]-space-1 && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[1]++>=0 && coordinates[1]<space-2){//donja_1

			coordinates[1]++;
			return getFormatedCoordinates();


		}else if(coordinates[0]>=boundaries[0]-space-1 && coordinates[0]<boundaries[0]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[1]>=0 && coordinates[1]<space-1){//donja_2

			coordinates[1]++;     
			return getFormatedCoordinates();

		} else if(coordinates[0]>space && coordinates[0]<boundaries[0]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[1]>=40 && coordinates[1]<boundaries[1]-2){//gornja_1

			coordinates[1]++;    
			return getFormatedCoordinates();

		}else if(coordinates[0]>=space-1 && coordinates[0]<boundaries[0]-space && coordinates[2]>10 && coordinates[2]<boundaries[2]-space && coordinates[1]>=40 && coordinates[1]<boundaries[1]-2){//gornja_2

			coordinates[1]++;      
			return getFormatedCoordinates();


		} else if (coordinates[0]>=0 && coordinates[0]<=space-2 && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>=0 && coordinates[1]<boundaries[1]-2){ //leva

			coordinates[1]++;
			return getFormatedCoordinates();

		} else if (coordinates[0]>=boundaries[0]-space && coordinates[0]<=boundaries[0]-2 && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>=0 && coordinates[1]<boundaries[1]-2){//desna

			coordinates[1]++;
			return getFormatedCoordinates();


		} else if (coordinates[0]>=0 && coordinates[0]<=boundaries[0] && coordinates[2]>=boundaries[2]-space && coordinates[2]<=boundaries[2] && coordinates[1]>=0 && coordinates[1]<boundaries[1]-2){//napred

			coordinates[1]++;
			System.out.println(getFormatedCoordinates());


		} else if (coordinates[0]>=0 && coordinates[0]<=boundaries[0] && coordinates[2]>=0 && coordinates[2]<=space && coordinates[1]>=0 && coordinates[1]<boundaries[1]-2){ //nazad

			coordinates[1]++;
			return getFormatedCoordinates();
		} else {

			return getFormatedCoordinates();
		}
		return getFormatedCoordinates();
	}

	public String moveDown(){

		if(coordinates[0]>=space && coordinates[0]<boundaries[0]-space && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>0 && coordinates[1]<=space){//donja_1

			coordinates[1]--;
			return getFormatedCoordinates();


		}else if(coordinates[0]>=space && coordinates[0]<=boundaries[0]-space && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>boundaries[1]-space && coordinates[1]<=boundaries[1] ){//donja_2

			coordinates[1]--;   
			return getFormatedCoordinates();

		} else if(coordinates[0]>=space-1 && coordinates[0]<boundaries[0]-space && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>boundaries[1]-space && coordinates[1]<=boundaries[1]){//gornja_1

			coordinates[1]--;    
			return getFormatedCoordinates();

		}else if(coordinates[0]>=0 && coordinates[0]<=space-2 && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>0 && coordinates[1]<=boundaries[1]){//gornja_2

			coordinates[1]--;       
			return getFormatedCoordinates();


		} else if (coordinates[0]>=boundaries[0]-space && coordinates[0]<=boundaries[0] && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[1]>0 && coordinates[1]<=boundaries[1]){ //leva

			coordinates[1]--; 
			return getFormatedCoordinates();

		} else if (coordinates[0]>=0 && coordinates[0]<=boundaries[0] && coordinates[2]>=boundaries[2]-space && coordinates[2]<=boundaries[2] && coordinates[1]>0 && coordinates[1]<=boundaries[1]){//desna

			coordinates[1]--; 
			return getFormatedCoordinates();

		} else if (coordinates[0]>=space && coordinates[0]<=boundaries[0]-space && coordinates[2]>=0 && coordinates[2]<=space && coordinates[1]>0 && coordinates[1]<boundaries[1]){ //nazad

			coordinates[1]--;
			return getFormatedCoordinates();
		} else {

			return getFormatedCoordinates();
		}
	}

	public String moveLeft() {

		if(coordinates[1]>=0 && coordinates[1]<=space-2 && coordinates[2]>=0 && coordinates[2]<=boundaries[2] && coordinates[0]>=1 && coordinates[0]<boundaries[0]){ //dole

			coordinates[0]--;
			return getFormatedCoordinates();

		} else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[0]>=1 && coordinates[0]<=space-2){ //levo

			coordinates[0]--;
			return getFormatedCoordinates();

		} else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[0]>boundaries[0]-space && coordinates[0]<=boundaries[0]-2){ //desna_1

			coordinates[0]--;
			return getFormatedCoordinates();

		}else if(coordinates[1]>space-1 && coordinates[1]<space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[0]>boundaries[0]-space-1 && coordinates[0]<=boundaries[0]){ //desna_2

			coordinates[0]--;
			return getFormatedCoordinates();

		}else if(coordinates[1]>=boundaries[1]-space && coordinates[1]<=boundaries[1] && coordinates[2]>=0 && coordinates[2]<=boundaries[2] && coordinates[0]>=1 && coordinates[0]<=boundaries[0]){ //gore

			coordinates[0]--;
			return getFormatedCoordinates();

		}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[2]>=boundaries[2]-space && coordinates[2]<= boundaries[2] && coordinates[0]>=1 && coordinates[0]<=boundaries[0]){ //napred

			coordinates[0]--;
			return getFormatedCoordinates();

		}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[2]>=0 && coordinates[2]<=space && coordinates[0]>=1 && coordinates[0]<=boundaries[0]){ //nazad

			coordinates[0]--;
			return getFormatedCoordinates();

		} else {

			return getFormatedCoordinates();
		}
	}

	public String moveRight() {

		if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[0]>=0 && coordinates[0]<space-2){ //levo

			coordinates[0]++;
			return getFormatedCoordinates();

		} else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[2]>space && coordinates[2]<boundaries[2]-space && coordinates[0]>=boundaries[0]-space && coordinates[0]<boundaries[0]-2){ //desno

			coordinates[0]++;
			return getFormatedCoordinates();
		}else if(coordinates[1]>=0 && coordinates[1]<=space && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[0]>=0 && coordinates[0]<boundaries[0]-2){ //dole

			coordinates[0]++;
			return getFormatedCoordinates();
		} else if(coordinates[1]>=boundaries[1]-space && coordinates[1]<=boundaries[1] && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[0]>=0 && coordinates[0]<boundaries[0]-2){ //gore_1

			coordinates[0]++;
			return getFormatedCoordinates();
		} else if(coordinates[1]>=boundaries[1]-space-1 && coordinates[1]<=boundaries[1] && coordinates[2]>=space && coordinates[2]<=boundaries[2]-space && coordinates[0]>=0 && coordinates[0]<space-1){ //gore_2

			coordinates[0]++;
			return getFormatedCoordinates();
		} else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[2]>=0 && coordinates[2]<=space && coordinates[0]>=0 & coordinates[0]<boundaries[0]-2){ //nazad

			coordinates[0]++;
			return getFormatedCoordinates();
		}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[2]>boundaries[2]-space && coordinates[2]<=boundaries[2] && coordinates[0]>=0 && coordinates[0]<boundaries[0]-2){ //napred

			coordinates[0]++;
			return getFormatedCoordinates();
		} else {

			return getFormatedCoordinates();
		}

	}

	public String moveBack() {

		if(coordinates[1]>=0 && coordinates[1]<=space-2 && coordinates[0]>=space-1 && coordinates[0]<boundaries[0]-space-1 && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //dole_1

			coordinates[2]++;
			return getFormatedCoordinates();
		}else if(coordinates[1]>=0 && coordinates[1]<=space-1 && coordinates[0]>=boundaries[0]-space-1 && coordinates[0]<boundaries[0]-space && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //dole_2

			coordinates[2]++;
			return getFormatedCoordinates();

		} else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[0]>space && coordinates[0]<boundaries[0]-space && coordinates[2]>=boundaries[2]-space && coordinates[2]<boundaries[2]-1){ //napred

			coordinates[2]++;
			return getFormatedCoordinates();

		}else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[0]>space && coordinates[0]<boundaries[0]-space && coordinates[2]>=0 && coordinates[2]<space-1){ //nazad

			coordinates[2]++;
			return getFormatedCoordinates();

		}else if(coordinates[1]>=boundaries[1]-space && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=boundaries[0] && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //gore_1

			coordinates[2]++;
			return getFormatedCoordinates();

		}else if(coordinates[1]>=boundaries[1]-space-1 && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=space-1 && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //gore_2

			coordinates[2]++;
			return getFormatedCoordinates();

		}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=space-2 && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //levo

			coordinates[2]++;
			return getFormatedCoordinates();

		}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[0]>=boundaries[0]-space && coordinates[0]<=boundaries[0]-2 && coordinates[2]>=0 && coordinates[2]<boundaries[2]-1){ //desno

			coordinates[2]++;
			return getFormatedCoordinates();

		} else {

			return getFormatedCoordinates();
		}
	}

	public String moveForth() {

		if(coordinates[1]>=0 && coordinates[1]<=space-2 && coordinates[0]>=space-1 && coordinates[0]<boundaries[0]-space-1 && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //dole_1

			coordinates[2]--;
			return getFormatedCoordinates();
		}else if(coordinates[1]>=0 && coordinates[1]<=space-1 && coordinates[0]>=boundaries[0]-space-1 && coordinates[0]<boundaries[0]-space && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //dole_2

			coordinates[2]--;
			return getFormatedCoordinates();

		} else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[0]>space && coordinates[0]<boundaries[0]-space && coordinates[2]>boundaries[2]-space && coordinates[2]<boundaries[2]-1){ //napred

			coordinates[2]--;
			return getFormatedCoordinates();

		}else if(coordinates[1]>space && coordinates[1]<boundaries[1]-space && coordinates[0]>space && coordinates[0]<boundaries[0]-space && coordinates[2]>=1 && coordinates[2]<space-1){ //nazad

			coordinates[2]--;
			return getFormatedCoordinates();

		}else if(coordinates[1]>=boundaries[1]-space && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=boundaries[0] && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //gore_1

			coordinates[2]--;
			return getFormatedCoordinates();

		}else if(coordinates[1]>=boundaries[1]-space-1 && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=space-1 && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //gore_2

			coordinates[2]--;
			return getFormatedCoordinates();

		}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[0]>=0 && coordinates[0]<=space-2 && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //levo

			coordinates[2]--;
			return getFormatedCoordinates();

		}else if(coordinates[1]>=0 && coordinates[1]<=boundaries[1] && coordinates[0]>=boundaries[0]-space && coordinates[0]<=boundaries[0]-2 && coordinates[2]>=1 && coordinates[2]<boundaries[2]-1){ //desno

			coordinates[2]--;
			return getFormatedCoordinates();

		} else {

			return getFormatedCoordinates();
		}

	}


	public String getFormatedCoordinates(){
		// TODO Auto-generated method stub
		return "("+coordinates[0]+","+coordinates[1]+","+coordinates[2]+")";
	}


	Cube pom1 = new Cube(new int[] {30,0,30}, 1);
	Cube pom2 = new Cube(pom1);

	public DoubleCubeDrone(Cube pom1, Cube pom2) {
		this.pom1 = pom1;
		this.pom2 = pom2;
	}

	public boolean validateDronePositionAfter(String command){

		Cube cube1=new Cube(pom1);
		Cube cube2=new Cube(pom2);
		if(command== "moveUp"){
			if(cube1.checkIfCubesAreTouchingFromInside(flyspace.getVelika())==false){
				if(cube1.checkIfCubesAreTouchingFromOutside(flyspace.getMala())==false){
					cube1.increaseY(1);
					cube2.increaseY(1);
					return true;
				}else {
					return false;
				}
			}else{
				return false;
			}
		}

		if(command== "moveDown"){
			if(cube2.checkIfCubesAreTouchingFromInside(flyspace.getVelika())==false){
				if(cube2.checkIfCubesAreTouchingFromOutside(flyspace.getMala())==false){
					cube1.decreaseY(1);
					cube2.decreaseY(1);
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}
		if(command== "moveLeft"){
			if(cube1.checkIfCubesAreTouchingFromInside(flyspace.getVelika())==false){
				if(cube1.checkIfCubesAreTouchingFromOutside(flyspace.getMala())==false){
					cube1.decreaseX(1);
					cube2.decreaseX(1);
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}
		if(command== "moveRight"){
			if(cube2.checkIfCubesAreTouchingFromInside(flyspace.getVelika())==false){
				if(cube2.checkIfCubesAreTouchingFromOutside(flyspace.getMala())==false){
					cube1.increaseX(1);
					cube2.increaseX(1);
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}	
		if(command== "moveForth"){
			if(cube1.checkIfCubesAreTouchingFromInside(flyspace.getVelika())==false){
				if(cube1.checkIfCubesAreTouchingFromOutside(flyspace.getMala())==false){
					cube1.decreaseZ(1);
					cube2.decreaseZ(1);
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}	
		if(command== "moveBack"){
			if(cube2.checkIfCubesAreTouchingFromInside(flyspace.getVelika())==false&&cube2.checkIfCubesAreTouchingFromOutside(flyspace.getMala())==false){
				cube1.increaseZ(1);
				cube2.increaseZ(1);
				return true;
			}else{
				return false;
			}
		}
		return false;
	}



	public FlySpace getFlyspace() {
		return flyspace;
	}

	public int[] getCoordinates() {
		return coordinates;
	}

	public int[] getBoundaries() {
		return boundaries;
	}

	public int getSpace() {
		return space;
	}

	public void setFlyspace(FlySpace flyspace) {
		this.flyspace = flyspace;
	}

	public void setCoordinates(int[] coordinates) {
		this.coordinates = coordinates;
	}

	public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public FlySpace getFlySpace() {
		return flyspace;
	}

	public void setFlySpace(FlySpace flyspace) {
		this.flyspace = flyspace;
	}
}