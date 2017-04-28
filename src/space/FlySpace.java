package space;

import java.util.ArrayList;

public class FlySpace {
	private Cube outsideCube;
	private Cube insideCube;
	private ArrayList<Cube> listOfObstacles = new ArrayList<Cube>();
	private int[] boundaries = new int[3];
	private int[] defaultCoordinates= {0,0,0}, defalutBoundaries={50,50,50}, startCoordinates;
	private int space=10;
	
	public FlySpace(){


	}
	
	public FlySpace(int [] startCoordinates,int [] boundaries){
		this.startCoordinates=startCoordinates;
		this.boundaries=boundaries;
	}
	
	public FlySpace(Cube outsideCube, Cube insideCube){
		this.outsideCube=outsideCube;
		this.insideCube=insideCube;
	}
	
	public FlySpace(Cube outsideCube, Cube insideCube, ArrayList<Cube> listOfObstacles){
		this(outsideCube,insideCube);
		this.listOfObstacles=listOfObstacles;
	}

	public Cube getOutsideCube() {
		return outsideCube;
	}

	public void setOutsideCube(Cube outsideCube) {
		this.outsideCube = outsideCube;
	}

	public Cube getInsideCube() {
		return insideCube;
	}

	public void setInsideCube(Cube insideCube) {
		this.insideCube = insideCube;
	}

	public ArrayList<Cube> getListOfObstacles() {
		return listOfObstacles;
	}

	public void setListOfObstacles(ArrayList<Cube> listOfObstacles) {
		this.listOfObstacles = listOfObstacles;
	}

	public int[] getBoundaries() {
		return boundaries;
	}

	public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}

	public int[] getDefaultCoordinates() {
		return defaultCoordinates;
	}

	public void setDefaultCoordinates(int[] defaultCoordinates) {
		this.defaultCoordinates = defaultCoordinates;
	}

	public int[] getDefalutBoundaries() {
		return defalutBoundaries;
	}

	public void setDefalutBoundaries(int[] defalutBoundaries) {
		this.defalutBoundaries = defalutBoundaries;
	}

	public int[] getStartCoordinates() {
		return startCoordinates;
	}

	public void setStartCoordinates(int[] startCoordinates) {
		this.startCoordinates = startCoordinates;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}
	
}
