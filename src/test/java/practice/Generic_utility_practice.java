package practice;

import java.io.IOException;

import actitime.Utility.Excel_File_Utility;
import actitime.Utility.Property_File_Utility;

public class Generic_utility_practice {

	public static void main(String[] args) throws IOException {
		Property_File_Utility putil=new Property_File_Utility();
		Excel_File_Utility eutil=new Excel_File_Utility();
		String BROWSER = putil.readdatafromproperty("browser");
		String name = eutil.readdata("NAME", 1, 2);
		System.out.println(BROWSER+"\n"+name);

	}

}
