package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Page extends AbstractPage{

    public void initializeDriver() {
        Locale.setDefault(new Locale("en", "EN"));
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\lib\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 15);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public void clickLogin() throws InterruptedException {
        click(ObjeRepo.Giris);
        System.out.println("Clicked Giris");
    }

    public void typeEmailAndPassword(String username, String password) throws InterruptedException {
        control(isElementExist(ObjeRepo.LoginPage),"Login page exist","Login page  is not exist");
        sendKeys(ObjeRepo.Eposta,username);
        System.out.println("Typed Eposta");
        sendKeys(ObjeRepo.Password,password);
        System.out.println("Typed Password");
    }

    public void OturumAc() throws InterruptedException {
        click(ObjeRepo.OturumAc);
        System.out.println("Clicked OturumAc");
    }

    public void errorMessage(String errorMessage) throws InterruptedException {
        String errorMessageText=getTextOfElement(ObjeRepo.errorMessage);
        compareText(errorMessageText,errorMessage);
    }

    public void closeDriver() {
        driver.quit();
    }
}
