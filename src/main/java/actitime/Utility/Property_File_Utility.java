package actitime.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_File_Utility {
	public String readdatafromproperty(String data) throws IOException {
		FileInputStream fis=new FileInputStream(All_File_path.propertyfilepath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(data);
		return value;
	}

}
