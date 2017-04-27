package space;

import drone.StandardDrone;

public class DoubleCubeDrone implements StandardDrone 
{
	private Cube cube1;
	private Cube cube2;
	
	private int[] startPoint;
	private FlySpace flySpace;
	
	public DoubleCubeDrone(Cube cube1, Cube cube2, int[] startPoint,FlySpace flySpace) {
		this.cube1 = cube1;
		this.cube2 = cube2;
		this.startPoint = startPoint;
		
		this.cube1.increaseX(startPoint[0]);
		this.cube1.increaseY(startPoint[1]);
		this.cube1.increaseZ(startPoint[2]);
		
		this.cube2.increaseX(startPoint[0]);
		this.cube2.increaseY(startPoint[1]);
		this.cube2.increaseZ(startPoint[2]);
		
		this.flySpace = flySpace;
	}

	protected boolean validateLimits(String command) 
	{
		switch(command)
		{
		case "up":
			if (cube1.getMaxCoordinates()[1] == flySpace.getMaxCoordinates()[1])
			{
				return false;
			}
			if (cube2.getMaxCoordinates()[1] == flySpace.getMaxCoordinates()[1])
			{
				return false;
			}
			break;
		
		case "down": 
			if (cube1.getMinCoordinates()[1] == flySpace.getMinCoordinates()[1])
			{
				return false;
			}
			if (cube2.getMinCoordinates()[1] == flySpace.getMinCoordinates()[1])
			{
				return false;
			}
			break;
		
		case "left": 
			if (cube1.getMinCoordinates()[0] == flySpace.getMinCoordinates()[0])
			{
				return false;
			}
			if (cube2.getMinCoordinates()[0] == flySpace.getMinCoordinates()[0])
			{
				return false;
			}
			break;
		
		case "right": 
		
			if (cube1.getMaxCoordinates()[0] == flySpace.getMaxCoordinates()[0])
			{
				return false;
			}
			if (cube2.getMaxCoordinates()[0] == flySpace.getMaxCoordinates()[0])
			{
				return false;
			}
			break;
		
		case "back":
			if (cube1.getMaxCoordinates()[2] == flySpace.getMaxCoordinates()[2])
			{
				return false;
			}
			if (cube2.getMaxCoordinates()[2] == flySpace.getMaxCoordinates()[2])
			{
				return false;
			}
			break;
		
		case "forth":
			if (cube1.getMinCoordinates()[2] == flySpace.getMinCoordinates()[2])
			{
				return false;
			}
			if (cube2.getMinCoordinates()[2] == flySpace.getMinCoordinates()[2])
			{
				return false;
			}
			break;
		}
		return true;
	}
	
	protected boolean validateObsticles(String command) 
	{
		Cube newPosition1 = new Cube(cube1);
		Cube newPosition2 = new Cube(cube2);
	
		switch(command)
		{
		case "up":
			newPosition1.increaseY(1);
			newPosition2.increaseY(1);
			break;
		
		case "down":
			newPosition1.decreaseY(1);
			newPosition2.decreaseY(1);
			break;
		
		case "left": 
			newPosition1.decreaseX(1);
			newPosition2.decreaseX(1);
			break;
		
		case "right": 
			newPosition1.increaseX(1);
			newPosition2.increaseX(1);
			break;
		
		case "back":
			newPosition1.increaseZ(1);
			newPosition2.increaseZ(1);
			break;
		
		case "forth":
			newPosition1.decreaseZ(1);
			newPosition2.decreaseZ(1);
			break;
		}
		
		for(Cube c: flySpace.obstacles)
		{
			if (newPosition1.checkCubeIntersection(c) || newPosition2.checkCubeIntersection(c))
				return false;
		}
		
		return true; 
	}
	
	protected boolean validateDronePositionAfter(String command) 
	{
		boolean limits = validateLimits(command);
		boolean obsticles = validateObsticles(command);
		
		return limits && obsticles;
	}
	
	@Override
	public String moveUp() {
		if (validateDronePositionAfter("up")) 
		{
			cube1.increaseY(1);
			cube2.increaseY(1);
		}
		return null;
	}

	@Override
	public String moveDown()
	{
		if (validateDronePositionAfter("down")) 
		{
			cube1.decreaseY(1);
			cube2.decreaseY(1);
		}
		return null;
	}

	@Override
	public String moveLeft() 
	{
		if (validateDronePositionAfter("left")) 
		{
			cube1.decreaseX(1);
			cube2.decreaseX(1);
		}
		return null;
	}

	@Override
	public String moveRight() 
	{
		if (validateDronePositionAfter("right")) 
		{
			cube1.increaseX(1);
			cube2.increaseX(1);
		}
		return null;
	}

	@Override
	public String moveBack() 
	{
		if (validateDronePositionAfter("back")) 
		{
			cube1.increaseX(1);
			cube2.increaseX(1);
		}
		return null;
	}

	@Override
	public String moveForth() 
	{
		if (validateDronePositionAfter("forth")) 
		{
			cube1.decreaseX(1);
			cube2.decreaseX(1);
		}
		return null;
	}

	@Override
	public String getFormatedCoordinates() 
	{	
		return null;
	}
}
