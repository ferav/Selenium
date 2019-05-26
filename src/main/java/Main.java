import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver","C:\\geckoDriver\\geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://hipertextual.com/");
        System.out.println("Hello World!");
    }
}
