package drone;


public class Drone implements StandardDrone{
	
	private int x;
	private int y;
	private int z;
	private int[] pozicija;
	private int[] granicaGornja;
	private int[] granicaDonja;
	
	public Drone(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Drone(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Drone(int[] pozicija){
		this.pozicija =pozicija;
	}
	
	public Drone(int x, int y, int z, int[] granicaGornja, int[] granicaDonja)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.granicaGornja = granicaGornja;
		this.granicaDonja=granicaDonja;
	}
	public Drone(int[] pozicija, int[] granicaGornja, int[] granicaDonja) 
	{
		this.pozicija = pozicija;
		this.granicaGornja = granicaGornja;
		this.granicaDonja=granicaDonja;
	}

	@Override
	public String moveUp(int gore) {
		if(y + gore <= granicaGornja[1] && y+gore<=granicaDonja[1])
		{
			y += gore;			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown(int dole) {
		if(y - dole <= granicaGornja[1] && y-dole<=granicaDonja[1])
		{
			y -= dole;			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft(int levo) {
		if(x - levo <= granicaGornja[1] && x-levo<=granicaDonja[1])
		{
			x -= levo;			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight(int desno) {
		if(x + desno <= granicaGornja[1] && x+desno<=granicaDonja[1])
		{
			x += desno;			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack(int nazad) {
		if(z - nazad <= granicaGornja[1] && z-nazad<=granicaDonja[1])
		{
			z -= nazad;			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth(int napred) {
		if(z + napred <= granicaGornja[1] && z+napred<=granicaDonja[1])
		{
			z += napred;			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		return "Pozicija:(" + Integer.toString(getX()) + ","+ Integer.toString(getY()) + "," + Integer.toString(getZ()) + ")";
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

	public int[] getPozicija() {
		return pozicija;
	}

	public void setPozicija(int[] pozicija) {
		this.pozicija = pozicija;
	}

	public int[] getGranicaGornja() {
		return granicaGornja;
	}

	public void setGranicaGornja(int[] granice) {
		this.granicaGornja = granice;
	}

	public int[] getGranicaDonja() {
		return granicaDonja;
	}

	public void setGranicaDonja(int[] granicaDonja) {
		this.granicaDonja = granicaDonja;
	}


}
