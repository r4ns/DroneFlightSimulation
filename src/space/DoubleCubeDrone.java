package space;

import javax.swing.text.Position;

import drone.Drone;

public class DoubleCubeDrone extends Drone {
	int x;
	int y;
	int z;
	
	public DoubleCubeDrone(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	int positionOne[] = {x,y,z};
	int positionTwo[] = {x+1,y+1,z+1};
	int positionThree[] = {x+1,y+1,z};
	int positionFour[] = {x+2,y+2,z+1};
	

	@Override
	public String moveUp() {
	 return "Drone position(Position one:"+ positionOne +" Position two:"+ positionTwo+" Position three:"+ positionThree +")";
	}
	
	@Override
	public String moveDown() {
		
		 return "Drone position(Position one:"+ positionOne +" Position two:"+ positionTwo+" Position three:"+ positionThree +")";

	}
	
	@Override
	public String moveLeft() {
		 return "Drone position(Position one:"+ positionOne +" Position two:"+ positionTwo+" Position three:"+ positionThree +")";

	}
	
	@Override
	public String moveRight() {
		 return "Drone position(Position one:"+ positionOne +" Position two:"+ positionTwo+" Position three:"+ positionThree +")";

	}
	
	@Override
	public String moveBack() {
		 return "Drone position(Position one:"+ positionOne +" Position two:"+ positionTwo+" Position three:"+ positionThree +")";

	}
	
	@Override
	public String moveForth() {
		 return "Drone position(Position one:"+ positionOne +" Position two:"+ positionTwo+" Position three:"+ positionThree +")";

	}
    
	
	@Override
	public void upBorder() {
		if((positionOne[0] >= 10 && positionOne[0]<= 40) && (positionOne[2] >= 10 && z<= positionOne[2])||
				(positionTwo[0] >= 10 && positionTwo[0]<= 40) && (positionTwo[2] >= 10 && z<= positionTwo[2])||
				(positionThree[0] >= 10 && positionThree[0]<= 40) && (positionThree[2] >= 10 && z<= positionThree[2])||
				(positionFour[0] >= 10 && positionFour[0]<= 40) && (positionFour[2] >= 10 && z<= positionFour[2])){
			if((positionOne[1] < 10 && positionOne[1] >= 0 || positionOne[1] >= 40 && positionOne[1] < 50)||
					(positionTwo[1] < 10 && positionTwo[1] >= 0 || positionTwo[1] >= 40 && positionTwo[1] < 50)||
					(positionThree[1] < 10 && positionThree[1] >= 0 || positionThree[1] >= 40 && positionThree[1] < 50)||
					(positionFour[1] < 10 && positionFour[1] >= 0 || positionFour[1] >= 40 && positionFour[1] < 50)){
				positionOne[1]++;
				positionTwo[1]++;
				positionThree[1]++;
				positionFour[1]++;
			}
		}else if((positionOne[1]<=50)||
				(positionTwo[1]<=50)||
				(positionThree[1]<=50)||
				(positionFour[1]<=50)){
			positionOne[1]++;
			positionTwo[1]++;
			positionThree[1]++;
			positionFour[1]++;
		}
	}
	
	@Override
	public void downBorder() {
		if((positionOne[0] >= 10 && positionOne[0]<= 40) && (positionOne[2] >= 10 && positionOne[2]<= 40)||
				(positionTwo[0] >= 10 && positionTwo[0]<= 40) && (positionTwo[2] >= 10 && positionTwo[2]<= 40)||
				(positionThree[0] >= 10 && positionThree[0]<= 40) && (positionThree[2] >= 10 && positionThree[2]<= 40)||
				(positionFour[0] >= 10 && positionFour[0]<= 40) && (positionFour[2] >= 10 && positionFour[2]<= 40)){
			if((positionOne[1] < 10 && positionOne[1] > 0 || positionOne[1] >= 40 && positionOne[1] < 50)||
					(positionTwo[1] < 10 && positionTwo[1] > 0 || positionTwo[1] >= 40 && positionTwo[1] < 50)||
					(positionThree[1] < 10 && positionThree[1] > 0 || positionThree[1] >= 40 && positionThree[1] < 50)||
					(positionFour[1] < 10 && positionFour[1] > 0 || positionFour[1] >= 40 && positionFour[1] < 50)){
				positionOne[1]--;
				positionTwo[1]--;
				positionThree[1]--;
				positionFour[1]--;
			}
		}else if((positionOne[1]>0)||
				(positionTwo[1]>0)||
				(positionThree[1]>0)||
				(positionFour[1]>0)){
			positionOne[1]--;
			positionTwo[1]--;
			positionThree[1]--;
			positionFour[1]--;
		}
	}
	
	@Override
	public void leftBorder() {
		if((positionOne[1]>10 && (positionOne[1]<40)||
				(positionTwo[1]>10 && (positionTwo[1]<40)||
						(positionThree[1]>10 && (positionThree[1]<40)||
								(positionFour[1]>10 && (positionFour[1]<40)){
			if(z>10 && z<40){
				if((x<=10 && x>0) || (x<=50 && x>40)){
					x--;
				}
			}
			else if(x>0){
				x--;
			}
		}
	}

	public int[] getPositionOne() {
		return positionOne;
	}


	public void setPositionOne(int[] positionOne) {
		this.positionOne = positionOne;
	}


	public int[] getPositionTwo() {
		return positionTwo;
	}


	public void setPositionTwo(int[] positionTwo) {
		this.positionTwo = positionTwo;
	}


	public int[] getPositionThree() {
		return positionThree;
	}


	public void setPositionThree(int[] positionThree) {
		this.positionThree = positionThree;
	}


	public int[] getPositionFour() {
		return positionFour;
	}


	public void setPositionFour(int[] positionFour) {
		this.positionFour = positionFour;
	}
	
}
