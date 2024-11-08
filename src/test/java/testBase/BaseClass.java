package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.text.RandomStringGenerator;
import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;   //log4j
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {

	public static WebDriver driver;
	public Logger logger;
	public Properties p;
	
	@BeforeClass(groups= {"Master","Sanity","Regression"})
	@Parameters({"os","browser"})                               //getting browser parameters from testng.xml
	public void setup(String os,String br) throws IOException
	
	{
		//loading properties file
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p= new Properties();
		p.load(file);
		
		//loading log4j file
		logger=LogManager.getLogger(this.getClass());             //Log4j
		
		//launching browser based on condition
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver(); break;
		case "edge": driver=new EdgeDriver(); break;
		default: System.out.println("No matching browser..");
					return;
		}
		
			/*if (br.equals("chrome")) {
			driver=new ChromeDriver();
		}else if (br.equals("edge")) {
			driver=new EdgeDriver();
		} */                                                      // for parallel multibrowser testing 
		
		
		//driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p.getProperty("appURL1"));
		//driver.get("http://localhost/opencart/upload/index.php");
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups= {"Master","Sanity","Regression"})
	public void tearDown()
	{
		driver.close();
	}
	

	public String randomeString() {
	    RandomStringGenerator generator = new RandomStringGenerator.Builder()
	            .withinRange('a', 'z')
	            .build();
	    return generator.generate(5);
	}

	public String randomeNumber() {
	    RandomStringGenerator generator = new RandomStringGenerator.Builder()
	            .withinRange('0', '9')
	            .build();
	    return generator.generate(10);
	}

	public String randomAlphaNumeric() {
	    RandomStringGenerator alphaGenerator = new RandomStringGenerator.Builder()
	            .withinRange('a', 'z')
	            .build();
	    RandomStringGenerator numGenerator = new RandomStringGenerator.Builder()
	            .withinRange('0', '9')
	            .build();
	    
	    return alphaGenerator.generate(4) + "@" + numGenerator.generate(3);
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
	
}
