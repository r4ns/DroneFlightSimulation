package space;

import drone.Cube;
import drone.Drone;


public class DoubleCubeDron extends Drone {

	private int duzinaStranice; //drona
	private FlySpace space; //prostor
	private int[] startCoordinates = new int[]{0,0,0};
	public boolean callByTest=false; //pomoc za testove
	Cube cubeOfDroneFirst;
	Cube cubeOfDroneSecond;



	public DoubleCubeDron(){


	}

	public DoubleCubeDron(int [] coordinates, int [] boundaries, int razmak, int duzinaStranice){

		super();
		this.duzinaStranice=duzinaStranice;
		space = new FlySpace(startCoordinates,boundaries,razmak);
		cubeOfDroneFirst = new Cube(new int[]{coordinates[0],coordinates[1],coordinates[2]},duzinaStranice);
		cubeOfDroneSecond = new Cube(new int[] {coordinates[0]+duzinaStranice,coordinates[1]+duzinaStranice,coordinates[2]},duzinaStranice);
	}

	public DoubleCubeDron(int x, int y, int z, int [] boundaries, int razmak, int duzinaStranice){

		super(x,y,z,boundaries,razmak);
		this.duzinaStranice=duzinaStranice;
		space = new FlySpace(startCoordinates,boundaries,razmak);
		cubeOfDroneFirst = new Cube(new int[]{coordinates[0],coordinates[1],coordinates[2]},duzinaStranice);
		cubeOfDroneSecond = new Cube(new int[] {coordinates[0]+duzinaStranice,coordinates[1]+duzinaStranice,coordinates[2]},duzinaStranice);
	}


	@Override
	public String moveUp() {

		if(validateDronePositionAfter("moveUp()") == true){

			if(x>=razmak-duzinaStranice && x<boundaries[0]-razmak-duzinaStranice && z>razmak && z<boundaries[2]-razmak && y>=0 && y<razmak-duzinaStranice*2){//donja_1

				y++;
				System.out.println(getFormatedCoordinates());


			}else if(x>=boundaries[0]-razmak-duzinaStranice && x<boundaries[0]-razmak && z>razmak && z<boundaries[2]-razmak && y>=0 && y<razmak-duzinaStranice){//donja_2

				y++;       
				System.out.println(getFormatedCoordinates());

			} else if(x>razmak && x<boundaries[0]-razmak && z>razmak && z<boundaries[2]-razmak && y>=boundaries[1]-razmak && y<boundaries[1]-2*duzinaStranice){//gornja_1

				y++;       
				System.out.println(getFormatedCoordinates());

			}else if(x>=razmak-duzinaStranice && x<boundaries[0]-razmak && z>razmak && z<boundaries[2]-razmak && y>=boundaries[1]-razmak && y<boundaries[1]-2*duzinaStranice){//gornja_2

				y++;       
				System.out.println(getFormatedCoordinates());

			} else if (x>=0 && x<=razmak-2*duzinaStranice && z>=razmak && z<=boundaries[2]-razmak && y>=0 && y<boundaries[1]-2*duzinaStranice){ //leva

				y++;

				System.out.println(getFormatedCoordinates());

			} else if (x>=boundaries[0]-razmak && x<=boundaries[0]-2*duzinaStranice && z>=razmak && z<=boundaries[2]-razmak && y>=0 && y<boundaries[1]-2*duzinaStranice){//desna

				y++;
				System.out.println(getFormatedCoordinates());


			} else if (x>=0 && x<=boundaries[0] && z>=boundaries[2]-razmak && z<=boundaries[2] && y>=0 && y<boundaries[1]-2*duzinaStranice){//napred

				y++;
				System.out.println(getFormatedCoordinates());


			} else if (x>=0 && x<=boundaries[0] && z>=0 && z<=razmak && y>=0 && y<boundaries[1]-2*duzinaStranice){ //nazad

				y++;
				System.out.println(getFormatedCoordinates());


			} else {

				System.out.println(getFormatedCoordinates());
			}
		} else {

			return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		}





		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";

	}

