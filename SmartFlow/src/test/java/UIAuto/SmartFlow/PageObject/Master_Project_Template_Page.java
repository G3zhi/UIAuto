package UIAuto.SmartFlow.PageObject;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

public class Master_Project_Template_Page extends FluentPage {
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[7]/td/table/tbody/tr[6]/td/a/span")
	private FluentWebElement Create_New_Template_Button;
	
	@FindBy(name="temp_name")
	private FluentWebElement template_name_InputWebElement;
	
	@FindBy(name="task_type")
	private FluentWebElement template_typeWebElement;
	
	@FindBy(name="disOj")
	private FluentWebElement all_rolesWebElement;
	
	@FindBy(xpath="/html/body/table[3]/tbody/tr[6]/td/form/table/tbody/tr[4]/td[1]/table/tbody/tr[2]/td[2]/a[1]/span")
	private FluentWebElement add_buttonWebElement;
	
	@FindBy(xpath="/html/body/table[3]/tbody/tr[6]/td/form/table/tbody/tr[4]/td[1]/table/tbody/tr[2]/td[2]/a[2]/span")
	private FluentWebElement remove_buttonWebElement;
	
	@FindBy(name="enOj")
	private FluentWebElement valid_rolesWebElement;
	
	public void Click_Create_New_Template_Button(){
		Create_New_Template_Button.click();
	}
	
	public void Create_Template(){
		template_name_InputWebElement.fill().with("testtemplate");
		template_typeWebElement.fillSelect().withText("DS Approval Workflow");
		all_rolesWebElement.fillSelect().withText("China Admin");
		
	}

}
