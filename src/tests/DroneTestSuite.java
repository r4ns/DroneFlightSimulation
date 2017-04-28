package tests;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;

import space.CubeTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   DroneBasicTest.class,
   DroneTestAdvanced.class,
   CubeTest.class
})


public class DroneTestSuite {   
}  	