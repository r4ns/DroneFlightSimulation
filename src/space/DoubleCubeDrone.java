package space;

import java.util.ArrayList;

import drone.StandardDrone;

public class DoubleCubeDrone implements StandardDrone{
	Cube bottomCube, topCube;
	FlySpace boundaries;
	
	
	public DoubleCubeDrone(){
		this(new int[]{0,0,0});
	}
	
	public DoubleCubeDrone(int[] startCoordinates){
		
		this(startCoordinates, 1);
		
	}
	
	public DoubleCubeDrone(int[] startCoordinates, int sideLength){
	
		this(startCoordinates, sideLength,new FlySpace(50,40));
		
		
	}
	
	public DoubleCubeDrone(int[] startCoordinates, int sideLength, FlySpace boundaries){
		
		this(new Cube(startCoordinates, sideLength), new Cube(new int[]{startCoordinates[0] + sideLength,startCoordinates[1] + sideLength, startCoordinates[2] + sideLength}, sideLength), boundaries);
	}
	
	public DoubleCubeDrone(Cube bottomCube, Cube topCube, FlySpace boundaries){
		this.bottomCube = bottomCube;
		this.topCube = topCube;
		this.boundaries = boundaries;
	}
	

	public String moveUp(){
		boolean canMoveUp = validateDronePositionAfter("moveUp");
		if (canMoveUp){
			bottomCube.increaseY(1);
			topCube.increaseY(1);
			return "Drone moved up to " + bottomCube.getMinCoordinates()[1] + " height.";
		}
		return "Drone can't perform this move.";

	}
	public String moveDown(){
		boolean canMoveDown = validateDronePositionAfter("moveDown");
		if (canMoveDown){
			bottomCube.decreaseY(1);
			topCube.decreaseY(1);
			return "Drone moved down to " + bottomCube.getMinCoordinates()[1] + " height.";
		}
		return "Drone can't perform this move.";
	}
	
	public String moveLeft(){
		boolean canMoveLeft = validateDronePositionAfter("moveLeft");
		if (canMoveLeft){
			bottomCube.decreaseX(1);
			topCube.decreaseX(1);
			return "Drone moved left to " + bottomCube.getMinCoordinates()[0] + " x coordinate.";
		}
		return "Drone can't perform this move.";
	}

	@Override
	public String moveRight() {
		boolean canMoveRight= validateDronePositionAfter("moveRight");
		if (canMoveRight){
			bottomCube.increaseX(1);
			topCube.increaseX(1);
			return "Drone moved right to " + bottomCube.getMinCoordinates()[0] + " x coordinate.";
		}
		return "Drone can't perform this move.";
	}

	@Override
	public String moveBack() {
		boolean canMoveBack= validateDronePositionAfter("moveBack");
		if (canMoveBack){
			bottomCube.increaseZ(1);
			topCube.increaseZ(1);
			return "Drone moved back to " + bottomCube.getMinCoordinates()[2] + " z coordinate.";
		}
		return "Drone can't perform this move.";
	}

