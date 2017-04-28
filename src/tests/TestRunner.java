
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		 		
		 
		Result rezultat = JUnitCore.runClasses(DroneTestSuite.class);
				for (Failure failure : rezultat.getFailures())
		 			System.out.println("Greska: " + failure.toString());
		  
		 		if (rezultat.wasSuccessful())
		 			System.out.println("Testovi su uspesno prosli.");
		 	}
		  }


