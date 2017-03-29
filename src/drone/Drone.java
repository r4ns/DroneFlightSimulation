package drone;

public class Drone implements StandardDrone {

	int x = 30;
	int y= 0;
	int z = 30;
	

	public Drone(int x, int y, int z){

		this.x=x;
		this.y=y;
		this.z=z;
	}

	@Override
	public String moveUp() {
		
		
		if(x>10 && x<40 && z>10 && z<40 && y>=0 && y<10){
			
			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		} else if(x>10 && x<40 && z>10 && z<40 && y>=40 && y<50) {
			
			y++;       
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		} else if (x>=0 && x<=10 && z>=0 && z<=50 && y>=0 && y<50){
			
			y++;
			
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		} else if (x>=40 && x<=50 && z>=0 && z<=50 && y>=0 && y<50){
			
			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
			
		} else if (x>=0 && x<=50 && z>=40 && z<=50 && y>=0 && y<50){
			
			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
			
		} else if (x>=0 && x<=50 && z>=0 && z<=10 && y>=0 && y<50){
			
			y++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
			
		} else {
			
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}
			
			return "Drone position: ("+x+","+y+","+z+")";
		
			

		



	}




	@Override
	public String moveDown() {

		if(x>=0 && x<=50 && z>=0 && z<=50 && y>0 && y<=10){
			
			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(x>=0 && x<=50 && z>=0 && z<=50 && y>40 && y<=50){
			
			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(x>=0 && x<=10 && z>=0 && z<=50 && y>0 && y<=50){
			
			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(x>=40 && x<=50 && z>=0 && z<=50 && y>0 && y<=50){
			
			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(x>=0 && x<=50 && z>=40 && z<=50 && y>0 && y<=50){
			
			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(x>=0 && x<=50 && z>=0 && z<=10 && y>0 && y<=50){
			
			y--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}


		return "Drone position: ("+x+","+y+","+z+")";

	}

	@Override
	public String moveLeft() {

		if(y>=0 && y<=10 && z>=0 && z<=50 && x>0 && x<50){
			
			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		} else if(y>10 && y<40 && z>10 && z<40 && x>0 && x<=10){
			
			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		} else if(y>10 && y<40 && z>10 && z<40 && x>40 && x<=50){
			
			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		}else if(y>=40 && y<=50 && z>=0 && z<=50 && x>0 && x<=50){
			
			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		}else if(y>=0 && y<=50 && z>=40 && z<= 50 && x>0 && x<=50){
			
			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		}else if(y>=0 && y<=50 && z>=0 && z<=10 && x>0 && x<=50){
			
			x--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		} else {
			
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}


		return "Drone position: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveRight() {


		if(y>10 && y<40 && z>10 && z<40 && x>=0 && x<10){
			
			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		} else if(y>10 && y<40 && z>10 && z<40 && x>=40 && x<50){
			
			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(y>=0 && y<=10 && z>=0 && z<=50 && x>=0 && x<50){
			
			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=40 && y<=50 && z>=0 && z<=50 && x>=0 && x<50){
			
			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=0 && y<=50 && z>=0 && z<=10 && x>=0 & x<50){
			
			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(y>=0 && y<=50 && z>=40 && z<=50 && x>=0 && x<50){
			
			x++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else {
			
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}
		
		return "Drone position: ("+x+","+y+","+z+")";

	}

	@Override
	public String moveBack() {
		
		if(y>=0 && y<=10 && x>=0 && x<=50 && z>=0 && z<50){
			
			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>10 && y<40 && x>10 && x<40 && z>=40 && z<50){
			
			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		}else if(y>10 && y<40 && x>10 && x<40 && z>=0 && z<10){
			
			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		}else if(y>=40 && y<=50 && x>=0 && x<=50 && z>=0 && z<50){
			
			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		}else if(y>=0 && y<=50 && x>=0 && x<=10 && z>=0 && z<50){
			
			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		}else if(y>=0 && y<=50 && x>=40 && x<=50 && z>=0 && z<50){
			
			z++;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		} else {
			
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}

		return "Drone position: ("+x+","+y+","+z+")";
	}

	@Override
	public String moveForth() {
		
		if(y>=0 && y<=10 && x>=0 && x<=50 && z>0 && z<=50){
			
			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
			
		} else if(y>10 && y<40 && x>10 && x<40 && z>40 && z<=50){
			
			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>10 && y<40 && x>10 && x<40 && z>0 && z<=10){
			
			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=40 && y<=50 && x>=0 && x<=50 && z>0 && z<=50){
			
			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		} else if(y>=0 && y<=50 && x>=0 && x<=10 && z>0 && z<=50){
			
			z--;
			System.out.println("Drone position: ("+x+","+y+","+z+")");
		}else if(y>=0 && y<=50 && x>=40 && x<=50 && z>0 && z<=50){
			
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





}