	@Override
	public String moveForth() {
		boolean canMoveForth= validateDronePositionAfter("moveForth");
		if (canMoveForth){
			bottomCube.decreaseZ(1);
			topCube.decreaseZ(1);
			return "Drone moved forth to " + bottomCube.getMinCoordinates()[2] + " z coordinate.";
		}
		return "Drone can't perform this move.";
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected boolean validateDronePositionAfter(String command){
		boolean isValid = true;
		ArrayList<Cube> cubesToCheck = new ArrayList<Cube>();
		cubesToCheck.add(new Cube(bottomCube));
		cubesToCheck.add(new Cube(topCube));
		switch(command){
			case "moveUp" : {
					
					for(Cube c : cubesToCheck){
						c.increaseY(1);
					}

					for (Cube c : cubesToCheck){
						if(c.getMaxCoordinates()[1] > this.boundaries.outerCube.getMaxCoordinates()[1])
							isValid = false;
						if(c.getMaxCoordinates()[1] > this.boundaries.innerCube.getMinCoordinates()[1] && c.getMaxCoordinates()[1] < boundaries.spaceBetween){
							if(c.getMaxCoordinates()[0] > this.boundaries.spaceBetween && c.getMaxCoordinates()[0]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
								//X koordinata uzima jednu od koordinata koja odgovara unutrasnjoj kocki
								if(c.getMaxCoordinates()[2] > this.boundaries.spaceBetween && c.getMaxCoordinates()[2]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
									//Z koordinata uzma jednu od koordinata koja odgovara unutrasnjoj kocki i dron se nalazi ispod donje strane unutrasnje kocke
									isValid = false;
								}
								
							}
						
						}
					}
				break;
				}
			case "moveDown" : {
					for(Cube c : cubesToCheck){
						c.decreaseY(1);
					}
					
					for (Cube c : cubesToCheck){
						if (c.getMinCoordinates()[1] < boundaries.outerCube.getMinCoordinates()[1]){
							isValid = false;
						}
						if (c.getMinCoordinates()[1] < boundaries.innerCube.getMaxCoordinates()[1] && c.getMinCoordinates()[1] > boundaries.spaceBetween){
							System.out.println(c);
							System.out.println(boundaries.innerCube);
							if(c.getMaxCoordinates()[0] > this.boundaries.spaceBetween && c.getMaxCoordinates()[0]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
								//X koordinata uzima jednu od koordinata koja odgovara unutrasnjoj kocki
								if(c.getMaxCoordinates()[2] > this.boundaries.spaceBetween && c.getMaxCoordinates()[2]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
									//Z koordinata uzma jednu od koordinata koja odgovara unutrasnjoj kocki i dron se nalazi iznad donje strane unutrasnje kocke
									isValid = false;
								}
								
							}
						}
					}
					break;
				}
			case "moveLeft" : { 
					for(Cube c : cubesToCheck){
						c.decreaseX(1);
						
					}
					
					for (Cube c : cubesToCheck){
						if (c.getMinCoordinates()[0] < boundaries.outerCube.getMinCoordinates()[0]){
							isValid = false;
							break;
						}
						
						if (c.getMinCoordinates()[0] < boundaries.innerCube.getMaxCoordinates()[0] && c.getMinCoordinates()[0] > boundaries.spaceBetween){
							//Uzima x koordinatu koja se nalazi unutar unutrasnje kocke
							if(c.getMaxCoordinates()[1] > this.boundaries.spaceBetween && c.getMaxCoordinates()[1]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
								//Y koordinata uzima jednu od koordinata koja odgovara unutrasnjoj kocki
								if(c.getMaxCoordinates()[2] > this.boundaries.spaceBetween && c.getMaxCoordinates()[2]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
									//Z koordinata uzma jednu od koordinata koja odgovara unutrasnjoj kocki i dron se nalazi na levoj strani unutrasnje kocke
									isValid = false;
									break;
								}
								
							}
						}
					}
					break;
				}
			case "moveRight" : { 
					for(Cube c : cubesToCheck){
						c.increaseX(1);
					}
					for (Cube c : cubesToCheck){
						if (c.getMaxCoordinates()[0] > boundaries.outerCube.getMaxCoordinates()[0]){
							isValid = false;
						}
						
						if (c.getMaxCoordinates()[0] > boundaries.innerCube.getMinCoordinates()[0] && c.getMaxCoordinates()[0] < boundaries.innerCube.getMaxCoordinates()[0]){
							//Uzima x koordinatu koja se nalazi unutar unutrasnje kocke
							if(c.getMaxCoordinates()[1] > this.boundaries.spaceBetween && c.getMaxCoordinates()[1]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
								//Y koordinata uzima jednu od koordinata koja odgovara unutrasnjoj kocki
								if(c.getMaxCoordinates()[2] > this.boundaries.spaceBetween && c.getMaxCoordinates()[2]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
									//Z koordinata uzma jednu od koordinata koja odgovara unutrasnjoj kocki i dron se nalazi na levoj strani unutrasnje kocke
									isValid = false;
								}
								
							}
						}
					}
					
					break;
				}
			case "moveForth" : {
					for(Cube c : cubesToCheck){
						c.decreaseZ(1);
					}
	
					for (Cube c : cubesToCheck){
						if(c.getMinCoordinates()[2] < this.boundaries.outerCube.getMinCoordinates()[2]){
							isValid = false;
							break;
						}
						if(c.getMinCoordinates()[2] < this.boundaries.innerCube.getMaxCoordinates()[2] && c.getMinCoordinates()[2] > this.boundaries.spaceBetween){
							System.out.println(c.getMinCoordinates()[2] + " < " + boundaries.innerCube.getMaxCoordinates()[2]);
							if(c.getMaxCoordinates()[0] > this.boundaries.spaceBetween && c.getMaxCoordinates()[0]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
								//X koordinata uzima jednu od koordinata koja odgovara unutrasnjoj kocki
								if(c.getMaxCoordinates()[1] > this.boundaries.spaceBetween && c.getMaxCoordinates()[1]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
									//Y koordinata uzma jednu od koordinata koja odgovara unutrasnjoj kocki i dron se nalazi na prednjoj strani unutrasnje kocke
									isValid = false; 
									break;
								}
								
							}
						
						}
					}
					break;
				}
			case "moveBack" : {
					for(Cube c : cubesToCheck){
						c.increaseZ(1);
					}
					
					for (Cube c : cubesToCheck){
						if(c.getMaxCoordinates()[2] > this.boundaries.outerCube.getMaxCoordinates()[2]){
							isValid = false;
							break;
						}
						if(c.getMaxCoordinates()[2] > this.boundaries.innerCube.getMinCoordinates()[2] && c.getMaxCoordinates()[2] < boundaries.innerCube.getMaxCoordinates()[2]){
							System.out.println(c.getMinCoordinates()[2] + " < " + boundaries.innerCube.getMaxCoordinates()[2]);
							if(c.getMaxCoordinates()[0] > this.boundaries.spaceBetween && c.getMaxCoordinates()[0]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
								//X koordinata uzima jednu od koordinata koja odgovara unutrasnjoj kocki
								if(c.getMaxCoordinates()[1] > this.boundaries.spaceBetween && c.getMaxCoordinates()[1]  < boundaries.spaceBetween + boundaries.innerCube.getCubeSideLength() + c.getCubeSideLength()){
									//Y koordinata uzma jednu od koordinata koja odgovara unutrasnjoj kocki i dron se nalazi na prednjoj strani unutrasnje kocke
									isValid = false; 
									break;
								}
								
							}
						
						}
					}
					
					break;
				}
			default : System.out.println("Invalid command"); break;
		}
		
		
		return isValid;
	}
	
}
