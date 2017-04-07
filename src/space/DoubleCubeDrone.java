package space;

import javax.swing.text.Position;

import drone.DoubleCubeHelp;
import drone.Drone;

public class DoubleCubeDrone extends DoubleCubeHelp {
	 
	 int x;
	 int y;
	 int z;
	
	public static  DoubleCubeHelp tDoleDesno;
	public static DoubleCubeHelp tSrednjaDesno;
	public static DoubleCubeHelp tSrednjaLevo;
	public static  DoubleCubeHelp tGoreLevo;
	 
	public DoubleCubeDrone(){
		
	}
	public DoubleCubeDrone(int x, int y, int z){
		tDoleDesno.setX(x);
		tDoleDesno.setY(y);
		tDoleDesno.setZ(z);
		tSrednjaDesno.setX(x+1);
		tSrednjaDesno.setY(y+1);
		tSrednjaDesno.setZ(z);
		tSrednjaLevo.setX(x+1);
		tSrednjaLevo.setY(y+1);
		tSrednjaLevo.setZ(z+1);
		tGoreLevo.setX(x+2);
		tGoreLevo.setY(y+2);
		tGoreLevo.setZ(z+1);
	}
	
	
	

	@Override
	public String moveUp() {
		if(tDoleDesno.upBorderBool()==true && tSrednjaDesno.upBorderBool()==true
											&& tSrednjaLevo.upBorderBool()==true && tGoreLevo.upBorderBool()==true)
		{
			tDoleDesno.moveUp();
			tSrednjaDesno.moveUp();
			tSrednjaLevo.moveUp();
			tGoreLevo.moveUp();
		}else
			System.out.println("Cannot complete movement!");
	 return "Drone position(Position one:"+ tDoleDesno +" Position two:"+ tSrednjaDesno+" Position three:"+ tSrednjaLevo +" Position four:"+ tGoreLevo+")";
	}
	
	@Override
	public String moveDown() {
		if(tDoleDesno.downBorderBool()==true && tSrednjaDesno.downBorderBool()==true
				&& tSrednjaLevo.downBorderBool()==true && tGoreLevo.downBorderBool()==true)
		{
			tDoleDesno.moveDown();
			tSrednjaDesno.moveDown();
			tSrednjaLevo.moveDown();
			tGoreLevo.moveDown();
		}else
			System.out.println("Cannot complete movement!");
		return "Drone position(Position one:"+ tDoleDesno +" Position two:"+ tSrednjaDesno+" Position three:"+ tSrednjaLevo +" Position four:"+ tGoreLevo+")";

	}
	
	@Override
	public String moveLeft() {
		if(tDoleDesno.leftBorderBool()==true && tSrednjaDesno.leftBorderBool()==true
				&& tSrednjaLevo.leftBorderBool()==true && tGoreLevo.leftBorderBool()==true)
		{
			tDoleDesno.moveLeft();
			tSrednjaDesno.moveLeft();
			tSrednjaLevo.moveLeft();
			tGoreLevo.moveLeft();
		}else
			System.out.println("Cannot complete movement!");
		return "Drone position(Position one:"+ tDoleDesno +" Position two:"+ tSrednjaDesno+" Position three:"+ tSrednjaLevo +" Position four:"+ tGoreLevo+")";

	}
	
	@Override
	public String moveRight() {
		if(tDoleDesno.rightBorderBool()==true && tSrednjaDesno.rightBorderBool()==true
				&& tSrednjaLevo.rightBorderBool()==true && tGoreLevo.rightBorderBool()==true)
		{
			tDoleDesno.moveRight();
			tSrednjaDesno.moveRight();
			tSrednjaLevo.moveRight();
			tGoreLevo.moveRight();
		}else
			System.out.println("Cannot complete movement!");
		return "Drone position(Position one:"+ tDoleDesno +" Position two:"+ tSrednjaDesno+" Position three:"+ tSrednjaLevo +" Position four:"+ tGoreLevo+")";

	}
	
	@Override
	public String moveBack() {
		
		if(tDoleDesno.backBorderBool()==true && tSrednjaDesno.backBorderBool()==true
				&& tSrednjaLevo.backBorderBool()==true && tGoreLevo.backBorderBool()==true)
		{
			tDoleDesno.moveBack();
			tSrednjaDesno.moveBack();
			tSrednjaLevo.moveBack();
			tGoreLevo.moveBack();
		}else
			System.out.println("Cannot complete movement!");
		return "Drone position(Position one:"+ tDoleDesno +" Position two:"+ tSrednjaDesno+" Position three:"+ tSrednjaLevo +" Position four:"+ tGoreLevo+")";

	}
	
	@Override
	public String moveForth() {
		if(tDoleDesno.forthBorderBool()==true && tSrednjaDesno.forthBorderBool()==true
				&& tSrednjaLevo.forthBorderBool()==true && tGoreLevo.forthBorderBool()==true)
		{
			tDoleDesno.moveForth();
			tSrednjaDesno.moveForth();
			tSrednjaLevo.moveForth();
			tGoreLevo.moveForth();
		}else
			System.out.println("Cannot complete movement!");
		return "Drone position(Position one:"+ tDoleDesno +" Position two:"+ tSrednjaDesno+" Position three:"+ tSrednjaLevo +" Position four:"+ tGoreLevo+")";

	}
    
	
	
}
