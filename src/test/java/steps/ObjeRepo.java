package steps;

import org.openqa.selenium.By;

public class ObjeRepo {
    public static final By Giris = By.xpath("//div[@id='page-header']/div/div[2]/div[1]");
    public static final By LoginPage = By.cssSelector("div[class='card-header text-center']");
    public static final By Eposta = By.id("exampleInputEmail1");
    public static final By Password = By.id("exampleInputPassword1");
    public static final By OturumAc = By.cssSelector("[name='loginForm'] button");
    public static final By errorMessage = By.cssSelector("div[class='input-warning']");


}
