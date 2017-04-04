package drone;

import java.util.ArrayList;

import space.FlySpace;

public class DoubleCubeDrone implements StandardDrone {
	
	Drone najbliziKoordinatnomPocetku;
	/*Drone KvadratPrveKocke2;
	Drone KvadratPrveKocke3;
	Drone KvadratPrveKocke4;
	Drone KvadratDrugeKocke1;
	Drone KvadratDrugeKocke2;
	Drone KvadratDrugeKocke3;
	Drone KvadratDrugeKocke4;*/
	
	FlySpace space = new FlySpace(10, 40, 0, 50);
	private ArrayList<Drone> doubleCube = new ArrayList<Drone>();
	
	
	public DoubleCubeDrone(Drone najbliziKoordinatnomPocetku){
		//donji kvadrat donje kocke
		doubleCube.add(najbliziKoordinatnomPocetku);
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x, najbliziKoordinatnomPocetku.y, najbliziKoordinatnomPocetku.z + 1));
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x + 1, najbliziKoordinatnomPocetku.y, najbliziKoordinatnomPocetku.z));
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x + 1, najbliziKoordinatnomPocetku.y, najbliziKoordinatnomPocetku.z + 1));
		
		
		//gornji kvadrat donje kocke
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x, najbliziKoordinatnomPocetku.y + 1, najbliziKoordinatnomPocetku.z));
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x, najbliziKoordinatnomPocetku.y + 1, najbliziKoordinatnomPocetku.z + 1));
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x + 1, najbliziKoordinatnomPocetku.y + 1, najbliziKoordinatnomPocetku.z));
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x + 1, najbliziKoordinatnomPocetku.y + 1, najbliziKoordinatnomPocetku.z + 1));
		
		
		//donji kvadrat gornje kocke, samo desna ivica
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x + 2, najbliziKoordinatnomPocetku.y + 1, najbliziKoordinatnomPocetku.z));
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x + 2, najbliziKoordinatnomPocetku.y + 1, najbliziKoordinatnomPocetku.z + 1));
		
		//gornji kvadrat gornje kocke
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x + 1, najbliziKoordinatnomPocetku.y + 2, najbliziKoordinatnomPocetku.z));
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x + 1, najbliziKoordinatnomPocetku.y + 2, najbliziKoordinatnomPocetku.z + 1));
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x + 2, najbliziKoordinatnomPocetku.y + 2, najbliziKoordinatnomPocetku.z));
		doubleCube.add(new Drone(najbliziKoordinatnomPocetku.x + 2, najbliziKoordinatnomPocetku.y + 2, najbliziKoordinatnomPocetku.z + 1));
		
	}

	@Override
	public String moveUp() {
		boolean provera = false;
		for (Drone drone : doubleCube) {
			provera = drone.space.kretanjeGore(drone.x, drone.y, drone.z);
			if (provera == false) {
				break;
			}
		}
		if (provera) {
			for (Drone drone : doubleCube) {
				drone.y++;
			}
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		boolean provera = false;
		for (Drone drone : doubleCube) {
			provera = drone.space.kretanjeDole(drone.x, drone.y, drone.z);
			if (provera == false) {
				break;
			}
		}
		if (provera) {
			for (Drone drone : doubleCube) {
				drone.y--;
			}
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		boolean provera = false;
		for (Drone drone : doubleCube) {
			provera = drone.space.kretanjeDole(drone.y, drone.x, drone.z);
			if (provera == false) {
				break;
			}
		}
		if (provera) {
			for (Drone drone : doubleCube) {
				drone.x--;
			}
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		boolean provera = false;
		for (Drone drone : doubleCube) {
			provera = drone.space.kretanjeGore(drone.y, drone.x, drone.z);
			if (provera == false) {
				break;
			}
		}
		if (provera) {
			for (Drone drone : doubleCube) {
				drone.x++;
			}
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		boolean provera = false;
		for (Drone drone : doubleCube) {
			provera = drone.space.kretanjeGore(drone.y, drone.z, drone.x);
			if (provera == false) {
				break;
			}
		}
		if (provera) {
			for (Drone drone : doubleCube) {
				drone.z++;
			}
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		boolean provera = false;
		for (Drone drone : doubleCube) {
			provera = drone.space.kretanjeDole(drone.x, drone.z, drone.y);
			if (provera == false) {
				break;
			}
		}
		if (provera) {
			for (Drone drone : doubleCube) {
				drone.z--;
			}
		}
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		String sveKoordinate = "";
		for (Drone drone : doubleCube) {
			sveKoordinate += drone.getCoordinates();
		}
		
		return "Drone position: " + sveKoordinate;
	}
	 
	public String getCoordinates() {
		return "(" + doubleCube.get(0).x + "," + doubleCube.get(0).y + "," + doubleCube.get(0).z + ") " ;
	}
	
	
	
}
