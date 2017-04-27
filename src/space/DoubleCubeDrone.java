package space;
import drone.*;
import utility.*;

public class DoubleCubeDrone implements StandardDrone{
	Cube k1 = new Cube(new int[] {30,0,30}, 1);
	Cube k2 = new Cube(k1);
	
	public DoubleCubeDrone() {
		
	}
	
	public DoubleCubeDrone(Cube k1, Cube k2) {
		this.k1 = k1;
		this.k2 = k2;
	}
	
	FlySpace space = new FlySpace();
	
	protected boolean validateDronePositionAfter(String komanda) {
		Cube pom1=new Cube(k1);
		Cube pom2=new Cube(k2);
		switch(komanda){
		case "moveUp":
			if(pom1.checkIfCubesAreTouchingFromInside(space.getVelika())==false){
				if(pom1.checkIfCubesAreTouchingFromOutside(space.getMala())==false){
					pom1.increaseY(1);
					pom2.increaseY(1);
					return true;
				}else {
					return false;
				}
			}else{
				return false;
			}
			
		case "moveDown":
			if(pom2.checkIfCubesAreTouchingFromInside(space.getVelika())==false){
				if(pom2.checkIfCubesAreTouchingFromOutside(space.getMala())==false){
					pom1.decreaseY(1);
					pom2.decreaseY(1);
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
			
		case "moveLeft":
			if(pom1.checkIfCubesAreTouchingFromInside(space.getVelika())==false){
				if(pom1.checkIfCubesAreTouchingFromOutside(space.getMala())==false){
					pom1.decreaseX(1);
					pom2.decreaseX(1);
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
			
		case "moveRight":
			if(pom2.checkIfCubesAreTouchingFromInside(space.getVelika())==false){
				if(pom2.checkIfCubesAreTouchingFromOutside(space.getMala())==false){
					pom1.increaseX(1);
					pom2.increaseX(1);
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
			
		case "moveForth":
			if(pom1.checkIfCubesAreTouchingFromInside(space.getVelika())==false){
				if(pom1.checkIfCubesAreTouchingFromOutside(space.getMala())==false){
					pom1.decreaseZ(1);
					pom2.decreaseZ(1);
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
			
		case "moveBack":
			if(pom2.checkIfCubesAreTouchingFromInside(space.getVelika())==false&&pom2.checkIfCubesAreTouchingFromOutside(space.getMala())==false){
				pom1.increaseZ(1);
				pom2.increaseZ(1);
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	
	
	@Override
	public String moveUp() {
		if(validateDronePositionAfter("moveUp")==true){
			k1.increaseY(1);
			k2.increaseY(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	@Override
	public String moveDown() {
		if(validateDronePositionAfter("moveDown")==true){
			k1.decreaseY(1);
			k2.decreaseY(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	@Override
	public String moveLeft() {
		if(validateDronePositionAfter("moveLeft")==true){
			k1.decreaseX(1);
			k2.decreaseX(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	@Override
	public String moveRight() {
		if(validateDronePositionAfter("moveRight")==true){
			k1.increaseX(1);
			k2.increaseX(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	@Override
	public String moveBack() {
		if(validateDronePositionAfter("moveBack")==true){
			k1.increaseZ(1);
			k2.increaseZ(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	@Override
	public String moveForth() {
		if(validateDronePositionAfter("moveForth")==true){
			k1.decreaseZ(1);
			k2.decreaseZ(1);
			return getFormatedCoordinates();
		}else
			return getFormatedCoordinates();
	}
	@Override
	public String getFormatedCoordinates() {
		return k1.toString() + "-->" + k2.toString();
	}


	
	
	
	
}
