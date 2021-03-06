package org.powerapi.jjoules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class SleepTest {
	
	private Sleep sleep;

	@BeforeEach
	public void init() {
		sleep = new Sleep();
	}
	
	@Test
	public void sleepForTenMSShouldGiveTen() {
		Assertions.assertEquals(10,this.sleep.sleep(10));
	}
	
	@Test
	public void sleepForTwentyMSShouldGiveTwenty() {
		Assertions.assertEquals(20,this.sleep.sleep(20));
	}
	
	

}
