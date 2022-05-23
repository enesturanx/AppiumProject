import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

import java.time.Duration;

public class BaseStep extends BaseTest{

    @Step("<second> kadar bekle")
    public void waitForsecond(int second) throws InterruptedException {
        Thread.sleep(1000*second);
    }
    @Step("<Key> İd'li elemente tıkla")
    public void clickElementByid(String Key){
        appiumDriver.findElement(By.id(Key)).click();
        System.out.println(Key+"Elenitine tıklandı");
    }


    @Step("<Key> İd'li elemente <keywordc> değerini yaz")
    public void SendkeyElementByid(String Key,String keywordc){
        appiumDriver.findElement(By.id(Key)).sendKeys(keywordc);
        System.out.println(Key+"Elenitine tıklandı");

    }
    @Step("<Key> xpath'li elemente tıkla")
    public void clickElementByxpath(String Key){
        appiumDriver.findElement(By.xpath(Key)).click();
        System.out.println(Key+"Elenitine tıklandı");
    }
    @Step("<Key> xpath'li elemente <keywordc> değerini yaz")
    public void SendkeyElementByxpath(String Key,String keywordc){
        appiumDriver.findElement(By.xpath(Key)).sendKeys(keywordc);
        System.out.println(Key+"Elenitine tıklandı");

    }

    @Step("Random ürün seç")
    public void randomProduct(){
        Random rand = new Random();
        int min=1;
        int max=4;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        appiumDriver.findElement(By.xpath("//*[@class='androidx.cardview.widget.CardView']["+randomNum+"]")).click();

    }

    @Step("Sayfayı kaydır")
    public void swipePage(){
        for(int i=0; i<2;i++) {
            PointOption option, moveOption;
            option = PointOption.point(appiumDriver.manage().window().getSize().width / 2, appiumDriver.manage().window().getSize().height / 2);
            moveOption = PointOption.point(appiumDriver.manage().window().getSize().width / 2, -10);
            TouchAction action = new TouchAction(appiumDriver).longPress(option).moveTo(moveOption).release();
            action.perform();
        }
    }


    @Step("<path> Element xpath ile Test Kontrolü")
    public void testControlByxpath(String path){
        Assert.assertTrue("Test Başarısız.",appiumDriver.findElement(By.xpath(path)).isDisplayed());
    }

    @Step("<path> Element Id ile Test Kontrolü")
    public void testControlById(String path){
        Assert.assertTrue("Test Başarısız.",appiumDriver.findElement(By.id(path)).isDisplayed());
    }


}
