package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_sort
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shreya\\OneDrive\\Desktop\\Selenium JAR\\chromedriver.exe");
		WebDriver w= new ChromeDriver();
		w.get("https://demoqa.com/sortable");
		w.manage().window().maximize();
	   Thread.sleep(6000);
		Actions a=new Actions(w);
		

		JavascriptExecutor js = (JavascriptExecutor)w;
		js.executeScript("window.scrollBy(0,250)", "");
		//dragging 1st position to last position
		WebElement o=w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]")); //1st position
		WebElement s=w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[6]"));//last element
		a.dragAndDrop(o, s).build().perform();
		
		//dragging 1st position to 2nd last position
		WebElement t=w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));//1st position
		WebElement sl=w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[5]"));//2nd last position
		a.dragAndDrop(t, sl).build().perform();
		
		//dragging 1st position to 3rd last position
		WebElement th=w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));//1st position
		WebElement tl=w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[4]"));//last 3rd position
		a.dragAndDrop(th, tl).build().perform();
		
		//dragging 1st position to 4th last position
		WebElement f=w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));//1st position
		WebElement fl=w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[3]"));//4th last position i.e,3rd position from up
		a.dragAndDrop(f, fl).build().perform();
		
		//dragging 1st position to last 5th position i.e.,interchanging 1st and 2nd position
		WebElement fi=w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[1]"));//1st position
		WebElement fiL=w.findElement(By.xpath("//*[@id=\"demo-tabpane-list\"]/div/div[2]"));//Last 5th position i.e.2nd position from up
		a.dragAndDrop(fi, fiL).build().perform();
		
		w.close();
		
		
	}

}