	@Override
	public String moveDown() {

		if(validateDronePositionAfter("moveDown()") == true){

			if(x>=razmak && x<=boundaries[0]-razmak && z>=razmak && z<=boundaries[2]-razmak && y>0 && y<=razmak){ //donja

				y--;
				System.out.println(getFormatedCoordinates());
			} else if(x>=razmak && x<=boundaries[0]-razmak && z>=razmak && z<=boundaries[2]-razmak && y>boundaries[2]-razmak && y<=boundaries[1]){ //gornja_1

				y--;
				System.out.println(getFormatedCoordinates());
			}else if(x>=razmak-duzinaStranice && x<=boundaries[0]-razmak && z>=razmak && z<=boundaries[2]-razmak && y>boundaries[2]-razmak && y<=boundaries[1]){ //gornja_2

				y--;
				System.out.println(getFormatedCoordinates());
			}else if(x>=0 && x<=razmak-2*duzinaStranice && z>=razmak && z<=boundaries[2]-razmak && y>0 && y<=boundaries[1]){

				y--;
				System.out.println(getFormatedCoordinates());
			}else if(x>=boundaries[0]-razmak && x<=boundaries[0] && z>=razmak && z<=boundaries[2]-razmak && y>0 && y<=boundaries[1]){

				y--;
				System.out.println(getFormatedCoordinates());
			}else if(x>=0 && x<=boundaries[0] && z>=boundaries[2]-razmak && z<=boundaries[2] && y>0 && y<=boundaries[1]){

				y--;
				System.out.println(getFormatedCoordinates());
			}else if(x>=razmak && x<=boundaries[0]-razmak && z>=0 && z<=razmak && y>0 && y<=boundaries[1]){

				y--;
				System.out.println(getFormatedCoordinates());
			} else {

				System.out.println(getFormatedCoordinates());
			}
		} else {

			return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		}




		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";


	}

