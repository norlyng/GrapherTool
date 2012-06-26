package GrapherTool_src;


import java.util.*;
import java.util.Properties;
import java.io.*;
import java.io.File; 

public class FilemyUtilities {

	public int FileComp(String FileOne, String FileTwo){
		  
		        // Compare two files.   
		
		        return FileOne.compareTo(FileTwo);   
		  
	}
	
	public void TestRename(String OutputFile, int runNo)
	{
		
		File file = new File(OutputFile);
		File TargetFile = new File("TestCase" + runNo);
		
		boolean Result = file.renameTo(TargetFile);
		
	}
	
	public boolean TestScriptsClean(){
		boolean Result = false; 
		
		  File dir = new File("");
		   for (File child : dir.listFiles()) {

		     if (".".equals(child.getName()) || "..".equals(child.getName())) {

		       continue;
		  // Ignore the self and parent aliases.     
		       
		     }

		     // Do something with child 
		 
		   }
		   return Result;
	}
}
