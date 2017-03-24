package drone;

public class Drone implements StandardDrone{

	private int xKordinata;
	private int yKordinata;
	private int zKordinata;
	
	private int brojUdarenihIvica;
	
	public Drone(){
		
	}

	public Drone(int xKordinata, int yKordinata, int zKordinata){
		this.xKordinata = xKordinata;
		this.yKordinata = yKordinata;
		this.zKordinata = zKordinata;
	}
	
	@Override
	public String moveUp() {
		yKordinata++;
	
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		yKordinata--;
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		xKordinata--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		xKordinata++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		zKordinata--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		zKordinata++;
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		/*
		if(xKordinata == 0 || xKordinata == 50 || yKordinata == 0 || yKordinata == 50 || zKordinata == 0 || zKordinata == 50)
			System.out.print("Drone hits outer square border: ");
		if(xKordinata == 10 || xKordinata == 40 || yKordinata == 10 || yKordinata == 40 || zKordinata == 10 || zKordinata == 50)
			System.out.print("Drone hits inner square border: ");
			*/
		return "Drone position (" + xKordinata +  "," + yKordinata + "," + zKordinata + ")";
	}
	
	public int getxKordinata() {
		return xKordinata;
	}

	public int getyKordinata() {
		return yKordinata;
	}

	public int getzKordinata() {
		return zKordinata;
	}

	public void setxKordinata(int xKordinata) {
		this.xKordinata = xKordinata;
	}

	public void setyKordinata(int yKordinata) {
		this.yKordinata = yKordinata;
	}

	public void setzKordinata(int zKordinata) {
		this.zKordinata = zKordinata;
	}

	public void setBrojUdarenihIvica(int brojUdarenihIvica) {
		this.brojUdarenihIvica = brojUdarenihIvica;
	}
	
	

}
