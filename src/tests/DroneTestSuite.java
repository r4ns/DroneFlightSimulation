package tests;

import org.junit.runner.*;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({ DroneTestBasic.class, DroneTestAdvanced.class , CubeTest.class})

public class DroneTestSuite {

}
