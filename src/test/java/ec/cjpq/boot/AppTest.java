package ec.cjpq.boot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import ec.cjpq.boot.controller.HomeController;

public class AppTest {
   	
	@Test
	public void testApp(){
		HomeController homeController = new HomeController();
		String result = homeController.home();		
		assertEquals(result, "Das boot, reporting by duty");
    }
}
