import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver.manage().window().maximize();
            WebDriverWait wait=new WebDriverWait(driver,30);
//            driver.get("https://accounts.google.com/v3/signin/challenge/pwd?TL=AG7eRGD1EVhvfOUMh_wc3O5kbWmSRlSzeC5wQv8Oy_owKhgmeNiDME6GqP04js8r&checkConnection=youtube%3A233%3A0&checkedDomains=youtube&cid=1&continue=https%3A%2F%2Fconsole.cloud.google.com%2F&dsh=S67550680%3A1685777927110305&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Fconsole.cloud.google.com%2F&ifkv=Af_xneFE1Xep7-nkW2LlaQMruvHJe6R69HLnqTmbA19C5FcW3JtgktaFRG2JFB8Va22R1haD2oEX&osid=1&pstMsg=1&service=cloudconsole");

            driver.get("https://console.cloud.google.com/");
//
//            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            WebElement email =  driver.findElement(By.xpath("//input[@type=\"email\"]"));
            email.sendKeys("josephtroshni@gmail.com");
            email.sendKeys(Keys.ENTER);
            Thread.sleep(5000);

//            WebElement next = driver.findElement(By.xpath("(//input[@type=\"password\"]"));
//            next.click();
////
//            String currentWindow;
//
//            driver.getCurrentUrl();
//            driver.get("https://accounts.google.com/v3/signin/challenge/pwd?TL=AG7eRGCg6T55MPyWG2Fw26irEGzwoljQmOmJLgowar9WJ5ItTJgKiNhVNd_N89da&checkConnection=youtube%3A683%3A0&checkedDomains=youtube&cid=1&continue=https%3A%2F%2Fconsole.cloud.google.com%2F&dsh=S67550680%3A1685777927110305&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Fconsole.cloud.google.com%2F&ifkv=Af_xneHETUvl5kplxvgTYXAx6L-6skmrmav8v__0zUahl_oIXMFuOEt6ijrrc6K087RpyKbjFIAZ&osid=1&pstMsg=1&service=cloudconsole");
//            currentWindow = driver.getWindowHandle();
//            driver.switchTo().window(currentWindow);


//            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//            WebElement email1 =  driver.findElement(By.xpath("//input[@type=\"email\"]"));
//            email1.sendKeys("josephtroshni@gmail.com");
//           Thread.sleep(10000);
////            WebElement next = driver.findElement(By.xpath("(//input[@type=\"password\"]"));
//            email1.sendKeys(Keys.ENTER);

//             wait.until(ExpectedConditions.urlContains("https://accounts.google.com/v3/signin/challenge/pwd?TL=AG7eRGBeYEmRnZ1HjF_Ofqx9pvlS3O05JIQNJXkJ8A5CSwPkAih0oZ3Aq6NyLSXQ&checkConnection=youtube%3A405%3A0&checkedDomains=youtube&cid=1&continue=https%3A%2F%2Fconsole.cloud.google.com%2F&dsh=S655136271%3A1685885024078215&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Fconsole.cloud.google.com%2F&ifkv=Af_xneEiVnKCd1obE-eSEeA8brEFVMpcdOt3TR5OCIbYREFW0LO7o65ikEHcep8BA1LNdI-JTPU0&osid=1&pstMsg=1&service=cloudconsole"));
            WebElement password =  driver.findElement(By.xpath("//input[@type=\"password\"]"));
//
//            password.click();
           // Thread.sleep(2000);

            password.sendKeys("Roshni@123");
            password.sendKeys(Keys.ENTER);

            Thread.sleep(7000);


//            WebElement dropdown = driver.findElement(By.xpath("(//button[@type=\"button\"])[1]"));
//            dropdown.click();
//
//            Thread.sleep(5000);
//
//            WebElement rix = driver.findElement(By.xpath("//input[@id=\"mat-input-2\"]"));
//            rix.sendKeys("RixDemo");
//
//            Thread.sleep(5000);


