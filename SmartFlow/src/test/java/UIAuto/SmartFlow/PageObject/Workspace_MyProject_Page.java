package UIAuto.SmartFlow.PageObject;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.core.FluentControl;
import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.components.ComponentInstantiator;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Workspace_MyProject_Page extends FluentPage {
	
	
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
	

	public void Click_DAL_Linked(){
		$(By.linkText("DAL")).click();
	}
 
	public void Click_Dashboard_Linked(){
		$(By.linkText("Dashboard")).click();
	}
 
	public void Click_Reports_Linked(){
		$(By.linkText("Reports")).click();
	}
	public void Click_Overview_Linked(){
		$(By.linkText("Overview")).click();
	}
 
	public void Click_Project_Linked(){
		$(By.linkText("Project")).click();
	}
 
	public void Click_Admin_Linked(){
		$(By.linkText("Admin")).click();
	}
 
	public void Click_Preferences_Linked(){
		$(By.linkText("Preferences")).click();
	}
 
	public void Click_Help_Linked(){
		$(By.linkText("Help")).click();
	}
 
 
	public void Click_Logout_Linked(){
		$(By.linkText("Logout")).click();
	}

}
