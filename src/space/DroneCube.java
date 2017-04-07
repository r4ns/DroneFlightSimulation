package space;
public class DroneCube {	
private Tacka upRightForth = new Tacka();
private Tacka upRightBack = new Tacka();
private Tacka downLeftBack = new Tacka();
public FlySpace space;	
public DroneCube(int x, int y, int z, FlySpace space){
		downLeftBack.setX(x);
		downLeftBack.setY(y);
		downLeftBack.setZ(z);

		upRightBack.setX(x + 1);
		upRightBack.setY(y + 1);
		upRightBack.setZ(z);
 		
 		upRightForth.setX(x + 2);
 		upRightForth.setY(y + 2);
 		upRightForth.setZ(z - 1);
 		
 		this.space = space;
 	}
 	
public String getFormatedCoordinates (){
 		return "Drone position: (" + downLeftBack.getX() + ", " + downLeftBack.getY() + ", " + downLeftBack.getZ() + ")"; 
 	} 
 	
public String moveUp(){
 		if ((downLeftBack.getX() < space.getOuterBoundariesX() - space.getInnerSpaceX() && downLeftBack.getX() >= space.getInnerSpaceX()) && upRightBack.getX() < space.getOuterBoundariesX() - space.getInnerSpaceX() && upRightBack.getX() > space.getInnerSpaceX() && downLeftBack.getZ() <= space.getOuterBoundariesZ() - space.getInnerSpaceZ() && downLeftBack.getZ() > space.getInnerSpaceZ() && upRightForth.getY() < space.getInnerSpaceY()){
 			downLeftBack.setY(downLeftBack.getY() + 1);
 			upRightBack.setY(upRightBack.getY() + 1);
 			upRightForth.setY(upRightForth.getY() + 1);
 			return getFormatedCoordinates();
 		} else if ((downLeftBack.getX() < space.getOuterBoundariesX() - space.getInnerSpaceX() && downLeftBack.getX() >= space.getInnerSpaceX()) && upRightBack.getX() >= space.getOuterBoundariesX() - space.getInnerSpaceX() && upRightBack.getY() < space.getInnerSpaceY() && downLeftBack.getZ() <= space.getOuterBoundariesZ() - space.getInnerSpaceZ() && downLeftBack.getZ() > space.getInnerSpaceX()){
 			downLeftBack.setY(downLeftBack.getY() + 1);
 			upRightBack.setY(upRightBack.getY() + 1);
 			upRightForth.setY(upRightForth.getY() + 1);
 			return getFormatedCoordinates();
 		} else if ((upRightForth.getY() < space.getOuterBoundariesX() && downLeftBack.getY() >= space.getOuterBoundariesY() - space.getInnerSpaceY() && (downLeftBack.getX() < space.getOuterBoundariesX() - space.getInnerSpaceX() && downLeftBack.getX() >= space.getInnerSpaceX())) || (upRightForth.getY() < space.getOuterBoundariesX() && (downLeftBack.getX() >= space.getOuterBoundariesX() - space.getInnerSpaceX() && upRightForth.getX() <= space.getInnerSpaceX()))) {
 			downLeftBack.setY(downLeftBack.getY() + 1);
 			upRightBack.setY(upRightBack.getY() + 1);
 			upRightForth.setY(upRightForth.getY() + 1);
 			return getFormatedCoordinates();
 		} else if (((upRightForth.getX() <= space.getInnerSpaceX() || downLeftBack.getX() >= space.getOuterBoundariesZ() - space.getInnerSpaceZ()) || (upRightForth.getZ() >= space.getOuterBoundariesZ() - space.getInnerSpaceZ() || downLeftBack.getZ() <= space.getInnerSpaceZ())) && upRightForth.getY() < space.getOuterBoundariesY()){
 			downLeftBack.setY(downLeftBack.getY() + 1);
 			upRightBack.setY(upRightBack.getY() + 1);
 			upRightForth.setY(upRightForth.getY() + 1);
 			return getFormatedCoordinates();
 		} else {
 			return getFormatedCoordinates();
 		}
 	}
 	
public String moveDown(){
 		if ((downLeftBack.getX() < space.getOuterBoundariesX() - space.getInnerSpaceX() && downLeftBack.getX() >= space.getInnerSpaceX()) && downLeftBack.getZ() <= space.getOuterBoundariesZ() - space.getInnerSpaceZ() && downLeftBack.getZ() > space.getInnerSpaceZ() && upRightForth.getY() > space.getOuterBoundariesY() - space.getInnerSpaceY()){
 			downLeftBack.setY(downLeftBack.getY() - 1);
 			upRightBack.setY(upRightBack.getY() - 1);
 			upRightForth.setY(upRightForth.getY() - 1);
 			return getFormatedCoordinates();
 		} else if (upRightBack.getX() <= space.getInnerSpaceX() && upRightForth.getX() >= space.getInnerSpaceX() && upRightBack.getY() > space.getOuterBoundariesY() - space.getInnerSpaceY()){
 			downLeftBack.setY(downLeftBack.getY() - 1);
 			upRightBack.setY(upRightBack.getY() - 1);
 			upRightForth.setY(upRightForth.getY() - 1);
			return getFormatedCoordinates();
		} else if ((downLeftBack.getX() < space.getOuterBoundariesX() - space.getInnerSpaceX() && downLeftBack.getX() >= space.getInnerSpaceX()) && downLeftBack.getZ() <= space.getOuterBoundariesZ() - space.getInnerSpaceZ() && downLeftBack.getZ() > space.getInnerSpaceZ() && upRightForth.getY() <= space.getInnerSpaceY() && downLeftBack.getY() > 0) {
			downLeftBack.setY(downLeftBack.getY() - 1);
 			upRightBack.setY(upRightBack.getY() - 1);
 			upRightForth.setY(upRightForth.getY() - 1);
 			return getFormatedCoordinates();
 		} else if (((upRightForth.getX() <= space.getInnerSpaceX() || downLeftBack.getX() >= space.getOuterBoundariesX() - space.getInnerSpaceX()) || (upRightForth.getZ() >= space.getOuterBoundariesZ() - space.getInnerSpaceZ() || downLeftBack.getZ() <= space.getInnerSpaceZ())) && downLeftBack.getY() > space.getOuterBoundariesY()){
			downLeftBack.setY(downLeftBack.getY() - 1);
 			upRightBack.setY(upRightBack.getY() - 1);
 			upRightForth.setY(upRightForth.getY() - 1);
 			return getFormatedCoordinates();
 		} else {
 			return getFormatedCoordinates();
 		}	
 	}
 	
