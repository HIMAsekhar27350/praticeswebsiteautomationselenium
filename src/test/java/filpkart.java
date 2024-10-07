import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class filpkart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Actions act = new Actions(driver);
        WebElement hover = driver.findElement(By.xpath("//span[text()='Fashion']"));
        act.moveToElement(hover);
        //Thread.sleep(3000);
        act.build().perform();
        //Thread.sleep(3000);
        List<WebElement>fashion_men_top_wear = driver.findElements(By.xpath("//div[@class='_16rZTH']/object/a"));
        System.out.println("Total = "+fashion_men_top_wear.size());
        int n = 1;
        for (WebElement w: fashion_men_top_wear){
            System.out.println(n+" . "+w.getText()+"--->"+w.getAttribute("href"));
            n++;
        }
        List<WebElement>fashion_men_top_wear_in =driver.findElements(By.xpath("//div[@class='_31z7R_']//object//a"));
        System.out.println("----------fashion_men_top_wear------------");
        System.out.println("Total = "+fashion_men_top_wear_in.size());
        int n1=1;
        for (WebElement w1:fashion_men_top_wear_in){
            System.out.println(n1+" . "+w1.getText()+"--->"+w1.getAttribute("href"));
            n1++;
        }
        WebElement hover1 = driver.findElement(By.xpath("//a[@class='_1BJVlg']"));
        act.moveToElement(hover1);
        act.build().perform();
        Thread.sleep(3000);
        List<WebElement>fashion_men_bottom_wear_in =driver.findElements(By.xpath("//div[@class='_31z7R_']/object/a"));
        System.out.println("--------------------fashion_men_bottom_wear_in----------------");
        System.out.println("Total = "+fashion_men_bottom_wear_in.size());
        int n2=1;
        for (WebElement w1:fashion_men_bottom_wear_in){
            System.out.println(n2+" . "+w1.getText()+"--->"+w1.getAttribute("href"));
            n2++;
        }
        WebElement hover2 = driver.findElement(By.xpath("//div[@class='_16rZTH']//a[3]"));
        act.moveToElement(hover2);
        act.build().perform();
        //Thread.sleep(3000);
        List<WebElement>fashion_woman_ethnic_in =driver.findElements(By.xpath("//div[@class='_31z7R_']/object/a"));
        System.out.println("---------------fashion_woman_ethnic_in------------");
        System.out.println("Total = "+fashion_woman_ethnic_in.size());
        int n3=1;
        for (WebElement w1:fashion_woman_ethnic_in) {
            System.out.println(n3 + " . " + w1.getText() + "--->" + w1.getAttribute("href"));
            n3++;
        }
        WebElement hover3 = driver.findElement(By.xpath("//div[@class='_16rZTH']//a[4]"));
        act.moveToElement(hover3);
        act.build().perform();
        //Thread.sleep(3000);
        List<WebElement>fashion_men_footwear_in =driver.findElements(By.xpath("//div[@class='_31z7R_']/object/a"));
        System.out.println("------------fashion_men_footwear_in-----------");
        System.out.println("Total = "+fashion_men_footwear_in.size());
        int n4=1;
        for (WebElement w1:fashion_men_footwear_in) {
            System.out.println(n4 + " . " + w1.getText() + "--->" + w1.getAttribute("href"));
            n4++;
        }
        WebElement hover4 = driver.findElement(By.xpath("//div[@class='_16rZTH']//a[5]"));
        act.moveToElement(hover4);
        act.build().perform();
        //Thread.sleep(3000);
        List<WebElement>fashion_women_footwear_in =driver.findElements(By.xpath("//div[@class='_31z7R_']/object/a"));
        System.out.println("------------------fashion_women_footwear_in-------------");
        System.out.println("Total = "+fashion_women_footwear_in.size());
        int n5=1;
        for (WebElement w1:fashion_women_footwear_in) {
            System.out.println(n5 + " . " + w1.getText() + "--->" + w1.getAttribute("href"));
            n5++;
        }
        driver.close();
    }
}
