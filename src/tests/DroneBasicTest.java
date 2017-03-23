package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;
public class DroneBasicTest {
	
	//fiksatori su nam granice i pocetna i krajnja tacka
	//svuda nam treba objekat dron
	//1.uvek se prvo implementira objekat
	//2.definise se vrednost koja se ocekuje
	//3.kuca se neka asertacija - assert funkcionise kao eauqls, ==  poredi samo da li prom pokazuju na isti objekat, 
	//a equals uzme i poredi ceo objekat
	//sto jednostavnija logika, be if while for, sto jednostavnije
	//ako zatreba if koristimo helper metodu, nju jednostavno napisemo, i pozovemo je u tesu
	Drone drone;
	private int [] boundaries={50,50};
	private int [] startCoordinates = {30,0,30};
	
	//sa ovim @test kazemo da ce to biti metoda koja ce testirati nesto
	//jedna metoda moze da imas vise test case-ova
	
	@Test
	public void testInitialMoveUp()
		{
			drone = new Drone(boundaries, startCoordinates);
			String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]+1) +
					"," + Integer.toString(startCoordinates[2])+")";
			assertEquals(expectedCoordinates, drone.moveUp());
			
			
			
		}
	@Test
	public void testInitialMoveUpHitBottomInnerSquareBorder(){
		
		startCoordinates[1]=10;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(10) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
	}
}
