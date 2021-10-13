package LoginApp;

import java.io.FileInputStream;
import java.util.Properties;

public class LoginApp {
	
	public boolean userLogin(String user, String u_pwd) throws Exception{
		Properties prop = new Properties();
		prop.load(new FileInputStream("src\\test\\resources\\credentials.property"));
		String un = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		if(un.equals(user) && password.equals(u_pwd)) 
			return true;
		else
			return false;
			
		
	}

}
