package tests;

import static org.junit.Assert.*;

import javax.swing.plaf.synth.SynthStyle;

import org.junit.Test;
import org.junit.Assert.*;

import drone.*;

public class DroneAdvancedTest {

	private int [] startsCoordinates={0,30,30};	
	private String [] smer={"moveUp",  "moveRight", "moveUp", "moveForth", "moveLeft", "moveForth","moveLeft", "moveUp", "moveBack", "moveLeft", "moveDown"};
	private String [] brojPomeranja={"12", "21", "23", "16", "12", "5", "18", "17", "21", "22", "20"}; 
	
	private String rezultat=null;
	
	Drone dron;
	//
	
	@Test
	public void ExpectedPath(){
	dron= new Drone();
	String expectedCoordinates= "Drone position: (" +Integer.toString(startsCoordinates[0])+","+Integer.toString(startsCoordinates[1])+ ","+Integer.toString(startsCoordinates[2])+")";
	assertEquals(helperTestMovingDrone(smer, brojPomeranja),expectedCoordinates);
	}

	public String helperTestMovingDrone( String [] smerKretanja, String [] Pomeranje ){
		dron = new Drone();
			int i=0;
			while(i<smerKretanja.length){
				int pomeri=Integer.parseInt(Pomeranje[i]);
				
				if(smerKretanja[i] == "moveUp"){
					for(int j=0; j<pomeri;j++){
						rezultat=dron.moveUp();
					}
				}
				else if(smerKretanja[i] == "moveDown"){
					for(int j=0; j<pomeri;j++){
						rezultat=dron.moveDown();
					}
				}
				else if(smerKretanja[i] == "moveLeft"){
					for(int j=0; j<pomeri;j++){
						rezultat=dron.moveLeft();
					}
				}
				else if(smerKretanja[i] == "moveRight"){
					for(int j=0; j<pomeri;j++){
						rezultat=dron.moveRight();
					}
				}
				else if(smerKretanja[i] == "moveForth"){
					for(int j=0; j<pomeri;j++){
						rezultat=dron.moveForth();
					}
				}
				else if(smerKretanja[i] == "moveBack"){
					for(int j=0; j<pomeri;j++){
						rezultat=dron.moveBack();
					}
				}
				i++;
			}	
			return dron.getFormatedCoordinates();
		}
}
