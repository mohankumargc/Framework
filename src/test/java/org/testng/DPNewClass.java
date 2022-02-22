package org.testng;

public class DPNewClass {
	
	@org.testng.annotations.DataProvider(name="input")
	private String[][] data() {
		return new String [] [] {

	{"mohan","mohan@123"},{"java","java@123"},{"selenium","selenium@123"}
	};
	
	}

}
