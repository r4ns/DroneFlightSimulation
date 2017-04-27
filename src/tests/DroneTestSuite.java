package tests;



import org.junit.runner.*;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({ DroneBasicTest.class,
	DroneAdvancedTest.class })
 
public class DroneTestSuite {

}
