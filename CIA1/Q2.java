package CIA1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Q2 {
public static void main( String[] args ) throws InterruptedException{
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriverManager.chromedriver().setup();//setting up chrome driver
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Watches");
driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
String a=driver.getTitle();
if(a.equals("Amazon.in : Watches")) {
System.out.println("Title is Matched\n");
}
else {
System.out.println("Title is Mismatched");
}
List<WebElement> li=driver.findElements(By.className("s-line-clamp-2"));
for(int i=0;i<5;i++) {
System.out.println(li.get(i).getText());
}

//driver.findElement(By.xpath("//*[@id=\"p_36/1318505031\"]/span/a/span")).click();

WebElement b=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[2]/a/span[1]/span[2]/span[2]"));
System.out.print("Price 2,000-10,000 :"+b.getText());
driver.findElement(By.xpath("//*[@id=\"p_89/Samsung\"]/span/a/div/label/i")).click();
WebElement c=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
System.out.print("Price 2,000-10,000 & Fastrack: "+ c.getText());
}
}
