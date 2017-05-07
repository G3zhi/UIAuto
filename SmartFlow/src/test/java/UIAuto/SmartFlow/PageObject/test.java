package UIAuto.SmartFlow.PageObject;


import java.util.logging.Logger;

import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.Test;



@Wait
public class test extends FluentTest  {
	@Page
    private Login_Page login_page;
	@Page
	private Workspace_MyProject_Page myproject_page;
	@Page
	private Admin_Page admin_page;
	@Page
	private Template_Page template_page;
	@Page 
	private Master_Project_Template_Page master_project_template_page;
	
	private static final Logger LOG = Logger.getLogger(test.class.getName());
    @Override
    public String getWebDriver(){
        return "chrome";
    }
    @Test
    public void testq1 (){
    	
        LOG.info("Loading https://www.zalando.de/...");
        window().maximize();
        goTo(login_page.getUrl());
        
        login_page.isAt();
        
        login_page.Input_login_username("Ctest");
        login_page.Input_login_password("rti");
        login_page.Click_login_button();
        myproject_page.Click_Admin_linked();
        admin_page.Click_Templates_linked();
        template_page.Click_Master_Project_Templates_linked();
        master_project_template_page.Click_Create_New_Template_Button();
        master_project_template_page.Create_Template();
   
        
    }
	

}
