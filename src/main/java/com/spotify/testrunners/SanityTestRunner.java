package com.spotify.testrunners;

import org.junit.runners.Suite.SuiteClasses;



@SuiteClasses({ 
	LoginPageRunner.class, 
	HomePageRunner.class, 
	SearchPageRunner.class })

public class SanityTestRunner {

}
