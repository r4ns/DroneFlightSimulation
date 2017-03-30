package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.DroneAdvancedTest;
import test.DroneBasicTest;

@RunWith(Suite.class)

@Suite.SuiteClasses ({
	DroneBasicTest.class,
	DroneAdvancedTest.class
})
public class DroneTestSuite {

}
