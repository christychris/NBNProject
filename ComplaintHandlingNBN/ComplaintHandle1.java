
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class ComplaintHandle1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://staging.twohootsapp.com/");
		
		driver.findElement(By.cssSelector("a.btn.btn-default.btn-block")).click();
		driver.findElement(By.xpath("//input[@id='register-email']")).sendKeys("christinairudhayaraj@gmail.com");
		driver.findElement(By.xpath("//input[@id='register-password']")).sendKeys("Christina@25");
		Robot robot=new Robot();
	

		driver.findElement(By.xpath("//button[@id='LoginButton']")).click();
		driver.findElement(By.xpath("//a[text()='Submit new complaint']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Telco')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Internet')]")).click();
		driver.findElement(By.cssSelector("button.btn.btn-pagenav.btn-block")).click();
		driver.findElement(By.xpath("//label[contains(text(),'NBN - Personal - Postpaid')]")).click();
		driver.findElement(By.cssSelector("button.btn.btn-pagenav.btn-block")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Speed')]")).click();
		driver.findElement(By.cssSelector("button.btn.btn-pagenav.btn-block")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Slow speed - watching video')]")).click();
		robot.setAutoDelay(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//label[contains(text(),'Dropouts - with TV')]")).click();
		robot.setAutoDelay(2000);
		driver.findElement(By.cssSelector("button.btn.btn-pagenav.btn-block")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Disappointed')]")).click();
		driver.findElement(By.cssSelector("button.btn.btn-pagenav.btn-block")).click();
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("67 View Street");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Woollahra");
		robot.setAutoDelay(1000);
        js.executeScript("window.scrollBy(0,1000)");
        
        Select s=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        s.selectByValue("2");
        
        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("2025");
        Thread.sleep(4000);
   
        driver.findElement(By.xpath("//body")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='submit-btn']")).click(); 
        driver.findElement(By.cssSelector("label.checkbox-text.clearfix.radio-label")).click();
        Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input.form-control.select-multiple-org.list.autocomplete-1")).sendKeys("Tel"+Keys.SPACE);
        Thread.sleep(2000);
		List<WebElement> ls=driver.findElements(By.cssSelector("li.ui-menu-item.listing a"));
	
		for(WebElement otn:ls)
		{
			if(otn.getText().equalsIgnoreCase("Telstra"))
					{
				        otn.click();
			        }

		}
		driver.findElement(By.cssSelector("input.form-control.select-multiple-org.list.autocomplete-2")).sendKeys("op");
		Thread.sleep(2000);
		List<WebElement> ls1=driver.findElements(By.cssSelector("li.ui-menu-item.listing a"));
		for(WebElement opn:ls1)
		{
			if(opn.getText().equalsIgnoreCase("optus"))
			{
				opn.click();
			}
		}
		
		driver.findElement(By.cssSelector("button.btn.btn-pagenav.btn-block.organisation-button")).click();

        
        
        
        Select sl=new Select(driver.findElement(By.xpath("//select[@id='issue_occur']")));
        sl.selectByValue("2");
        Select s2=new Select(driver.findElement(By.xpath("//select[@id='issue_occur_when']")));
        s2.selectByValue("2");
        
        driver.findElement(By.cssSelector("input.form-control.test-two.download")).sendKeys("100");
        driver.findElement(By.cssSelector("input.form-control.test-two.upload")).sendKeys("10");
        driver.findElement(By.cssSelector("input.form-control.test-two.ping")).sendKeys("1");
        driver.findElement(By.cssSelector("input.form-control.test-three.hour")).sendKeys("10");
        driver.findElement(By.cssSelector("input.form-control.test-three.minute")).sendKeys("10");
        driver.findElement(By.cssSelector("a.btn.btn-success.add.addmore")).click();
        
        js.executeScript("window.scrollBy(0,1000)");

        
        driver.findElement(By.cssSelector("input.form-control.test-two.download")).sendKeys("20");
        driver.findElement(By.cssSelector("input.form-control.test-two.upload")).sendKeys("2");
        driver.findElement(By.cssSelector("input.form-control.test-two.ping")).sendKeys("4");
        driver.findElement(By.cssSelector("input.form-control.test-three.hour")).sendKeys("19");
        driver.findElement(By.cssSelector("input.form-control.test-three.minute")).sendKeys("22");
        js.executeScript("window.scrollBy(0,500)");

        
        driver.findElement(By.cssSelector("input.form-control.device-child")).sendKeys("3");
        driver.findElement(By.xpath("//div[@class='form-group']//div[5]//input[1]")).sendKeys("1");
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//div[13]//input[1]")).sendKeys("1");
        driver.findElement(By.xpath("//div[15]//input[1]")).sendKeys("1");
        driver.findElement(By.cssSelector("button.btn.btn-pagenav.btn-block")).click();
        
        Select s3=new Select(driver.findElement(By.xpath("//select[@id='modem_supply']")));
        s3.selectByValue("1");
        Select s4=new Select(driver.findElement(By.xpath("//select[@id='soldSignup-zero']")));
        s4.selectByValue("3");
        Select s5=new Select(driver.findElement(By.xpath("//select[@id='soldSignup-one']")));
        s5.selectByValue("9");
        Select s6=new Select(driver.findElement(By.xpath("//select[@id='soldSignup-two']")));
        s6.selectByValue("6");
        js.executeScript("window.scrollBy(0,500)");
        Select s7=new Select(driver.findElement(By.xpath("//select[@id='soldSignup-three']")));
        s7.selectByValue("1");
        Select s8=new Select(driver.findElement(By.xpath("//select[@id='soldSignup-four']")));
        s8.selectByValue("13");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='soldSignup-other-four']")).sendKeys("Exceptional Customer Service");
        Select s9=new Select(driver.findElement(By.xpath("//select[@id='promises-zero']")));
        s9.selectByValue("1");
        Select s10=new Select(driver.findElement(By.xpath("//select[@id='promises-one']")));
        s10.selectByValue("4");
        Select s11=new Select(driver.findElement(By.xpath("//select[@id='promises-two']")));
        s11.selectByValue("6");
        js.executeScript("window.scrollBy(0,500)");
        Select s12=new Select(driver.findElement(By.xpath("//select[@id='promises-three']")));
        s12.selectByValue("2");
        Select s13=new Select(driver.findElement(By.xpath("//select[@id='promises-four']")));
        s13.selectByValue("14");
        driver.findElement(By.xpath("//input[@id='promises-other-four']")).sendKeys("Apology");
        Select s14=new Select(driver.findElement(By.xpath("//select[@id='services-zero']")));
        s14.selectByValue("1");
        Select s15=new Select(driver.findElement(By.xpath("//select[@id='services-one']")));
        s15.selectByValue("3");
        Select s16=new Select(driver.findElement(By.xpath("//select[@id='services-two']")));
        s16.selectByValue("4");
        driver.findElement(By.cssSelector("button.btn.btn-pagenav.btn-block")).click();
        
        
        Select s17=new Select(driver.findElement(By.xpath("//select[@id='plan']")));
        s17.selectByValue("3");
        
        Select s18=new Select(driver.findElement(By.xpath("//select[@id='technology']")));
        s18.selectByValue("2");
        
        Select s19=new Select(driver.findElement(By.xpath("//div[@class='test-one full-width']//select[1]")));
        s19.selectByValue("10");
        
        Select s20=new Select(driver.findElement(By.xpath("//body//select[2]")));
        s20.selectByValue("3");
        	
        Select s21=new Select(driver.findElement(By.xpath("//body//select[3]")));
        s21.selectByValue("52");
        js.executeScript("window.scrollBy(0,500)");
        
        //date 1
        
        driver.findElement(By.xpath("//div[@id='datepicker']//span[@class='input-group-addon']")).click();
		Thread.sleep(2000);     
		WebElement month=driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
        	
        while(!month.getText().contains("April 2020"))
        {
        driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click();
        
        }
        
        List<WebElement> dates=driver.findElements(By.className("day"));
        int count=driver.findElements(By.className("day")).size();
        for(int i=0;i<count;i++)
        {
        	String text=driver.findElements(By.className("day")).get(i).getText();
        	if(text.equalsIgnoreCase("1"))
        	{
        		driver.findElements(By.className("day")).get(i).click();
        		break;
        	}
        }
       
        
        //date2
        driver.findElement(By.xpath("//div[@id='datepicker1']//span[@class='input-group-addon']")).click();
        Thread.sleep(2000);
        
        
        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
        {
        driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click();
        
        }
        
        List<WebElement> dates2=driver.findElements(By.className("day"));
        int count2=driver.findElements(By.className("day")).size();
        for(int i=0;i<count2;i++)
        {
        	String text2=driver.findElements(By.className("day")).get(i).getText();
        	if(text2.equalsIgnoreCase("29"))
        	{
        		driver.findElements(By.className("day")).get(i).click();
        		break;
        	}
        }
        
        js.executeScript("window.scrollBy(0,500)");

        //date3
        driver.findElement(By.xpath("//div[@id='datepicker2']//span[@class='input-group-addon']")).click();
        Thread.sleep(2000);
        while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("June"))
        {
        driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='prev']")).click();
        
        }
        
        List<WebElement> dates3=driver.findElements(By.className("day"));
        int count3=driver.findElements(By.className("day")).size();
        for(int i=0;i<count3;i++)
        {
        	String text3=driver.findElements(By.className("day")).get(i).getText();
        	if(text3.equalsIgnoreCase("30"))
        	{
        		driver.findElements(By.className("day")).get(i).click();
        		break;
        	}
        }
        
        Select s22=new Select(driver.findElement(By.xpath("//select[@id='unexpected-one']")));
        s22.selectByValue("7");
        
        Select s23=new Select(driver.findElement(By.xpath("//select[@id='unexpected-two']")));
        s23.selectByValue("6");
        
        Select s24=new Select(driver.findElement(By.xpath("//select[@id='unexpected-three']")));
        s24.selectByValue("3");
        
        driver.findElement(By.xpath("//button[@class='btn btn-pagenav btn-block']")).click();
        
        Select s25=new Select(driver.findElement(By.xpath("//select[@id='impact-field']")));
        s25.selectByValue("4");
        
        Select s26=new Select(driver.findElement(By.xpath("//select[@id='outcome-field1']")));
        s26.selectByValue("1");
        
        Select s27=new Select(driver.findElement(By.xpath("//select[@id='outcome-field2']")));
        s27.selectByValue("7");
        Thread.sleep(2000);
        Select s28=new Select(driver.findElement(By.xpath("//select[@id='outcome-field3']")));
        s28.selectByValue("10");
        driver.findElement(By.xpath("//input[@id='other-outcome3']")).sendKeys("Free data");
        Thread.sleep(2000);
        Select s29=new Select(driver.findElement(By.xpath("//select[@id='contactattempts-field']")));
        s29.selectByValue("4");
        Select s30=new Select(driver.findElement(By.xpath("//select[@id='experience-field2']")));
        s30.selectByValue("9");
        driver.findElement(By.xpath("//input[@id='referencenumber-field']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='accountnumber-field']")).sendKeys("ABCDEF");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
        String filepath=System.getProperty("user.dir")+ "C:\\Users\\Amalraj\\Desktop\\fridge1.jpg";
		driver.findElement(By.xpath("//span[@class='btn btn-default btn-file']")).click();
        Thread.sleep(6000);
        StringSelection stringsel=new StringSelection("C:\\Users\\Amalraj\\Desktop\\fridge1.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringsel, null);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='comments-field']")).sendKeys("Please help with the problem");
		driver.findElement(By.xpath("//button[@id='btn-next']")).click();
        driver.findElement(By.xpath("//div[@class='container pagenav-container']//button[@id='submit-step']")).click();
        
        
        driver.findElement(By.xpath("//i[@class='fa fa-calendar']")).click();
		Thread.sleep(2000);     
		WebElement month1=driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
        List<WebElement> dates4=driver.findElements(By.className("day"));
        int count4=driver.findElements(By.className("day")).size();
        for(int i=0;i<count;i++)
        {
        	String text=driver.findElements(By.className("day")).get(i).getText();
        	if(text.equalsIgnoreCase("31"))
        	{
        		driver.findElements(By.className("day")).get(i).click();
        		break;
        	}
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='change-date']")).click();
        
        
        
        
        
        	
        
        
        
        
        

        
        

        
        


        

        	



        

		
		
		
         
		
		


		
	

	}
}
