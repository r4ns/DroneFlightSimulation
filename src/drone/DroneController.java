package drone;

import drone.dron;

public class DroneController {

	public static void main(String[] args) {		
		dron dr1 = new dron();
		System.out.println("Dole");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.Dole());
		}
		System.out.println("Levo");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.Levo());
		}
		System.out.println("Gore");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.Gore());
		}
		System.out.println("Desno");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.Desno());
		}
		System.out.println("Nazad");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.Nazad());
		}
		System.out.println("Levo");
		for(int i = 0; i < 50; i++)
		{
			System.out.println(dr1.Levo());
		}
		
	}
}