 public String moveLeft(){
 		if (downLeftBack.getY() >= space.getInnerSpaceY() && downLeftBack.getY() < space.getOuterBoundariesY() - space.getInnerSpaceY() && downLeftBack.getX() >= space.getOuterBoundariesX() - space.getInnerSpaceX() && downLeftBack.getZ() <= space.getOuterBoundariesZ() - space.getInnerSpaceZ() && downLeftBack.getZ() > space.getInnerSpaceZ()){
 			downLeftBack.setX(downLeftBack.getX() - 1);
 			upRightBack.setX(upRightBack.getX() - 1);
 			upRightForth.setX(upRightForth.getX() - 1);
 			return getFormatedCoordinates();
 		} else if (upRightForth.getY() > space.getInnerSpaceY() && upRightBack.getY() <= space.getInnerSpaceY() && upRightBack.getX() > space.getOuterBoundariesX() - space.getInnerSpaceX()){
 			downLeftBack.setX(downLeftBack.getX() - 1);
 			upRightBack.setX(upRightBack.getX() - 1);
			upRightForth.setX(upRightForth.getX() - 1);
			return getFormatedCoordinates();
	} else if (upRightForth.getY() <= space.getOuterBoundariesY() - space.getInnerSpaceY() && downLeftBack.getY() >= space.getInnerSpaceY() && downLeftBack.getX() > 0) {
			downLeftBack.setX(downLeftBack.getX() - 1);
 			upRightBack.setX(upRightBack.getX() - 1);
 			upRightForth.setX(upRightForth.getX() - 1);
 			return getFormatedCoordinates();
 		} else if (((downLeftBack.getY() >= space.getOuterBoundariesY() - space.getInnerSpaceY() || upRightForth.getY() <= space.getInnerSpaceY()) || (upRightForth.getZ() >= space.getOuterBoundariesZ() - space.getInnerSpaceZ() || downLeftBack.getZ() <= space.getInnerSpaceZ())) && downLeftBack.getX() > 0){
 			downLeftBack.setX(downLeftBack.getX() - 1);
 			upRightBack.setX(upRightBack.getX() - 1);
 			upRightForth.setX(upRightForth.getX() - 1);
 			return getFormatedCoordinates();
 		} else {
 			return getFormatedCoordinates();
		}	
	}
 	
