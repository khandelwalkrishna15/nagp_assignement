package com.nagarro.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.my.classes.SampleTestMethods;


public class TestClass{

	public SampleTestMethods sampleTestMethods;
	@Test
	public void TestCase1() {
	
	sampleTestMethods = new SampleTestMethods();
	
	Assert.assertEquals(sampleTestMethods.add2Numbers(10, 15), 15  );
}
	@Test
	public void TestCase2() {	
		sampleTestMethods = new SampleTestMethods();
		
		Assert.assertEquals(sampleTestMethods.add3Numbers(10, 15, 45), 70  );
}		
			
}
