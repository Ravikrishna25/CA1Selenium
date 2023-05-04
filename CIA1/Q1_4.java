package CIA1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Q1_4 {
public static void main(String[] args) throws InterruptedException {
ChromeOptions co=new ChromeOptions();
co.addArguments("--remote-allow-origins=*");
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Fastrack Watches");
driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
Thread.sleep(2000);
driver.navigate().to("https://www.amazon.in/Fastrack-Analog-Black-Dial-Watch-NK3147KM01/dp/B01GDWNV86/ref=sxin_25_recs_zoco_stores_brand_identity_bs?content-id=amzn1.sym.336d1ffc-1bb0-4002-950e-c5a1ab177cef%3Aamzn1.sym.336d1ffc-1bb0-4002-950e-c5a1ab177cef&cv_ct_cx=fastrack+watches&keywords=fastrack+watches&pd_rd_i=B01GDWNV86&pd_rd_r=81d9e00c-a0b9-4748-9686-95f3284f5634&pd_rd_w=TDJiM&pd_rd_wg=xMnMt&pf_rd_p=336d1ffc-1bb0-4002-950e-c5a1ab177cef&pf_rd_r=7VGPGC1B5V9ZYC4PH2NM&qid=1683192870&sbo=RZvfv%2F%2FHxDF%2BO5021pAnSA%3D%3D&sr=1-1-0723f66e-ff99-43ba-a202-1be1089a8603") ;

driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"))
.click();
WebElement
ele=driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1"));
String sample=ele.getText();
System.out.println(sample);
String actual="Sign in";
if(sample.equals(actual)) {
System.out.print("CheckOut process is done successfully");
}
}
}
