package UIAuto.SmartFlow.PageObject;

import static org.assertj.core.api.Assertions.assertThat;

import org.fluentlenium.core.FluentPage;

public class Login_Page extends FluentPage{
	
	   public String getUrl(){
	        return "http://54.223.147.111/fulltest1/login.jsp";
	        
	    }
	    
	   @Override
	   public void isAt(){
		   assertThat(window().title()).isEqualTo("fulltest1");
	   }
	    
	    public void login_username(String username){
	        $("#login").fill().with(username);
	    }
	    
	    public void login_password(String password){
	        $("#password").fill().with(password);
	    }
	    
	    public void login_button(){
	        $("span").click();
	    }

}
