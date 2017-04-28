package UIAuto.SmartFlow.PageObject;


import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.Test;



@Wait
public class test extends FluentTest  {
	@Page
    private Login_Page login_page;
    

    @Override
    public String getWebDriver(){
        return "chrome";
    }
    @Test
    public void testq1 (){
        goTo(login_page.getUrl());
        
        login_page.isAt();
        
        login_page.login_username("PI1");
        login_page.login_password("rti");
        login_page.login_button();
    }
	

}