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
	private int [] boundaries={50,50,50};
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
			
			
			
		//kad udara u granicu male kocke
	@Test
	public void testMoveUpHitBottomInnerSquareBorder(){
		
		startCoordinates[1]=10;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(10) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
	}
	//kad udara u gornju granicu velike kocke
	@Test
	public void testMoveUpHitTopOuter(){
		
		startCoordinates[1]=50;
		drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(50) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveUp());
		
	}
	
	//kad ide normalno dole za 1
	
	@Test
	public void testInitialMoveDown(){
		startCoordinates[1]=50;
		drone = new Drone(boundaries, startCoordinates);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]-1) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	//kad probija donju garanicu
	@Test
	
	public void testMoveDownBreakBottomBorderOuterSquare(){
		
		drone = new Drone(boundaries, startCoordinates);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	
	@Test
	public void testMoveDownHitTopInner(){
		startCoordinates[1]=40;
		drone = new Drone(boundaries, startCoordinates);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(40) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	@Test
	public void testInitialMoveLeft(){
		
		drone = new Drone(boundaries, startCoordinates);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]-1) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	//da razbija desnu ivicu male kocke
	@Test
	public void testMoveLeftHitRightSideInnerSquare(){
		
		startCoordinates[0]=40;
		startCoordinates[1]=30;
		drone = new Drone(boundaries, startCoordinates);
		String expectedCoordinates= "Dron position:(" + Integer.toString(40) + "," + Integer.toString(30) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveLeft());
		
	}
	
	//da udara u levu stranu velike kocke
		@Test
		public void testMoveLeftHitLeftSideOutterSquare(){
			
			startCoordinates[0]=0;
			
			drone = new Drone(boundaries, startCoordinates);
			String expectedCoordinates= "Dron position:(" + Integer.toString(0) + "," + Integer.toString(startCoordinates[1]) +
					"," + Integer.toString(startCoordinates[2])+")";
			assertEquals(expectedCoordinates, drone.moveLeft());
			
		}
		
				@Test
		public void testInitialMoveRight(){
					
			drone = new Drone(boundaries, startCoordinates);
			String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]+1) + "," + Integer.toString(startCoordinates[1]) +
							"," + Integer.toString(startCoordinates[2])+")";
		    assertEquals(expectedCoordinates, drone.moveRight());
					
				}
	
				//da razbija desnu ivicu velike kocke
				@Test
				public void testMoveRightHitRightSideOterSquare(){
					
					startCoordinates[0]=50;
					
					drone = new Drone(boundaries, startCoordinates);
					String expectedCoordinates= "Dron position:(" + Integer.toString(50) + "," + Integer.toString(startCoordinates[1]) +
							"," + Integer.toString(startCoordinates[2])+")";
					assertEquals(expectedCoordinates, drone.moveRight());
					
				}
				//da razbija desnu ivicu male kocke
				@Test
				public void testMoveRightBreakLeftSideInnerSquer(){
					
					startCoordinates[0]=10;
					startCoordinates[1]=30;
					drone = new Drone(boundaries, startCoordinates);
					String expectedCoordinates= "Dron position:(" + Integer.toString(10) + "," + Integer.toString(30) +
							"," + Integer.toString(startCoordinates[2])+")";
					assertEquals(expectedCoordinates, drone.moveRight());
					
				}
				
				@Test
				public void testInitialMoveBack(){
							
					drone = new Drone(boundaries, startCoordinates);
					String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
									"," + Integer.toString(startCoordinates[2]-1)+")";
				    assertEquals(expectedCoordinates, drone.moveBack());
							
						}
				@Test
				public void testMoveBackHitBackOuterrSquare(){
					
					startCoordinates[1]=30;
					startCoordinates[2]=0;
					drone = new Drone(boundaries, startCoordinates);
					String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
									"," + Integer.toString(startCoordinates[2])+")";
				    assertEquals(expectedCoordinates, drone.moveBack());
							
						}
				@Test
				public void testMoveBackHitFrontSideInnerSquare(){
					
					startCoordinates[1]=30;
					startCoordinates[2]=40;
					
					drone = new Drone(boundaries, startCoordinates);
					String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
									"," + Integer.toString(startCoordinates[2])+")";
				    assertEquals(expectedCoordinates, drone.moveBack());
							
						}
				@Test
				public void testInitialMoveForth(){
							
					drone = new Drone(boundaries, startCoordinates);
					String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
									"," + Integer.toString(startCoordinates[2]+1)+")";
				    assertEquals(expectedCoordinates, drone.moveForth());
							
						}
				@Test
				public void testMoveForthHitFrontSidekOuterrSquare(){
					
					startCoordinates[1]=30;
					startCoordinates[2]=50;
					drone = new Drone(boundaries, startCoordinates);
					String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
									"," + Integer.toString(startCoordinates[2])+")";
				    assertEquals(expectedCoordinates, drone.moveForth());
							
						}
				@Test
				public void testMoveForthHitBackSideInnerSquare(){
					
					startCoordinates[1]=30;
					startCoordinates[2]=10;
					
					drone = new Drone(boundaries, startCoordinates);
					String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
									"," + Integer.toString(startCoordinates[2])+")";
				    assertEquals(expectedCoordinates, drone.moveForth());
							
						}
			
				
}
