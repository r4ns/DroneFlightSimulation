package util;


public class UtilityTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cube cube = new Cube(new int[]{0,0,0},50);
		System.out.println(cube.checkIfCubesAreTouchingFromOutside(new Cube(new int[] {50,0,0},20)));
	}

}
