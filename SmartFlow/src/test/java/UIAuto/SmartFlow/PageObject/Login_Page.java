package UIAuto.SmartFlow.PageObject;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends FluentPage{
	
	@FindBy(id="login")
	private FluentWebElement  login_username_input;
	@FindBy(id="password")
	private FluentWebElement  login_password_input;
	@FindBy(className="mybutton")
	private FluentWebElement  login_button;
	@FindBy(linkText="Forgot my Password")
	private FluentWebElement  forget_my_password_linked;
	
	
	   public String getUrl(){
	        return "http://54.223.147.111/fulltest1/login.jsp";
	        
	    }
	    
	   @Override
	   public void isAt(){
		   assertThat(window().title()).isEqualTo("fulltest1");
	   }
	    
	    public void Input_login_username(String username){
	        login_username_input.fill().with(username);
	    }
	    
	    public void Input_login_password(String password){
	        login_password_input.fill().with(password);
	    }
	    
	    public void Click_login_button(){
	        login_button.click();
	    }

}
