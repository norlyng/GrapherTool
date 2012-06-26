package GrapherTool_src;

import java.util.*;
import java.util.Properties;


public class gToolConfig {

	public String s_configValue;

   Properties configFile;

public String Config()
   {
	configFile = new java.util.Properties();
	try {			
	  configFile.load(this.getClass().getClassLoader().
	  getResourceAsStream("myapp/config.cfg"));	
	  
	  s_configValue = "Hm!";
	  
	  //return s_configValue;
	}
	catch(Exception eta){
	    eta.printStackTrace();
	}
	
	return s_configValue;
   }
 
   public String getProperty(String key)
   {
	String value = this.configFile.getProperty(key);		
	return value;
   }
} 