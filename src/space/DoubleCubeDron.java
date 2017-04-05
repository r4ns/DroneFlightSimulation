package space;

import drone.StandardDrone;

public class DoubleCubeDron implements StandardDrone {

	private int x;
	private int y;
	private int z;
	private int [] boundaries;
	private int razmak;
	private int duzinaStranice; 

	public DoubleCubeDron(){


	}

	public DoubleCubeDron(int x, int y, int z){

		this.x=x;
		this.y=y;
		this.z=z;
	}

	public DoubleCubeDron(int x, int y, int z, int [] boundaries, int razmak, int duzinaStranice){

		this.x=x;
		this.y=y;
		this.z=z;
		this.boundaries=boundaries;
		this.razmak = razmak; 
		this.duzinaStranice=duzinaStranice;
	}

	public DoubleCubeDron(int [] boundaries, int razmak){

		this.boundaries=boundaries;
		this.razmak=razmak;

	}

	@Override
	public String moveUp() {

		if(x>=razmak && x<boundaries[0]-razmak-duzinaStranice && z>razmak && z<boundaries[2]-razmak && y>=0 && y<razmak-duzinaStranice*2){ //10-39

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(x>razmak && x<boundaries[0]-razmak && z>razmak && z<boundaries[2]-razmak && y>=boundaries[1]-razmak && y<boundaries[1]-duzinaStranice*2){ //gornja

			y++;       
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if (x>=0 && x<razmak-duzinaStranice*2 && z>=0 && z<=boundaries[2] && y>=0 && y<boundaries[1]-duzinaStranice*2){ //leva

			y++;

			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if (x>=boundaries[0]-razmak && x<=boundaries[0]-duzinaStranice*2 && z>=0 && z<=boundaries[2] && y>=0 && y<boundaries[1]-duzinaStranice*2){ //desna

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		} else if (x>=0 && x<=boundaries[0]-duzinaStranice*2 && z>=boundaries[2]-razmak && z<=boundaries[2] && y>=0 && y<boundaries[1]-duzinaStranice*2){//napred

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		} else if (x>=0 && x<=boundaries[0]-razmak && z>=0 && z<=razmak && y>=0 && y<boundaries[1]-duzinaStranice*2){ //nazad

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		}else if (x>=boundaries[0]-razmak-duzinaStranice && x<=boundaries[0]-razmak && z>=razmak && z<=boundaries[2]-razmak && y>=0 && y<razmak-duzinaStranice){ //donja novi uslov

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		}else if (x>=boundaries[0]-razmak-duzinaStranice && x<=boundaries[0]-razmak && z>=0 && z<=razmak && y>=0 && y<razmak-duzinaStranice){ //donja treci uslov

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}

		return "Drone position: ("+x+","+y+","+z+")";

	}

	@Override
	public String moveDown() {

		if(x>=0 && x<=boundaries[0] && z>=0 && z<=50 && y>0 && y<=razmak){ //donja

			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(x>=0 && x<=boundaries[0] && z>=0 && z<=boundaries[2] && y>boundaries[2]-razmak && y<=boundaries[1]){

			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(x>=0 && x<=razmak && z>=0 && z<=boundaries[2] && y>0 && y<=boundaries[1]){

			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(x>=boundaries[0]-razmak && x<=boundaries[0] && z>=0 && z<=boundaries[2] && y>0 && y<=boundaries[1]){

			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(x>=0 && x<=boundaries[0] && z>=boundaries[2]-razmak && z<=boundaries[2] && y>0 && y<=boundaries[1]){

			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(x>=0 && x<=boundaries[0] && z>=0 && z<=razmak && y>0 && y<=boundaries[1]){

			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}


		return "Drone position: ("+x+","+y+","+z+")";


	}

	@Override
	public String moveLeft() {

		if(y>=0 && y<=razmak && z>=0 && z<=boundaries[2] && x>=duzinaStranice && x<boundaries[0]){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>=duzinaStranice && x<=razmak){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>boundaries[0]-razmak && x<=boundaries[0]){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=boundaries[1]-razmak && y<=boundaries[1] && z>=0 && z<=boundaries[2] && x>=duzinaStranice && x<=boundaries[0]){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && z>=40 && z<= boundaries[2] && x>=duzinaStranice && x<=boundaries[0]){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && z>=0 && z<=razmak && x>=duzinaStranice && x<=boundaries[0]){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}


		return "Drone position: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveRight() {

		if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>=0 && x<razmak-duzinaStranice*2){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>=boundaries[0]-razmak && x<boundaries[0]-duzinaStranice*2){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(y>=0 && y<=razmak && z>=0 && z<=boundaries[2] && x>=0 && x<boundaries[0]-duzinaStranice*2){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=boundaries[1]-razmak && y<=boundaries[1] && z>=0 && z<=boundaries[2] && x>=0 && x<boundaries[0]-duzinaStranice*2){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=0 && y<=boundaries[1] && z>=0 && z<=razmak && x>=0 & x<boundaries[0]){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(y>=0 && y<=boundaries[1] && z>=boundaries[2]-razmak && z<=boundaries[2] && x>=0 && x<boundaries[0]-duzinaStranice*2){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}

		return "Drone position: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveBack() {

		if(y>=0 && y<=razmak && x>=0 && x<boundaries[0] && z>=0 && z<boundaries[2]-duzinaStranice){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>=boundaries[2]-razmak && z<boundaries[2]-duzinaStranice){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>=0 && z<razmak-duzinaStranice){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=boundaries[1]-razmak && y<=boundaries[1] && x>=0 && x<=boundaries[0] && z>=0 && z<boundaries[2]-duzinaStranice){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && x>=0 && x<=razmak && z>=0 && z<boundaries[2]){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && x>=boundaries[0]-razmak && x<=boundaries[0] && z>=0 && z<boundaries[2]-duzinaStranice){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=razmak-duzinaStranice && x>=razmak && x<=boundaries[0]-razmak && z>=0 && z<boundaries[2]-duzinaStranice){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}

		return "Drone position: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveForth() {

		return null;
	}

	@Override
	public String getFormatedCoordinates() {

		return null;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int[] getBoundaries() {
		return boundaries;
	}

	public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}

	public int getRazmak() {
		return razmak;
	}

	public void setRazmak(int razmak) {
		this.razmak = razmak;
	}

	public int getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(int duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}







}
