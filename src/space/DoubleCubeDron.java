package space;

import static org.junit.Assert.assertEquals;

import drone.Cube;
import drone.Drone;


public class DoubleCubeDron extends Drone {

	private int duzinaStranice; 
	private FlySpace space;


	public DoubleCubeDron(){


	}

	public DoubleCubeDron(int [] coordinates, int [] boundaries, int razmak, int duzinaStranice){

		super();
		this.duzinaStranice=duzinaStranice;
	}

	public DoubleCubeDron(int x, int y, int z, int [] boundaries, int razmak, int duzinaStranice){

		super(x,y,z,boundaries,razmak);
		this.duzinaStranice=duzinaStranice;
	}


	@Override
	public String moveUp() {


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

		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";

	}

	@Override
	public String moveDown() {

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


		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";


	}

	@Override
	public String moveLeft() {

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


		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
	}

	@Override
	public String moveRight() {

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

		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
	}

	@Override
	public String moveBack() {

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

		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
	}

	@Override
	public String moveForth() {

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

		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";



	}

	@Override
	public String getFormatedCoordinates() {

		return "Drone position: ("+x+","+y+","+z+"), ("+(x+duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+"), ("+(x+duzinaStranice)+","+(y+2*duzinaStranice)+","+z+"), ("+(x+2*duzinaStranice)+","+(y+duzinaStranice)+","+(z+duzinaStranice)+")";
	}

	public boolean validateDronePositionAfter(String command){

		if(command == "moveUp()"){
			
			DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());	
			int currentY = getY();
			drone.moveUp();
			if(drone.getY() == currentY+1){
				
				System.out.println("Dron se moze pomeriti");
				moveUp();
				return true;
				
			} else {
				
				System.out.println("Dron se ne moze pomeriti");
				return false;
			}
			
			
		}

		if(command == "moveDown()"){
			
			DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());	
			int currentY = getY();
			drone.moveDown();
			if(drone.getY() == currentY-1){
				
				System.out.println("Dron se moze pomeriti");
				moveDown();
				return true;
				
			} else {
				
				System.out.println("Dron se ne moze pomeriti");
				return false;
			}
			

		}
		
		if(command == "moveLeft()"){
			
			DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());	
			int currentX = getX();
			drone.moveLeft();
			if(drone.getX() == currentX-1){
				
				System.out.println("Dron se moze pomeriti");
				moveLeft();
				return true;
				
			} else {
				
				System.out.println("Dron se ne moze pomeriti");
				return false;
			}
			
		}
		
		if(command == "moveRight()"){
			DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());	
			int currentX = getX();
			drone.moveRight();
			if(drone.getX() == currentX+1){
				
				System.out.println("Dron se moze pomeriti");
				moveRight();
				return true;
				
			} else {
				
				System.out.println("Dron se ne moze pomeriti");
				return false;
			}

		}
		
		if(command == "moveBack()"){
			
			DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());	
			int currentZ = getZ();
			drone.moveBack();
			if(drone.getZ() == currentZ+1){
				
				System.out.println("Dron se moze pomeriti");
				moveBack();
				return true;
				
			} else {
				
				System.out.println("Dron se ne moze pomeriti");
				return false;
			}
			

		}
		
		if(command == "moveForth()"){
			DoubleCubeDron drone = new DoubleCubeDron(getX(),getY(),getZ(),getBoundaries(),getRazmak(),getDuzinaStranice());	
			int currentZ = getZ();
			drone.moveForth();
			if(drone.getZ() == currentZ-1){
				
				System.out.println("Dron se moze pomeriti");
				moveForth();
				return true;
				
			} else {
				
				System.out.println("Dron se ne moze pomeriti");
				return false;
			}

		}
		
		



		return false; 
	}




	public int getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(int duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}







}
