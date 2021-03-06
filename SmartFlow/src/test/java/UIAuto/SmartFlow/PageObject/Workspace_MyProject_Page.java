package UIAuto.SmartFlow.PageObject;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.core.FluentControl;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.components.ComponentInstantiator;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Workspace_MyProject_Page extends FluentPage {
	
	@FindBy(css="img")
	private FluentWebElement company_icon;
	@FindBy(linkText="DAL")
	private FluentWebElement DAL_linked;
	@FindBy(linkText="Dashboard")
	private FluentWebElement Dashboard_linked;
	@FindBy(linkText="Reports")
	private FluentWebElement Reports_linked;
	@FindBy(linkText="Overview")
	private FluentWebElement Overview_linked;
	@FindBy(linkText="Project")
	private FluentWebElement Project_linked;
	@FindBy(linkText="Admin")
	private FluentWebElement Admin_linked;
	@FindBy(linkText="Preferences")
	private FluentWebElement Preferences_linked;
	@FindBy(linkText="Help")
	private FluentWebElement Help_linked;
	@FindBy(linkText="Logout")
	private FluentWebElement Logout_linked;
	
	public void Click_company_icon(){
		company_icon.click();
	}
	
	public void Click_Admin_linked(){
		Admin_linked.click();
	}
	
	
	
	
	
	
	
	
	public class Proxy_Icon extends FluentWebElement{
		  public Proxy_Icon(WebElement webElement, WebDriver driver, ComponentInstantiator instantiator) {
			  super(webElement, (FluentControl) driver, instantiator);  
		  }
		  
			public void Click_Proxy_Icon(){
				$("#proxy_icon_div").click();
			}	
	}
	
	public void isAt() {
        assertThat(window().title()).isEqualTo("fulltest1");
     }
	
}
