package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(DroneTestSuite.class);

		for (Failure failure : result.getFailures())
			System.out.println("Error on: " + failure.toString());

		if (result.wasSuccessful())
			System.out.println("Tests completed without errors.");
	}

}
