package com.crm.comcast.SDET32__GitPrac;

import org.testng.annotations.Test;

public class ParametreTest {

	@Test

	public void testP() {
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");

		System.out.println(browser);
		System.out.println(url);

		System.out.println("First  Changed Push from Jenkins");
		System.out.println("First  Changed Push from Jenkins2");
		System.out.println("First  Changed Push from Jenkins3");
		System.out.println("First  Changed Push from Jenkins3");
	}

}
