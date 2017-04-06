package drone;

public class Drone implements StandardDrone {



	protected int x;
	protected int y;
	protected int z;
	protected int [] coordinates = {x,y,z};
	protected int [] boundaries;
	protected int razmak; 

	public Drone(){


	}

	public Drone(int x, int y, int z){

		this.x=x;
		this.y=y;
		this.z=z;
	}

	public Drone(int x, int y, int z, int [] boundaries, int razmak){

		this.x=x;
		this.y=y;
		this.z=z;
		this.boundaries=boundaries;
		this.razmak = razmak; 
	}

	public Drone(int [] boundaries, int razmak){

		this.boundaries=boundaries;
		this.razmak=razmak;

	}


	@Override
	public String moveUp() {


		if(x>razmak && x<boundaries[0]-razmak && z>razmak && z<boundaries[2]-razmak && y>=0 && y<razmak){//donja

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(x>razmak && x<boundaries[0]-razmak && z>razmak && z<boundaries[2]-razmak && y>=boundaries[1]-razmak && y<boundaries[1]){//gornja

			y++;       
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if (x>=0 && x<=razmak && z>=razmak && z<=boundaries[2]-razmak && y>=0 && y<boundaries[1]){ //leva***

			y++;

			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if (x>=boundaries[0]-razmak && x<=boundaries[0] && z>=razmak && z<=boundaries[2]-razmak && y>=0 && y<boundaries[1]){//desna***

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		} else if (x>=0 && x<=boundaries[0] && z>=boundaries[2]-razmak && z<=boundaries[2] && y>=0 && y<boundaries[1]){//napred

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		} else if (x>=0 && x<=boundaries[0] && z>=0 && z<=razmak && y>=0 && y<boundaries[1]){ //nazad

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}

		return "Drone position: ("+x+","+y+","+z+")";







	}




	@Override
	public String moveDown() {

		if(x>=0 && x<=boundaries[0] && z>=0 && z<=boundaries[2] && y>0 && y<=razmak){

			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(x>=0 && x<=boundaries[0] && z>=0 && z<=boundaries[2] && y>boundaries[1]-razmak && y<=boundaries[1]){

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

		if(y>=0 && y<=razmak && z>=0 && z<=boundaries[2] && x>0 && x<boundaries[0]){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>0 && x<=razmak){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>boundaries[0]-razmak && x<=boundaries[0]){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=boundaries[1]-razmak && y<=boundaries[1] && z>=0 && z<=boundaries[2] && x>0 && x<=boundaries[0]){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && z>=40 && z<= boundaries[2] && x>0 && x<=boundaries[0]){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && z>=0 && z<=razmak && x>0 && x<=boundaries[0]){

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}


		return "Drone position: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveRight() {


		if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>=0 && x<razmak){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>=boundaries[0]-razmak && x<boundaries[0]){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(y>=0 && y<=razmak && z>=0 && z<=boundaries[2] && x>=0 && x<boundaries[0]){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=boundaries[1]-razmak && y<=boundaries[1] && z>=0 && z<=boundaries[2] && x>=0 && x<boundaries[0]){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=0 && y<=boundaries[1] && z>=0 && z<=razmak && x>=0 & x<boundaries[0]){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(y>=0 && y<=boundaries[1] && z>=boundaries[2]-razmak && z<=boundaries[2] && x>=0 && x<boundaries[0]){

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}

		return "Drone position: ("+x+","+y+","+z+")";

	}

	@Override
	public String moveBack() {

		if(y>=0 && y<=razmak && x>=0 && x<=boundaries[0] && z>=0 && z<boundaries[2]){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>=boundaries[2]-razmak && z<boundaries[2]){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>=0 && z<razmak){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=boundaries[1]-razmak && y<=boundaries[1] && x>=0 && x<=boundaries[0] && z>=0 && z<boundaries[2]){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && x>=0 && x<=razmak && z>=0 && z<boundaries[2]){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && x>=boundaries[0]-razmak && x<=boundaries[0] && z>=0 && z<boundaries[2]){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}

		return "Drone position: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveForth() {

		if(y>=0 && y<=razmak && x>=0 && x<=boundaries[0] && z>0 && z<=boundaries[2]){

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>boundaries[2]-razmak && z<=boundaries[2]){

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>0 && z<=razmak){

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=boundaries[1]-razmak && y<=boundaries[1] && x>=0 && x<=boundaries[0] && z>0 && z<=boundaries[2]){

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=0 && y<=boundaries[1] && x>=0 && x<=razmak && z>0 && z<=boundaries[2]){

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(y>=0 && y<=boundaries[1] && x>=boundaries[0]-razmak && x<=boundaries[0] && z>0 && z<=boundaries[2]){

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}


		return "Drone position: ("+x+","+y+","+z+")";
	}


	public String getFormatedCoordinates() {

		return "Drone position: ("+x+","+y+","+z+")";

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





}
