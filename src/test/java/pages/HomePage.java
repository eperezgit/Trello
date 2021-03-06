
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.WaitForPagesToLoad;

public class HomePage extends WaitForPagesToLoad {

	public static WebElement element = null;

	/* Returns the login button element on landing page */

	public WebElement loginButton() {
		element = browser.findElement(By.xpath("//a[contains(@href,'/login')]"));
		return element;
	}

	/* Action performed on login button element on landing page */

	public void clickLoginButton() {

		waitForElementToBeClickable(browser, loginButton()).click();

	}

}
