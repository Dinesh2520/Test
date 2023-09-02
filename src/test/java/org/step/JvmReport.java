package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void getJvmReporting(String jsonpath) {
		//1st step create to create file path for jvm
		File f = new File(System.getProperty("user.dir")+"\\AllReports\\Jvm Reports");
		
		
		
		
		//2nd step to add project details
		Configuration c= new Configuration(f, "Fb Project");
		c.addClassifications("Platform", "Windows 11");
		c.addClassifications("Sprint", "11");
		c.addClassifications("Version", "Jdk 1.5");
		
		
		//3rd step Add json file path to the list
		
		List<String> l = new ArrayList();
		l.add(jsonpath);
		
		
		
		//4th step
		ReportBuilder b  = new ReportBuilder(l, c);
		b.generateReports();

	}

}
