package drone;

public class Drone implements StandardDrone {
	private int x;
	private int y;
	private int z;

	public Drone() {

	}

	public Drone(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String moveUp(int m) {
		System.out.println("---Moving up---");
		if (this.x >= 0 && this.x <= 50 && this.z >= 40 && this.z <= 50
				|| this.x >= 0 && this.x <= 50 && this.z >= 0 && this.z <= 10
				|| this.z >= 0 && this.z <= 50 && this.x >= 40 && this.x <= 50
				|| this.z >= 0 && this.z <= 50 && this.x >= 0 && this.x <= 10) {
			for (int i = 0; i < m; i++) {
				if (y >= 0 && y < 50) {
					this.y += 1;
					System.out.println(getFormatedCoordinates());
				}
			}
			
		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && this.y >= 0 && this.y < 10) {

			for (int i = 0; i < m; i++) {
				if (y >= 0 && y < 10) {
					this.y += 1;
					System.out.println(getFormatedCoordinates());
				}

			}
			
		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && y >= 40 && y < 50) {

			for (int i = 0; i < m; i++) {
				if (y >= 40 && y < 50) {
					this.y += 1;
					System.out.println(getFormatedCoordinates());
				}

			}
			
		} else
			System.out.println("Hitting the wall !!!");

		return null;
	}

	public String moveDown(int m) {
		System.out.println("---Moving down---");
		if (this.x >= 0 && this.x <= 50 && this.z >= 40 && this.z <= 50
				|| this.x >= 0 && this.x <= 50 && this.z >= 0 && this.z <= 10
				|| this.z >= 0 && this.z <= 50 && this.x >= 40 && this.x <= 50
				|| this.z >= 0 && this.z <= 50 && this.x >= 0 && this.x <= 10) {
			for (int i = 0; i < m; i++) {
				if (y > 0 && y <= 50) {
					this.y -= 1;
					System.out.println(getFormatedCoordinates());
				}
			}

		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && this.y > 0 && this.y <= 10) {

			for (int i = 0; i < m; i++) {
				if (y > 0 && y <= 10) {
					this.y -= 1;
					System.out.println(getFormatedCoordinates());
				}

			}

		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && y > 40 && y <= 50) {

			for (int i = 0; i < m; i++) {
				if (y > 40 && y <= 50) {
					this.y -= 1;
					System.out.println(getFormatedCoordinates());
				}

			}

		} else
			System.out.println("Hitting the wall !!!");

		return null;
	}

	public String moveLeft(int m) {
		System.out.println("---Moving left---");
		if (this.y >= 0 && this.y <= 50 && this.z >= 40 && this.z <= 50
				|| this.y >= 0 && this.y <= 50 && this.z >= 0 && this.z <= 10
				|| this.z >= 0 && this.z <= 50 && this.y >= 40 && this.y <= 50
				|| this.z >= 0 && this.z <= 50 && this.y >= 0 && this.y <= 10) {
			for (int i = 0; i < m; i++) {
				if (x > 0 && x <= 50) {
					this.x -= 1;
					System.out.println(getFormatedCoordinates());
				}
			}

		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && this.y > 0 && this.y <= 10) {

			for (int i = 0; i < m; i++) {
				if (x > 0 && x <= 10) {
					this.x -= 1;
					System.out.println(getFormatedCoordinates());
				}

			}

		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && y > 40 && y <= 50) {

			for (int i = 0; i < m; i++) {
				if (x > 40 && x <= 50) {
					this.x -= 1;
					System.out.println(getFormatedCoordinates());
				}

			}

		} else
			System.out.println("Hitting the wall !!!");

		return null;

	}

	public String moveRight(int m) {
		System.out.println("---Moving right---");
		if (this.y >= 0 && this.y <= 50 && this.z >= 40 && this.z <= 50
				|| this.y >= 0 && this.y <= 50 && this.z >= 0 && this.z <= 10
				|| this.z >= 0 && this.z <= 50 && this.y >= 40 && this.y <= 50
				|| this.z >= 0 && this.z <= 50 && this.y >= 0 && this.y <= 10) {
			for (int i = 0; i < m; i++) {
				if (x >= 0 && x < 50) {
					this.x += 1;
					System.out.println(getFormatedCoordinates());
				}
			}

		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && this.y >= 0 && this.y < 10) {

			for (int i = 0; i < m; i++) {
				if (x >= 0 && x < 10) {
					this.x += 1;
					System.out.println(getFormatedCoordinates());
				}

			}

		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && y >= 40 && y < 50) {

			for (int i = 0; i < m; i++) {
				if (x >= 40 && x < 50) {
					this.x += 1;
					System.out.println(getFormatedCoordinates());
				}

			}

		} else
			System.out.println("Hitting the wall !!!");

		return null;
	}

	public String moveBack(int m) {
		System.out.println("---Moving back---");
		if (this.x >= 0 && this.x <= 50 && this.y >= 40 && this.y <= 50
				|| this.x >= 0 && this.x <= 50 && this.y >= 0 && this.y <= 10
				|| this.y >= 0 && this.y <= 50 && this.x >= 40 && this.x <= 50
				|| this.y >= 0 && this.y <= 50 && this.x >= 0 && this.x <= 10) {
			for (int i = 0; i < m; i++) {
				if (z >= 0 && z < 50) {
					this.z += 1;
					System.out.println(getFormatedCoordinates());
				}
			}

		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && this.y >= 0 && this.y < 10) {

			for (int i = 0; i < m; i++) {
				if (z >= 0 && z < 10) {
					this.z += 1;
					System.out.println(getFormatedCoordinates());
				}

			}

		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && y >= 40 && y < 50) {

			for (int i = 0; i < m; i++) {
				if (z >= 40 && z < 50) {
					this.z += 1;
					System.out.println(getFormatedCoordinates());
				}

			}

		} else
			System.out.println("Hitting the wall !!!");

		return null;
	}

	public String moveForth(int m) {
		System.out.println("---Moving forth---");
		if (this.x >= 0 && this.x <= 50 && this.y >= 40 && this.y <= 50
				|| this.x >= 0 && this.x <= 50 && this.y >= 0 && this.y <= 10
				|| this.y >= 0 && this.y <= 50 && this.x >= 40 && this.x <= 50
				|| this.y >= 0 && this.y <= 50 && this.x >= 0 && this.x <= 10) {
			for (int i = 0; i < m; i++) {
				if (z > 0 && z <= 50) {
					this.z -= 1;
					System.out.println(getFormatedCoordinates());
				}
			}

		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && this.y > 0 && this.y <= 10) {

			for (int i = 0; i < m; i++) {
				if (z > 0 && z <= 10) {
					this.z -= 1;
					System.out.println(getFormatedCoordinates());
				}

			}

		} else if (this.x >= 10 && this.x <= 40 && this.z >= 10 && this.z <= 40 && y > 40 && y <= 50) {

			for (int i = 0; i < m; i++) {
				if (z > 40 && z <= 50) {
					this.z -= 1;
					System.out.println(getFormatedCoordinates());
				}

			}

		} else
			System.out.println("Hitting the wall !!!");

		return null;
	}

	public String getFormatedCoordinates() {
		if(this.x == 0 && this.y == 30 && this.z == 30){
			System.out.println("Destination reched :");
		}
		return "Drone position : (" + x + "," + y + "," + z + ")";
		
	}

}
