package drone;



public class dron implements StandardDrone {
	private int x;
	private int y;
	private int z;
	
	public dron() {
		this.x = 30;
		this.z = 30;
		this.y = 0;
	}
	
	public String Gore() {
		if(y < 10 || y > 40){
			if(y == 50)
				return Koordinate() + " Dron je na spoljnoj strani kvadrata!";
			y += 1;
			return Koordinate();
		} else if(((x <= 10 || x >= 40) || (z <= 10 || z >= 40)) && (y >= 10 || y <= 40)){
			y += 1;
			return Koordinate();
		} else
			return Koordinate() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	
	public String Dole() {
		if(y < 10 || y > 40){
			if(y == 0)
				return Koordinate() + " Dron je na spoljnoj strani kvadrata!";
			y -= 1;
			return Koordinate();
		} else if(((x <= 10 || x >= 40) || (z <= 10 || z >= 40)) && (y >= 10 || y <= 40)){
			y -= 1;
			return Koordinate();
		} else
			return Koordinate() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	
	public String Levo() {
		if(x < 10 || x > 40){
			if(x == 0)
				return Koordinate() + " Dron je na spoljnoj strani kvadrata!";
			x -= 1;
			return Koordinate();
		} else if((x >= 10 || x <= 40) && ((y <= 10 || y >= 40) || (z <= 10 || z >= 40))){
			x -= 1;
			return Koordinate();
		} else
			return Koordinate() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	
	public String Desno() {
		if(x < 10 || x > 40){
			if(x == 50)
				return Koordinate() + " Dron je na spoljnoj strani kvadrata!";
			x += 1;
			return Koordinate();
		} else if((x >= 10 || x <= 40) && ((y <= 10 || y >= 40) || (z <= 10 || z >= 40))){
			x += 1;
			return Koordinate();
		} else
			return Koordinate() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	

	public String Nazad() {
		if(z < 10 || z > 40){
			if(z == 0)
				return Koordinate() + " Dron je na spoljnoj strani kvadrata!";
			z -= 1;
			return Koordinate();
		} else if((z >= 10 || z <= 40) && ((x <= 10 || x >= 40) || (y <= 10 || y >= 40))){
			z -= 1;
			return Koordinate();
		} else
			return Koordinate() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	
	public String Napred() {
		if(z < 10 || z > 40){
			if(z == 50)
				return Koordinate() + " Dron je na spoljnoj strani kvadrata!";
			z += 1;
			return Koordinate();
		} else if((z >= 10 || z <= 40) && ((x <= 10 || x >= 40) || (y <= 10 || y >= 40))){
			z += 1;
			return Koordinate();
		} else
			return Koordinate() + " Dron je na unutrasnjoj strani kvadrata!";
	}
	
	public String Koordinate() {
		return "Kordinate drona su: " + 
				Integer.toString(x) + " " +
				Integer.toString(y) + " " +
				Integer.toString(z);
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
