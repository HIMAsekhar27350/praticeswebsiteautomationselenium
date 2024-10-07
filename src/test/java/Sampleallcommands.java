import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sampleallcommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(100,500)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='commonWebElements']/p[1]")).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(100,400)");
        driver.findElement(By.id("fname")).sendKeys("Hi Hello");
        Thread.sleep(2000);
        driver.findElement(By.id("idOfButton")).click();
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        WebElement double_click = driver.findElement(By.id("dblClkBtn"));
        act.doubleClick(double_click);
        act.perform();
        Thread.sleep(2000);
        Alert a =driver.switchTo().alert();
        a.accept();
        js.executeScript("window.scrollBy(30,100)");
        driver.findElement(By.id("male")).click();
        driver.findElement(By.xpath("//input[@class='Automation']")).click();
        js.executeScript("window.scrollBy(100,400)");
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='testingDropdown']"));
        Select s = new Select(dropdown);
        s.selectByIndex(2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
        a.accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();
        a.dismiss();
        js.executeScript("window.scrollBy(100,400)");
        WebElement drag = driver.findElement(By.id("myImage"));
        WebElement drop = driver.findElement(By.id("targetDiv"));
        act.dragAndDrop(drag,drop);
        act.perform();
        Thread.sleep(3000);
        driver.close();
    }
}
