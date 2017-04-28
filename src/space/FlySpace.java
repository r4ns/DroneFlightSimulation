package space;

import java.util.ArrayList;
import java.util.Random;

public class FlySpace {
	
	Cube innerCube, outerCube;
	int spaceBetween;
	
	ArrayList<Cube> obstacles; 
	public FlySpace(int outerBorder, int innerBorder){
		this.spaceBetween = (outerBorder - innerBorder)/2;
		 outerCube = new Cube(new int[]{0,0,0}, outerBorder);
		 innerCube = new Cube(new int[]{spaceBetween, spaceBetween, spaceBetween}, innerBorder);
		obstacles = new ArrayList<Cube>();
	}
	
	public FlySpace(int outerBorder, int innerBorder, int obstacles){
		this(outerBorder, innerBorder);
		for (int i = 0; i < obstacles; i++){
			//Dobijam random x od 0 do sirine spoljasnje kocke
			int x = new Random().nextInt(outerBorder);
			int y = new Random().nextInt(outerBorder);
			int z = 0;
			if (x >= spaceBetween && x <= outerBorder - spaceBetween){
				
				if (y <= outerBorder - spaceBetween && y >= spaceBetween){
					int side = new Random().nextInt(2);
					if (side == 0){
						z = new Random().nextInt(spaceBetween);
					}
					else{
						z = new Random().nextInt(spaceBetween);
						z += spaceBetween + innerBorder;
					}
						
				}
			}
			else {
				z = new Random().nextInt(outerBorder);
			}
			this.obstacles.add(new Cube(new int[]{x, y, z}, 1));
		}
		for (Cube c : this.obstacles)
			System.out.println(c);
	}

	public Cube getInnerCube() {
		return innerCube;
	}

	public void setInnerCube(Cube innerCube) {
		this.innerCube = innerCube;
	}

	public Cube getOuterCube() {
		return outerCube;
	}

	public void setOuterCube(Cube outerCube) {
		this.outerCube = outerCube;
	}

	public int getSpaceBetween() {
		return spaceBetween;
	}

	public void setSpaceBetween(int spaceBetween) {
		this.spaceBetween = spaceBetween;
	}

	public ArrayList<Cube> getObstacles() {
		return obstacles;
	}

	public void setObstacles(ArrayList<Cube> obstacles) {
		this.obstacles = obstacles;
	}
	

	
	
}
