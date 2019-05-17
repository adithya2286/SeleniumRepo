package FirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperationsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver web = new ChromeDriver();

		web.get("https://www.google.com");
	}

}
