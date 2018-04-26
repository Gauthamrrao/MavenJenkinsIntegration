package packq1;

import org.testng.annotations.Test;

public class SampleTest 
{
     @Test
	public void CreateTest()
	{
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		
		System.out.println("browser is" +browser);
		System.out.println("uri is "+url);
		
	}
}
