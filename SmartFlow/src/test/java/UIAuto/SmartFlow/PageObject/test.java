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
	private Admin_User_And_Company_Page  admin_user_and_company_page ;
    
	
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
        
        login_page.Input_login_username("PI1");
        login_page.Input_login_password("rti");
        login_page.Click_login_button();
        myproject_page.Click_Admin_Linked();
        admin_user_and_company_page.Click_Projects_Linked();
        
    }
	

}