	@Override
	public String moveLeft() {

		if(validateDronePositionAfter("moveLeft()") == true){

			if(y>=0 && y<=razmak-2*duzinaStranice && z>=0 && z<=boundaries[2] && x>=duzinaStranice && x<boundaries[0]){ //dole

				x--;
				System.out.println(getFormatedCoordinates());

			} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>=duzinaStranice && x<=razmak-duzinaStranice*2){ //levo

				x--;
				System.out.println(getFormatedCoordinates());

			} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>boundaries[0]-razmak && x<=boundaries[0]-2*duzinaStranice){ //desna_1

				x--;
				System.out.println(getFormatedCoordinates());

			}else if(y>razmak-duzinaStranice && y<razmak && z>razmak && z<boundaries[2]-razmak && x>boundaries[0]-razmak-duzinaStranice && x<=boundaries[0]){ //desna_2

				x--;
				System.out.println(getFormatedCoordinates());

			}else if(y>=boundaries[1]-razmak && y<=boundaries[1] && z>=0 && z<=boundaries[2] && x>=duzinaStranice && x<=boundaries[0]){ //gore

				x--;
				System.out.println(getFormatedCoordinates());

			}else if(y>=0 && y<=boundaries[1] && z>=boundaries[2]-razmak && z<= boundaries[2] && x>=duzinaStranice && x<=boundaries[0]){ //napred

				x--;
				System.out.println(getFormatedCoordinates());

			}else if(y>=0 && y<=boundaries[1] && z>=0 && z<=razmak && x>=duzinaStranice && x<=boundaries[0]){ //nazad

				x--;
				System.out.println(getFormatedCoordinates());

			} else {

				System.out.println(getFormatedCoordinates());
			}
		} else {

			return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		}


		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
	}

	@Override
	public String moveRight() {

		if(validateDronePositionAfter("moveRight()") == true){

			if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>=0 && x<razmak-duzinaStranice*2){ //levo

				x++;
				System.out.println(getFormatedCoordinates());

			} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>=boundaries[0]-razmak && x<boundaries[0]-duzinaStranice*2){ //desno

				x++;
				System.out.println(getFormatedCoordinates());
			}else if(y>=0 && y<=razmak && z>=razmak && z<=boundaries[2]-razmak && x>=0 && x<boundaries[0]-duzinaStranice*2){ //dole

				x++;
				System.out.println(getFormatedCoordinates());
			} else if(y>=boundaries[1]-razmak && y<=boundaries[1] && z>=razmak && z<=boundaries[2]-razmak && x>=0 && x<boundaries[0]-duzinaStranice*2){ //gore_1

				x++;
				System.out.println(getFormatedCoordinates());
			} else if(y>=boundaries[1]-razmak-duzinaStranice && y<=boundaries[1] && z>=razmak && z<=boundaries[2]-razmak && x>=0 && x<razmak-duzinaStranice){ //gore_2

				x++;
				System.out.println(getFormatedCoordinates());
			} else if(y>=0 && y<=boundaries[1] && z>=0 && z<=razmak && x>=0 & x<boundaries[0]-duzinaStranice*2){ //nazad

				x++;
				System.out.println(getFormatedCoordinates());
			}else if(y>=0 && y<=boundaries[1] && z>boundaries[2]-razmak && z<=boundaries[2] && x>=0 && x<boundaries[0]-duzinaStranice*2){ //napred

				x++;
				System.out.println(getFormatedCoordinates());
			} else {

				System.out.println(getFormatedCoordinates());
			}
		} else {

			return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		}



		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
	}

	@Override
	public String moveBack() {

		if(validateDronePositionAfter("moveBack()") == true){

			if(y>=0 && y<=razmak-2*duzinaStranice && x>=razmak-duzinaStranice && x<boundaries[0]-razmak-duzinaStranice && z>=0 && z<boundaries[2]-duzinaStranice){ //dole_1

				z++;
				System.out.println(getFormatedCoordinates());
			}else if(y>=0 && y<=razmak-duzinaStranice && x>=boundaries[0]-razmak-duzinaStranice && x<boundaries[0]-razmak && z>=0 && z<boundaries[2]-duzinaStranice){ //dole_2

				z++;
				System.out.println(getFormatedCoordinates());

			} else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>=boundaries[2]-razmak && z<boundaries[2]-duzinaStranice){ //napred

				z++;
				System.out.println(getFormatedCoordinates());

			}else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>=0 && z<razmak-duzinaStranice){ //nazad

				z++;
				System.out.println(getFormatedCoordinates());

			}else if(y>=boundaries[1]-razmak && y<=boundaries[1] && x>=0 && x<=boundaries[0] && z>=0 && z<boundaries[2]-duzinaStranice){ //gore_1

				z++;
				System.out.println(getFormatedCoordinates());

			}else if(y>=boundaries[1]-razmak-duzinaStranice && y<=boundaries[1] && x>=0 && x<=razmak-duzinaStranice && z>=0 && z<boundaries[2]-duzinaStranice){ //gore_2

				z++;
				System.out.println(getFormatedCoordinates());

			}else if(y>=0 && y<=boundaries[1] && x>=0 && x<=razmak-2*duzinaStranice && z>=0 && z<boundaries[2]-duzinaStranice){ //levo

				z++;
				System.out.println(getFormatedCoordinates());

			}else if(y>=0 && y<=boundaries[1] && x>=boundaries[0]-razmak && x<=boundaries[0]-2*duzinaStranice && z>=0 && z<boundaries[2]-duzinaStranice){ //desno

				z++;
				System.out.println(getFormatedCoordinates());

			} else {

				System.out.println(getFormatedCoordinates());
			}
		} else {

			return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		}



		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
	}

	@Override
	public String moveForth() {

		if(validateDronePositionAfter("moveForth()") == true){

			if(y>=0 && y<=razmak-2*duzinaStranice && x>=razmak-duzinaStranice && x<boundaries[0]-razmak-duzinaStranice && z>=duzinaStranice && z<boundaries[2]-duzinaStranice){ //dole_1

				z--;
				System.out.println(getFormatedCoordinates());
			}else if(y>=0 && y<=razmak-duzinaStranice && x>=boundaries[0]-razmak-duzinaStranice && x<boundaries[0]-razmak && z>=duzinaStranice && z<boundaries[2]-duzinaStranice){ //dole_2

				z--;
				System.out.println(getFormatedCoordinates());

			} else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>boundaries[2]-razmak && z<boundaries[2]-duzinaStranice){ //napred

				z--;
				System.out.println(getFormatedCoordinates());

			}else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>=duzinaStranice && z<razmak-duzinaStranice){ //nazad

				z--;
				System.out.println(getFormatedCoordinates());

			}else if(y>=boundaries[1]-razmak && y<=boundaries[1] && x>=0 && x<=boundaries[0] && z>=duzinaStranice && z<boundaries[2]-duzinaStranice){ //gore_1

				z--;
				System.out.println(getFormatedCoordinates());

			}else if(y>=boundaries[1]-razmak-duzinaStranice && y<=boundaries[1] && x>=0 && x<=razmak-duzinaStranice && z>=duzinaStranice && z<boundaries[2]-duzinaStranice){ //gore_2

				z--;
				System.out.println(getFormatedCoordinates());

			}else if(y>=0 && y<=boundaries[1] && x>=0 && x<=razmak-2*duzinaStranice && z>=duzinaStranice && z<boundaries[2]-duzinaStranice){ //levo

				z--;
				System.out.println(getFormatedCoordinates());

			}else if(y>=0 && y<=boundaries[1] && x>=boundaries[0]-razmak && x<=boundaries[0]-2*duzinaStranice && z>=duzinaStranice && z<boundaries[2]-duzinaStranice){ //desno

				z--;
				System.out.println(getFormatedCoordinates());

			} else {

				System.out.println(getFormatedCoordinates());
			}
		} else {

			return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
		}



		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";



	}

	@Override
	public String getFormatedCoordinates() {

		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
	}

	public boolean validateDronePositionAfter(String command){
		
		DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());
		try{
			
			check(drone);
		} catch(DroneException e){
			
			System.out.println(e + "\n");
		}
		

		if(command == "moveUp()"){
			
			if(callByTest == false && cubes("moveUp()",drone.getX(),drone.getY(),drone.getZ()) == false){ 

				//existCubes=true; //seku se, dron se ne mo�e pomeriti
				return false;

			} else { //prepreke ne sprecavaju dron

				//existCubes=false;
				/*int currentY = drone.getY();
				drone.moveUp();
				if(drone.getY() == currentY+1){

					//moveUp();
					return true;

				} else {

					return false;
				}*/
				return true;
			}



		}

		if(command == "moveDown()"){

			//DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());
			if(callByTest == false && cubes("moveDown()",drone.getX(),drone.getY(),drone.getZ()) == false){ 

				//existCubes=true; //seku se, dron se ne mo�e pomeriti
				return false;
			} else { //prepreke ne sprecavaju dron

				/*existCubes=false;
				int currentY = drone.getY();
				drone.moveDown();
				if(drone.getY() == currentY-1){

					moveDown();
					return true;

				} else {

					return false;
				}*/
				
				return true;
			}


		}

		if(command == "moveLeft()"){

			//DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());
			if(callByTest == false && cubes("moveLeft()",drone.getX(),drone.getY(),drone.getZ()) == false){ 

				//existCubes=true; //seku se, dron se ne mo�e pomeriti
				return false;
			} else { //prepreke ne sprecavaju dron

				/*existCubes=false;
				int currentX = drone.getX();
				drone.moveLeft();
				if(drone.getX() == currentX-1){

					moveLeft();
					return true;

				} else {

					return false;
				}*/
				
				return true;
			}

		}

		if(command == "moveRight()"){
			//DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());
			if(callByTest == false && cubes("moveRight()",drone.getX(),drone.getY(),drone.getZ()) == false){ 

				//existCubes=true; //seku se, dron se ne mo�e pomeriti
				return false;
			} else { //prepreke ne sprecavaju dron

				/*existCubes=false;
				int currentX = drone.getX();
				drone.moveRight();
				if(drone.getX() == currentX+1){


					moveRight();
					return true;

				} else {


					return false;
				}*/
				
				return true;
			}

		}

		if(command == "moveBack()"){

			//DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());
			if(callByTest == false && cubes("moveBack()",drone.getX(),drone.getY(),drone.getZ()) == false){ 

				existCubes=true; //seku se, dron se ne mo�e pomeriti
				return false;
			} else { //prepreke ne sprecavaju dron

				/*existCubes=false;
				int currentZ = drone.getZ();
				drone.moveBack();
				if(drone.getZ() == currentZ+1){

					moveBack();
					return true;

				} else {


					return false;
				}*/
				
				return true;
			}


		}

		if(command == "moveForth()"){
			
			//DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());
			if(callByTest == false && cubes("moveForth()",drone.getX(),drone.getY(),drone.getZ()) == false){ 

				//existCubes=true; //seku se, dron se ne mo�e pomeriti
				return false;
			} else { //prepreke ne sprecavaju dron

				/*existCubes=false;
				int currentZ = drone.getZ();
				drone.moveForth();
				if(drone.getZ() == currentZ-1){

					moveForth();
					return true;

				} else {


					return false;
				}*/
				
				return true;
			}

		}

		return false; 
	}

	public boolean cubes(String command,int x, int y, int z){

		if(command == "moveUp()"){
			
			Cube cubeOfDroneFirstAfter = new Cube(new int [] {x,y+1,z},1);
			Cube cubeOfDroneSecondAfter = new Cube(new int [] {x+duzinaStranice,y+duzinaStranice+1,z},1);

			for(int i=0; i<space.getNumberOfCubes(); i++){

				Cube cube = space.getListOfCubes().get(i);

				if(cube.checkCubeIntersection(cubeOfDroneFirstAfter)==true || cube.checkCubeIntersection(cubeOfDroneSecondAfter)==true){

					return false; //seku se, ne moze se pomeriti

				} else {

					return true;
				}
			}

		} else if(command == "moveDown()"){

			Cube cubeOfDroneFirstAfter = new Cube(new int [] {x,y-1,z},1);
			Cube cubeOfDroneSecondAfter = new Cube(new int [] {x+duzinaStranice,y,z},1);

			for(int i=0; i<space.getNumberOfCubes(); i++){

				Cube cube = space.getListOfCubes().get(i);

				if(cube.checkCubeIntersection(cubeOfDroneFirstAfter)==true || cube.checkCubeIntersection(cubeOfDroneSecondAfter)==true){

					return false; //seku se, ne moze se pomeriti

				} else {

					return true;
				}
			}
		} else if(command == "moveLeft()"){

			Cube cubeOfDroneFirstAfter = new Cube(new int [] {x-1,y,z},1);
			Cube cubeOfDroneSecondAfter = new Cube(new int [] {x,y,z},1);

			for(int i=0; i<space.getNumberOfCubes(); i++){

				Cube cube = space.getListOfCubes().get(i);

				if(cube.checkCubeIntersection(cubeOfDroneFirstAfter)==true || cube.checkCubeIntersection(cubeOfDroneSecondAfter)==true){

					return false; //seku se, ne moze se pomeriti

				} else {

					return true;
				}
			}
		} else if(command == "moveRight()"){

			Cube cubeOfDroneFirstAfter = new Cube(new int [] {x+1,y,z},1);
			Cube cubeOfDroneSecondAfter = new Cube(new int [] {x+duzinaStranice+1,y+duzinaStranice,z},1);

			for(int i=0; i<space.getNumberOfCubes(); i++){

				Cube cube = space.getListOfCubes().get(i);

				if(cube.checkCubeIntersection(cubeOfDroneFirstAfter)==true || cube.checkCubeIntersection(cubeOfDroneSecondAfter)==true){

					return false; //seku se, ne moze se pomeriti

				} else {

					return true;
				}
			}
		}else if(command == "moveBack()"){

			Cube cubeOfDroneFirstAfter = new Cube(new int [] {x,y,z+1},1);
			Cube cubeOfDroneSecondAfter = new Cube(new int [] {x+duzinaStranice,y+duzinaStranice,z+1},1);

			for(int i=0; i<space.getNumberOfCubes(); i++){

				Cube cube = space.getListOfCubes().get(i);

				if(cube.checkCubeIntersection(cubeOfDroneFirstAfter)==true || cube.checkCubeIntersection(cubeOfDroneSecondAfter)==true){

					return false; //seku se, ne moze se pomeriti

				} else {

					return true;
				}
			}
		}else if(command == "moveForth()"){

			Cube cubeOfDroneFirstAfter = new Cube(new int [] {x,y,z-1},1);
			Cube cubeOfDroneSecondAfter = new Cube(new int [] {x+duzinaStranice,y+duzinaStranice,z-1},1);

			for(int i=0; i<space.getNumberOfCubes(); i++){

				Cube cube = space.getListOfCubes().get(i);

				if(cube.checkCubeIntersection(cubeOfDroneFirstAfter)==true || cube.checkCubeIntersection(cubeOfDroneSecondAfter)==true){

					return false; //seku se, ne moze se pomeriti

				} else {

					return true;
				}
			}
		}




		return false; 
	}


	public static void check(DoubleCubeDron drone_) throws DroneException{
		
		for(int i=0; i<drone_.space.getNumberOfCubes(); i++){

			Cube cube = drone_.space.getListOfCubes().get(i);

			if(cube.checkIfCubesAreTouching(drone_.getCubeOfDroneFirst())==true || cube.checkIfCubesAreTouching(drone_.getCubeOfDroneSecond())==true){
				
				throw new DroneException();
			}

				
		}
		

		/*if(cubeFirst.checkIfCubesAreTouching(cubeSecond) == true){

			throw new DroneException();
		}*/
	}




	public int getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(int duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}

	public int[] getStartCoordinates() {
		return startCoordinates;
	}

	public void setStartCoordinates(int[] startCoordinates) {
		this.startCoordinates = startCoordinates;
	}

	public boolean isExistCubes() {
		return existCubes;
	}

	public void setExistCubes(boolean existCubes) {
		this.existCubes = existCubes;
	}

	public boolean isCallByTest() {
		return callByTest;
	}

	public void setCallByTest(boolean callByTest) {
		this.callByTest = callByTest;
	}

	public Cube getCubeOfDroneFirst() {
		return cubeOfDroneFirst;
	}

	public void setCubeOfDroneFirst(Cube cubeOfDroneFirst) {
		this.cubeOfDroneFirst = cubeOfDroneFirst;
	}

	public Cube getCubeOfDroneSecond() {
		return cubeOfDroneSecond;
	}

	public void setCubeOfDroneSecond(Cube cubeOfDroneSecond) {
		this.cubeOfDroneSecond = cubeOfDroneSecond;
	}

	public FlySpace getSpace() {
		return space;
	}

	public void setSpace(FlySpace space) {
		this.space = space;
	}







}
