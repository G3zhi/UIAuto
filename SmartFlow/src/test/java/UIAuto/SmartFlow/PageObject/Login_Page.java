package UIAuto.SmartFlow.PageObject;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends FluentPage{
	
	@FindBy(id="login")
	private FluentWebElement login_Input;
	

	
	   public String getUrl(){
	        return "http://54.223.147.111/fulltest1/login.jsp";
	        
	    }
	    
	   @Override
	   public void isAt(){
		   assertThat(window().title()).isEqualTo("fulltest1");
	   }
	    
	    public void login_username(String username){
	    	login_Input.fill().with(username);
	        //$("#login").fill().with(username);
	    }
	    
	    public void Input_login_password(String password){
	        login_password_input.fill().with(password);
	    }
	    
	    public void Click_login_button(){
	        login_button.click();
	    }

}
