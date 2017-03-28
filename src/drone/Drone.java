package drone;

public class Drone implements StandardDrone {

	private int x;
	private int y;
	private int z;
	private int[] granice;
	private int[] koordinate;
	private int razdaljina = 10;

	public Drone(int[] granice, int[] koordinate) {
		this.granice = granice;
		this.koordinate = koordinate;
	}
	
	public Drone(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
			
	
	public String moveUp() {		
		
		if (koordinate[1] == 50 || (koordinate[1] == 10 && koordinate[0] > 10 && koordinate[0] < 40 && koordinate[2] > 10 && koordinate[2] < 40)) {
			
			return  "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";
			
		} else {
			
			koordinate[1]++;
			
		}
		
		return "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";		
	}

	public String moveDown() {
		
		if(koordinate[1] == 0 || (koordinate[1] == 40 && koordinate[0] > 10 && koordinate[0] < 40 && koordinate[2] > 10 && koordinate[2] < 40)) {
			
			return  "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";
			
		} else {
			
			koordinate[1]--;
			
		}				
		
		return "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";
	}
	

	
	public String moveLeft() {
				
		if (koordinate[0] == 0 || (koordinate[0] == 40 && koordinate[1] > 10 && koordinate[1] < 40 && koordinate[2] > 10 && koordinate[2] < 40)) {
			
			 return "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";
			
		} else {
			
			koordinate[0]--;
			
		}
		
		return "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";
	}

	public String moveRight() {
				
		if (koordinate[0] == 50 || (koordinate[0] == 10 && koordinate[1] > 10 && koordinate[1] < 40 && koordinate[2] > 10 && koordinate[2] < 40)) {

			return  "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";
			
		} else {
			
			koordinate[0]++;
			
		}
		
		return "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";
	}

	
	
	public String moveBack() {
					
		if (koordinate[2] == 50 || (koordinate[2] == 10 && koordinate[0] > 10 && koordinate[0] < 40 && koordinate[1] > 10 && koordinate[1] < 40)) {
			
			return  "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";
			
		} else {
			
			koordinate[2]++;
			
		}
		
		return "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";
	}

	public String moveForth() {
				
		if (koordinate[2] == 0 || (koordinate[2] == 40 && koordinate[0] > 10 && koordinate[0] < 40 && koordinate[1] > 10 && koordinate[1] < 40)) {
			
			return  "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";
			
		} else {
			koordinate[2]--;
		}
		 
		return "(" + Integer.toString(koordinate[0]) + ", " + Integer.toString(koordinate[1]) + ", " + Integer.toString(koordinate[2]) + ")";
	}

	
	
	public String getFormatedCoordinates() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
	
	

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}
	

}
