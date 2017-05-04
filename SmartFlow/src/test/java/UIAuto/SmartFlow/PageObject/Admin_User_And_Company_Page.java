package UIAuto.SmartFlow.PageObject;

import org.fluentlenium.core.FluentPage;
import org.openqa.selenium.By;

public class Admin_User_And_Company_Page extends FluentPage {
	
	 public void Click_User_And_Company_Linked(){
			$(By.linkText("User & Company")).click();
		}
	 
	 public void Click_Roles_Linked(){
			$(By.linkText("Roles")).click();
		}
	 
	 public void Click_Projects_Linked(){
			$(By.linkText("Projects")).click();
		}
	 
	 public void Click_Items_Linked(){
			$(By.linkText("Items")).click();
		}

}