 public String moveRight(){
 		if (upRightForth.getY() > space.getInnerSpaceY() && upRightForth.getY() < space.getOuterBoundariesY() - space.getInnerSpaceY() && downLeftBack.getZ() <= space.getOuterBoundariesZ() - space.getInnerSpaceZ() && downLeftBack.getZ() > space.getInnerSpaceZ() && upRightForth.getX() < space.getInnerSpaceX()){
 			downLeftBack.setX(downLeftBack.getX() + 1);
 			upRightBack.setX(upRightBack.getX() + 1);
 			upRightForth.setX(upRightForth.getX() + 1);
 			return getFormatedCoordinates();
 		} else if (downLeftBack.getY() <= space.getOuterBoundariesY() - space.getInnerSpaceY() && upRightBack.getY() >= space.getOuterBoundariesY() - space.getInnerSpaceY() && upRightBack.getX() < space.getInnerSpaceX()){
 			downLeftBack.setX(downLeftBack.getX() + 1);
 			upRightBack.setX(upRightBack.getX() + 1);
 			upRightForth.setX(upRightForth.getX() + 1);
 			return getFormatedCoordinates();
 		} else if (upRightForth.getY() <= space.getOuterBoundariesY() - space.getInnerSpaceY() && downLeftBack.getY() >= space.getInnerSpaceY() && upRightForth.getX() < space.getOuterBoundariesX()) {
 			downLeftBack.setX(downLeftBack.getX() + 1);
 			upRightBack.setX(upRightBack.getX() + 1);
			upRightForth.setX(upRightForth.getX() + 1);
 			return getFormatedCoordinates();
 		} else if (((downLeftBack.getY() >= space.getOuterBoundariesY() - space.getInnerSpaceY() || upRightForth.getY() <= space.getInnerSpaceY()) || (upRightForth.getZ() >= space.getOuterBoundariesZ() - space.getInnerSpaceZ() || downLeftBack.getZ() <= space.getInnerSpaceZ())) && upRightForth.getX() < space.getOuterBoundariesX()){
 			downLeftBack.setX(downLeftBack.getX() + 1);
 			upRightBack.setX(upRightBack.getX() + 1);
 			upRightForth.setX(upRightForth.getX() + 1);
 			return getFormatedCoordinates();
 		} else {
 			return getFormatedCoordinates();
 		}	
 	}
 	
