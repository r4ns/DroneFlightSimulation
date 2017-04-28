package tests;

public class DroneException extends Exception{
	public DroneException(){
		
	}
	
	public String toString(){
		return "You can't move drone there!";
	}
}