//            WebElement rixMain = driver.findElement(By.xpath("//a[@jslog=\"92028\"]"));
//            rixMain.click();

            Thread.sleep(7000);


            WebElement search = driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]"));
            search.sendKeys("pub/sub");
            search.sendKeys(Keys.ENTER);

            Thread.sleep(5000);

            WebElement pubsub = driver.findElement(By.xpath("(//a[@rel=\"noopener\"])[4]"));
            pubsub.click();

            Thread.sleep(9000);

            WebElement topics = driver.findElement(By.xpath("(//span[@class=\"cfc-page-displayName\"])[1]"));
            topics.click();

            Thread.sleep(5000);

            WebElement topicRix = driver.findElement(By.xpath("(//a[@jslog=\"80948;track:generic_click\"])[1]"));
            topicRix.click();

            Thread.sleep(7000);


//            WebElement subscription = driver.findElement((By.xpath("(//span[@class=\"cfc-page-displayName\"])[2]")));
//            subscription.click();
//
//            Thread.sleep(5000);
//
//            WebElement subRix = driver.findElement(By.xpath("(//a[@rel=\"noopener\"])[13]"));
//            subRix.click();

            WebElement publishMsg = driver.findElement(By.xpath("(//span[@class=\"mdc-tab__text-label\"])[5]"));
            publishMsg.click();

            Thread.sleep(9000);

            WebElement messages = driver.findElement(By.xpath("//button[@id=\"_3rif_publish-message-btn\"]"));
            messages.click();

            Thread.sleep(5000);

            WebElement textMsg = driver.findElement(By.xpath("(//textarea[@formcontrolname=\"message\"])"));
            textMsg.sendKeys("Demo msg2");

            Thread.sleep(5000);

            WebElement finalPublish = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
            finalPublish.click();

            Thread.sleep(3000);

//            WebElement closePopUp = driver.findElement(By.xpath("//button[@id=\"_3rif_cfc-labelledby-message-goog_1243351855\"]"));
//            closePopUp.click();




//            Alert alert = driver.switchTo().alert();
//            String alertText = alert.getText();
//            alert.dismiss();




//            WebElement subscription = driver.findElement((By.xpath("(//span[@class=\"cfc-page-displayName\"])[2]")));
//            subscription.click();
//            Alert alert = driver.switchTo().alert();
//            String alertText = alert.getText();
//            alert.dismiss();

//            WebElement closePopUp = driver.findElement(By.xpath("(//button[@id="_3rif_cfc-labelledby-message-goog_779197592"])"));
//            closePopUp.click();

//            Thread.sleep(5000);

//            Select dropdown = new Select(driver.findElement(By.name("subscriptionPicker")));
//            dropdown.selectByIndex(0);

            WebElement subscription = driver.findElement((By.xpath("(//span[@class=\"cfc-page-displayName\"])[2]")));
            subscription.click();

            Thread.sleep(5000);

            WebElement rixSubMsg = driver.findElement(By.xpath("(//a[@jslog=\"80977;track:generic_click\"])[1]"));
            rixSubMsg.click();

            Thread.sleep(5000);

            WebElement subMsg = driver.findElement(By.xpath("(//span[@class=\"mdc-tab__text-label\"])[3]"));
            subMsg.click();

            Thread.sleep(3000);

            WebElement pull = driver.findElement(By.xpath("(//span[@class=\"mdc-button__label\"])[19]"));
            pull.click();

            Thread.sleep(2000);

//            Actions actions = new Actions(driver);
//            actions.moveToElement(driver.findElement(By.xpath("(//div[@class=\"cfc-pre-wrap cfc-break-word-wrap cfc-width-base ng-star-inserted\"])[1]"))).perform();

            String text = driver.findElement(By.xpath("(//div[@class=\"cfc-pre-wrap cfc-break-word-wrap cfc-width-base ng-star-inserted\"])[1]")).getText();

            System.out.println(text);
            Assert.assertEquals(text,"Demo msg2");



//            WebElement closePopUp = driver.findElement(By.xpath("(//span[@class=\"mat-mdc-button-persistent-ripple mdc-icon-button__ripple\"])[12]"));
//            closePopUp.click();



            Thread.sleep(5000);







            driver.close();

    }



}
