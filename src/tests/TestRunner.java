package tests;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args)
	{
		 Result result = JUnitCore.runClasses(DroneTestSuite.class);

	      for (Failure failure : result.getFailures()) {
	         System.out.println("Sve proslo hehe? " + failure.toString());
	      }
			
	      System.out.println("Sve proslo hehe? " + result.wasSuccessful());
	}
}
