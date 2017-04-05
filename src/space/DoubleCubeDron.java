package space;

import drone.Drone;


public class DoubleCubeDron extends Drone {

	private int duzinaStranice; 



	public DoubleCubeDron(){
		
		
	}

	public DoubleCubeDron(int x, int y, int z, int [] boundaries, int razmak, int duzinaStranice){
		
		super(x,y,z,boundaries,razmak);
		this.duzinaStranice=duzinaStranice;
	}


	@Override
	public String moveUp() {


		if(x>razmak && x<boundaries[0]-razmak-duzinaStranice && z>razmak && z<boundaries[2]-razmak && y>=0 && y<razmak-duzinaStranice*2){ //donja do 39,napred

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(x>razmak && x<boundaries[0]-razmak && z>razmak && z<boundaries[2]-razmak && y>=boundaries[1]-razmak && y<boundaries[1]-duzinaStranice*2){ //gore

			y++;       
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if (x>=0 && x<razmak-2*duzinaStranice && z>=razmak && z<=boundaries[2]-razmak && y>=0 && y<boundaries[1]-duzinaStranice*2){  //leva

			y++;

			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if (x>=boundaries[0]-razmak && x<=boundaries[0] && z>=10 && z<=boundaries[2]-razmak && y>=0 && y<boundaries[1]-duzinaStranice*2){ //desna

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		} else if (x>=0 && x<=boundaries[0] && z>=boundaries[2]-razmak && z<=boundaries[2] && y>=0 && y<boundaries[1]-duzinaStranice*2){ //napred

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		} else if (x>=0 && x<=boundaries[0] && z>=0 && z<=razmak && y>=0 && y<boundaries[1]-duzinaStranice*2){ //nazad

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		}else if (x>=boundaries[0]-razmak-duzinaStranice && x<=boundaries[0]-razmak && z>razmak && z<boundaries[2]-razmak && y>=0 && y<razmak-duzinaStranice){ //dole od 39,napred

			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");


		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}

		return "Drone position: ("+x+","+y+","+z+")";


	}

	@Override
	public String moveDown() {

		if(x>=razmak && x<=boundaries[0]-razmak && z>=razmak && z<=boundaries[2]-razmak && y>0 && y<=razmak){ //donja

			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(x>=razmak && x<=boundaries[0]-razmak && z>=razmak && z<=boundaries[2]-razmak && y>boundaries[2]-razmak && y<=boundaries[1]){ //gornja

			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(x>=0 && x<=razmak && z>=razmak && z<=boundaries[2]-razmak && y>0 && y<=boundaries[1]){

			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(x>=boundaries[0]-razmak && x<=boundaries[0] && z>=razmak && z<=boundaries[2]-razmak && y>0 && y<=boundaries[1]){

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

		if(y>=0 && y<=razmak && z>=0 && z<=boundaries[2] && x>=duzinaStranice && x<boundaries[0]){ //dole

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>=duzinaStranice && x<=razmak-duzinaStranice*2){ //levo

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>boundaries[0]-razmak && x<=boundaries[0]){ //desna

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=boundaries[1]-razmak && y<=boundaries[1] && z>=0 && z<=boundaries[2] && x>=duzinaStranice && x<=boundaries[0]){ //gore

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && z>=boundaries[2]-razmak && z<= boundaries[2] && x>=duzinaStranice && x<=boundaries[0]){ //napred

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && z>=0 && z<=razmak && x>=duzinaStranice && x<=boundaries[0]){ //nazad

			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}


		return "Drone position: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveRight() {

		if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>=0 && x<razmak-duzinaStranice*2){ //levo

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(y>razmak && y<boundaries[1]-razmak && z>razmak && z<boundaries[2]-razmak && x>=boundaries[0]-razmak && x<boundaries[0]-duzinaStranice*2){ //desno

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(y>=0 && y<=razmak && z>=razmak && z<=boundaries[2]-razmak && x>=0 && x<boundaries[0]-duzinaStranice*2){ //dole

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=boundaries[1]-razmak && y<=boundaries[1] && z>=0 && z<=boundaries[2] && x>=0 && x<boundaries[0]-duzinaStranice*2){ //gore

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=0 && y<=boundaries[1] && z>=0 && z<=razmak && x>=0 & x<boundaries[0]-duzinaStranice*2){ //nazad

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(y>=0 && y<=boundaries[1] && z>=boundaries[2]-razmak && z<=boundaries[2] && x>=0 && x<boundaries[0]-duzinaStranice*2){ //napred

			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}

		return "Drone position: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveBack() {

		if(y>=0 && y<=razmak && x>=0 && x<boundaries[0] && z>=0 && z<boundaries[2]-duzinaStranice){ //dole

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>=boundaries[2]-razmak && z<boundaries[2]-duzinaStranice){ //napred

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>=0 && z<razmak-duzinaStranice){ //nazad

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=boundaries[1]-razmak && y<=boundaries[1] && x>=0 && x<=boundaries[0] && z>=0 && z<boundaries[2]-duzinaStranice){ //gore

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && x>=0 && x<=razmak && z>=0 && z<boundaries[2]-duzinaStranice){ //levo

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}else if(y>=0 && y<=boundaries[1] && x>=boundaries[0]-razmak && x<=boundaries[0] && z>=0 && z<boundaries[2]-duzinaStranice){ //desno

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}/*else if(y>=0 && y<=razmak-duzinaStranice && x>=razmak && x<=boundaries[0]-razmak && z>=0 && z<boundaries[2]-duzinaStranice){

			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		}*/ else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}

		return "Drone position: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveForth() {

		if(y>=0 && y<=razmak && x>=0 && x<=boundaries[0] && z>duzinaStranice && z<=boundaries[2]){ //dole

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");

		} else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>boundaries[2]-razmak-duzinaStranice && z<=boundaries[2]){

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>razmak && y<boundaries[1]-razmak && x>razmak && x<boundaries[0]-razmak && z>duzinaStranice && z<=razmak){

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=boundaries[1]-razmak && y<=boundaries[1] && x>=0 && x<=boundaries[0] && z>duzinaStranice && z<=boundaries[2]){

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=0 && y<=boundaries[1] && x>=0 && x<=razmak && z>duzinaStranice && z<=boundaries[2]){

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(y>=0 && y<=boundaries[1] && x>=boundaries[0]-razmak && x<=boundaries[0] && z>duzinaStranice && z<=boundaries[2]){

			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else {

			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}


		return "Drone position: ("+x+","+y+","+z+")";
	}

	@Override
	public String getFormatedCoordinates() {

		return null;
	}

	

	public int getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(int duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}







}
