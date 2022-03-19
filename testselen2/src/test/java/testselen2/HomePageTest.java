package testselen2;

import org.testng.annotations.Test;
import driver.Base;
import selenobjects.selenobjects;

public class HomePageTest {

	selenobjects hp = new selenobjects(Base.initializer());
	
	@Test
	public void Search() {
		
		hp.searchText().sendKeys("Iphone");
		hp.submit().click();
		hp.searchResults();
	}
}