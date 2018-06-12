package auto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class method1 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver cdriver = new ChromeDriver();
        cdriver.navigate().to("http://www.gmail.com");
        WebElement page = cdriver.findElement(By.tagName("html"));
        try {
            Thread.sleep(3000);

        }catch (Exception e){

        }
        while (!(page.isDisplayed())){
            cdriver.navigate().refresh();
            try {
                Thread.sleep(3000);

            }catch (Exception e){

            }
            page = cdriver.findElement(By.tagName("html"));
        }
        WebElement email = ((ChromeDriver) cdriver).findElementById("identifierId");
        email.sendKeys("seliniumautomater");
        WebElement next = ((ChromeDriver) cdriver).findElementById("identifierNext");
        next.click();
        try {
            Thread.sleep(3000);

        }catch (Exception e){

        }
        WebElement password = ((ChromeDriver) cdriver).findElementByXPath(".//*[@id='password']/div[1]/div/div[1]/input");
        password.sendKeys("Satellite");
        WebElement enter = ((ChromeDriver) cdriver).findElementByXPath(".//*[@id=\'passwordNext\']/content/span");
        enter.click();
        try {
            Thread.sleep(3000);

        }catch (Exception e){

        }
        WebElement inbox = ((ChromeDriver) cdriver).findElementByClassName("n0");
        String num = inbox.getText();
        System.out.println(num);

    }

}
