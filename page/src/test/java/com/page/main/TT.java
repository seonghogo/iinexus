package com.page.main;

import org.junit.Test;

public class TT {

	@Test
	public void versionTest() throws Exception{
		String test = org.springframework.core.SpringVersion.getVersion();
		System.out.println(test);
	}
}
