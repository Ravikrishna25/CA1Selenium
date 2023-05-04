package CIA1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Q3 {
public static void main( String[] args ){
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
//sigin
driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();
driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("6379472919")
;
driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).click();
driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Ravi@2004");
driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
WebElement
acc=driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[1]/h1"));
String actual=acc.getText();
String expected="Your Account";
if(actual.equals(expected)) {
System.out.println("Your Account page is displayed");
}
driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div")).
click();
WebElement
ord=driver.findElement(By.xpath("//*[@id=\"a-page\"]/section/div[1]/div[2]/div[1]/h1"));
String act=ord.getText();
String exp="Your Orders";
if(act.equals(exp)) {
System.out.println("Your Order page is displayed");
}
//
driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div"))
.click();

 WebElement
trac=driver.findElement(By.xpath("//*[@id=\"a-page\"]/section/div[1]/div[2]/div[1]/h1"));
String act1=ord.getText();
String exp1="Your orders";
if(act.equals(exp)) {
System.out.println("User is able to track package");
}
//
driver.findElement(By.xpath("//*[@id=\"pop\"]/div/div[2]/div/div[1]/div/div[3]/div/div/div/div/div[2]/div/div/a")).click();
System.out.println("User is able to view Order Summary");
}
}

