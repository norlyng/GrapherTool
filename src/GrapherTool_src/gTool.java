package GrapherTool_src;

import java.util.*;
import java.util.Properties;




public class gTool {

	 public static void main(String[] args) {
	        System.out.println("GrapherTool:");
	        if (args.length < 1)
	        {
	        	System.out.println(" No arguments found!");
	        	System.out.println(" Try: -h or -? for help of using this tool");
	        }
	        else if (args[0].startsWith("-v") || args[0].startsWith("-V") || args[0].startsWith("-Version") || args[0].startsWith("-version") )
	        {
	        	System.out.println("---------------------------------------------------------------------------");
	        	System.out.println("GrapherTool Version: 0.01");
	        	System.out.println("Made year: July 2012");
	        	System.out.println("---------------------------------------------------------------------------");
	        }
	        else if (args[0].startsWith("-h") || args[0].startsWith("-H") || args[0].startsWith("-?") || args[0].startsWith("-help") )
	        {
	        	System.out.println("---------------------------------------------------------------------------");
	        	System.out.println("You have reached the GrapherTool Help!");
	        	System.out.println("");
	        	System.out.println("-v Gives you the version of the tool.");
	        	System.out.println("");
	        	System.out.println("");
	        	System.out.println("");
	        	System.out.println("");
	        	System.out.println("");
	        	System.out.println("---------------------------------------------------------------------------");
	        }
	        else
	        {
		        for (int i = 0; i < args.length; i++)
		            System.out.println(i + " " + args[i]);
	        }
	    }

	 // hm!

	 gToolConfig config = new gToolConfig();
	 String confFile = config.getProperty("sfdsdf");

	
}