 public String moveForth(){
 		if (downLeftBack.getY() < space.getOuterBoundariesY() - space.getInnerSpaceY() && upRightForth.getY() > space.getInnerSpaceY() && downLeftBack.getX() < space.getOuterBoundariesX() - space.getInnerSpaceX() && upRightForth.getX() > space.getInnerSpaceX() && upRightForth.getZ() > space.getOuterBoundariesZ() - space.getInnerSpaceZ()){
 			downLeftBack.setZ(downLeftBack.getZ() - 1);
 			upRightBack.setZ(upRightBack.getZ() - 1);
 			upRightForth.setZ(upRightForth.getZ() - 1);
 			return getFormatedCoordinates();
 		} else if (upRightBack.getX() >= space.getOuterBoundariesX() - space.getInnerSpaceX() && downLeftBack.getX() <= space.getOuterBoundariesX() - space.getInnerSpaceX() && upRightBack.getY() <= space.getInnerSpaceY() && upRightForth.getZ() > 0){
			downLeftBack.setZ(downLeftBack.getZ() - 1);
 			upRightBack.setZ(upRightBack.getZ() - 1);
 			upRightForth.setZ(upRightForth.getZ() - 1);
 			return getFormatedCoordinates();
 		} else if (downLeftBack.getY() < space.getOuterBoundariesY() - space.getInnerSpaceY() && upRightForth.getY() > space.getInnerSpaceY() && downLeftBack.getX() < space.getOuterBoundariesX() - space.getInnerSpaceX() && upRightForth.getX() > space.getInnerSpaceX() && upRightForth.getZ() < space.getInnerSpaceZ() && upRightForth.getZ() > 0) {
 			downLeftBack.setZ(downLeftBack.getZ() - 1);
 			upRightBack.setZ(upRightBack.getZ() - 1);
 			upRightForth.setZ(upRightForth.getZ() - 1);
 			return getFormatedCoordinates();
 		} else if (((downLeftBack.getY() >= space.getOuterBoundariesY() - space.getInnerSpaceY() || upRightForth.getY() <= space.getInnerSpaceY()) || (upRightForth.getX() <= space.getInnerSpaceX() || downLeftBack.getX() >= space.getOuterBoundariesX() - space.getInnerSpaceX())) && upRightForth.getZ() > 0){
 			downLeftBack.setZ(downLeftBack.getZ() - 1);
 			upRightBack.setZ(upRightBack.getZ() - 1);
 			upRightForth.setZ(upRightForth.getZ() - 1);
 			return getFormatedCoordinates();
 		} else {
 			return getFormatedCoordinates();
 		}	
	}
	
public String moveBack(){
		if (downLeftBack.getY() < space.getOuterBoundariesY() - space.getInnerSpaceY() && upRightForth.getY() > space.getInnerSpaceY() && downLeftBack.getX() < space.getOuterBoundariesX() - space.getInnerSpaceX() && upRightForth.getX() > space.getInnerSpaceX() && downLeftBack.getZ() < space.getOuterBoundariesZ()){
			downLeftBack.setZ(downLeftBack.getZ() + 1);
			upRightBack.setZ(upRightBack.getZ() + 1);
 			upRightForth.setZ(upRightForth.getZ() + 1);
 			return getFormatedCoordinates();
 		} else if (upRightBack.getX() >= space.getOuterBoundariesX() - space.getInnerSpaceX() && downLeftBack.getX() <= space.getOuterBoundariesX() - space.getInnerSpaceX() && upRightBack.getY() <= space.getInnerSpaceY() && downLeftBack.getZ() < space.getOuterBoundariesZ()){
 			downLeftBack.setZ(downLeftBack.getZ() + 1);
 			upRightBack.setZ(upRightBack.getZ() + 1);
 			upRightForth.setZ(upRightForth.getZ() + 1);
 			return getFormatedCoordinates();
 		} else if (downLeftBack.getY() < space.getOuterBoundariesY() - space.getInnerSpaceY() && upRightForth.getY() > space.getInnerSpaceY() && downLeftBack.getX() < space.getOuterBoundariesX() - space.getInnerSpaceX() && upRightForth.getX() > space.getInnerSpaceX() && upRightForth.getZ() < space.getInnerSpaceZ() && downLeftBack.getZ() < space.getInnerSpaceZ()) {
 			downLeftBack.setZ(downLeftBack.getZ() + 1);
 			upRightBack.setZ(upRightBack.getZ() + 1);
 			upRightForth.setZ(upRightForth.getZ() + 1);
 			return getFormatedCoordinates();
		} else if (((downLeftBack.getY() >= space.getOuterBoundariesY() - space.getInnerSpaceY() || upRightForth.getY() <= space.getInnerSpaceY()) || (upRightForth.getX() <= space.getInnerSpaceX() || downLeftBack.getX() >= space.getOuterBoundariesX() - space.getInnerSpaceX())) && downLeftBack.getZ() < space.getOuterBoundariesZ()){
			downLeftBack.setZ(downLeftBack.getZ() + 1);
 			upRightBack.setZ(upRightBack.getZ() + 1);
			upRightForth.setZ(upRightForth.getZ() + 1);
			return getFormatedCoordinates();
		} else {
 			return getFormatedCoordinates();
 		}	
 	}
}

