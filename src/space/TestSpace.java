package space;

public class TestSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boundaries = {2,4,5,6};
		FlySpace test = new FlySpace(boundaries);
		System.out.println(test);
		test.setInsideUpperBoundary(888);
		test.setOutsideLowerBoundary(666);
		System.out.println(test);

	}
	
	
	

}
