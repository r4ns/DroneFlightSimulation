package space;

import drone.DroneOne;

public class DoubleCubeDrone extends DroneOne {
	
	private DroneOne tDoleDesno;
	private DroneOne tSredinaDesno;
	private DroneOne tSredinaLevo;
	private DroneOne tGoreLevo;
	private int[] startCoordinates = {30, 0, 30};

	
	public DoubleCubeDrone () {
		
	}
	
	
	public DoubleCubeDrone(DroneOne tDoleDesno, DroneOne tSredinaDesno, DroneOne tSredinaLevo, DroneOne tGoreLevo) {
		this.tDoleDesno = tDoleDesno;
		this.tSredinaDesno = tSredinaDesno;
		this.tSredinaLevo = tSredinaLevo;
		this.tGoreLevo = tGoreLevo;
		
		/*this.startCoordinates1[0] = tDoleDesno.getX();
		this.startCoordinates1[1] = tDoleDesno.getY();
		this.startCoordinates1[2] = tDoleDesno.getZ();
		
		this.startCoordinates2[0] = tGoreLevo.getX();
		this.startCoordinates2[1] = tGoreLevo.getY();
		this.startCoordinates2[2] = tGoreLevo.getZ();
		
		this.startCoordinates3[0] = tSredinaDesno.getX();
		this.startCoordinates3[1] = tSredinaDesno.getY();
		this.startCoordinates3[2] = tSredinaDesno.getZ();
		
		this.startCoordinates4[0] = tSredinaLevo.getX();
		this.startCoordinates4[1] = tSredinaLevo.getY();
		this.startCoordinates4[2] = tSredinaLevo.getZ();*/

	}
	
	public String moveUp() {
		if ((tDoleDesno.provera("moveUp") == true) && (tSredinaDesno.provera("moveUp") == true)
					&& (tSredinaLevo.provera("moveUp") == true) && (tGoreLevo.provera("moveUp") == true)) {
					this.tDoleDesno.moveUp();
					this.tSredinaDesno.moveUp();
					this.tSredinaLevo.moveUp();
					this.tGoreLevo.moveUp();
		return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}
	public String moveDown(){
			if ((tDoleDesno.provera("moveDown") == true) && (tSredinaDesno.provera("moveDown") == true)
					&& (tSredinaLevo.provera("moveDown") == true) && (tGoreLevo.provera("moveDown") == true)) {
				this.tDoleDesno.moveDown();
				this.tGoreLevo.moveDown();
				this.tSredinaDesno.moveDown();
				this.tSredinaLevo.moveDown();
				return getFormatedCoordinates();			
			}
			else
				return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
			if ((tDoleDesno.provera("moveLeft") == true) && (tSredinaDesno.provera("moveLeft") == true)
					&& (tSredinaLevo.provera("moveLeft") == true) && (tGoreLevo.provera("moveLeft") == true)) {
				this.tDoleDesno.moveLeft();
				this.tGoreLevo.moveLeft();
				this.tSredinaDesno.moveLeft();
				this.tSredinaLevo.moveLeft();
				return getFormatedCoordinates();
			}
		else
			return getFormatedCoordinates();
	}
	public String moveRight(){		
			if ((tDoleDesno.provera("moveRight") == true) && (tSredinaDesno.provera("moveRight") == true)
					&& (tSredinaLevo.provera("moveRight") == true) && (tGoreLevo.provera("moveRight") == true)) {
				this.tDoleDesno.moveRight();
				this.tGoreLevo.moveRight();
				this.tSredinaDesno.moveRight();
				this.tSredinaLevo.moveRight();
				return getFormatedCoordinates();
			}
			else
				return getFormatedCoordinates();
			
	}
	@Override
	public String moveBack() {
		if ((tDoleDesno.provera("moveBack") == true) && (tSredinaDesno.provera("moveBack") == true)
					&& (tSredinaLevo.provera("moveBack") == true) && (tGoreLevo.provera("moveBack") == true)) {
				this.tDoleDesno.moveBack();
				this.tGoreLevo.moveBack();
				this.tSredinaDesno.moveBack();
				this.tSredinaLevo.moveBack();
				return getFormatedCoordinates();
		}
		else
				return getFormatedCoordinates();
	}
	
	@Override
	public String moveForth() {
			if ((tDoleDesno.provera("moveForth") == true) && (tSredinaDesno.provera("moveForth") == true)
					&& (tSredinaLevo.provera("moveForth") == true) && (tGoreLevo.provera("moveForth") == true)) {
				this.tDoleDesno.moveForth();
				this.tGoreLevo.moveForth();
				this.tSredinaDesno.moveForth();
				this.tSredinaLevo.moveForth();
				return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();
	}
	
	public String getFormatedCoordinates() {
		return "Dole desna: (" + this.tDoleDesno.getX() + ", " + this.tDoleDesno.getY() + ", " + this.tDoleDesno.getZ() + ")  "
				+ "Sredina desna: (" + this.tSredinaDesno.getX() + ", " + this.tSredinaDesno.getY() + ", " + this.tSredinaDesno.getZ() + ")  "
				+ "Sredina leva: (" + this.tSredinaLevo.getX() + ", " + this.tSredinaLevo.getY() + ", " + this.tSredinaLevo.getZ() + ")  "
				+ "Gore leva: (" + this.tGoreLevo.getX() + ", " + this.tGoreLevo.getY() + ", " + this.tGoreLevo.getZ() + ")"; 
	}

	public DroneOne gettDoleDesno() {
		return tDoleDesno;
	}
	public DroneOne gettSredinaDesno() {
		return tSredinaDesno;
	}
	public DroneOne gettSredinaLevo() {
		return tSredinaLevo;
	}
	public DroneOne gettGoreLevo() {
		return tGoreLevo;
	}
	public void settDoleDesno(DroneOne tDoleDesno) {
		this.tDoleDesno = tDoleDesno;
	}
	public void settSredinaDesno(DroneOne tSredinaDesno) {
		this.tSredinaDesno = tSredinaDesno;
	}
	public void settSredinaLevo(DroneOne tSredinaLevo) {
		this.tSredinaLevo = tSredinaLevo;
	}
	public void settGoreLevo(DroneOne tGoreLevo) {
		this.tGoreLevo = tGoreLevo;
	}
	public int[] getStartCoordinates() {
		return startCoordinates;
	}

	public void setStartCoordinates(int[] startCoordinates) {
		this.startCoordinates = startCoordinates;
	}



	
	

}
