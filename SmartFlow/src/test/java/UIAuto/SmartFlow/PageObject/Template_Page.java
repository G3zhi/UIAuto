package UIAuto.SmartFlow.PageObject;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

public class Template_Page extends FluentPage {
	
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
	
	@FindBy(linkText="User & Company")
	private FluentWebElement User_And_Company_linked;
	@FindBy(linkText="Roles")
	private FluentWebElement Roles_linked;
	@FindBy(linkText="Projects")
	private FluentWebElement Projects_linked;
	@FindBy(linkText="Items")
	private FluentWebElement Items_linked;
	@FindBy(linkText="Templates")
	private FluentWebElement Templates_linked;
	@FindBy(linkText="Translations")
	private FluentWebElement Translations_linked;
	@FindBy(linkText="Overviews")
	private FluentWebElement Overviews_linked;
	@FindBy(linkText="System Setting")
	private FluentWebElement System_Setting_linked;
	@FindBy(linkText="Access Log")
	private FluentWebElement Access_Log_linked;
	@FindBy(linkText="Modules")
	private FluentWebElement Modules_linked;
	
	@FindBy(linkText="Master Project Templates")
	private FluentWebElement Master_Project_Templates_linked;
	
	@FindBy(linkText="Linked Project Templates")
	private FluentWebElement Linked_Project_Templates_linked;
	
	@FindBy(linkText="Flags")
	private FluentWebElement Flags_linked;
	
	
	public void Click_Master_Project_Templates_linked(){
		Master_Project_Templates_linked.click();
	}
	
	

}
