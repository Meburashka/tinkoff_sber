package sber.tin.koff.appmanager;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import sber.tin.koff.model.ErrorHelper;
import sber.tin.koff.model.PayHCSHelper;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {
  private final ProviderHelper providerHelper = new ProviderHelper();
  private final PayHCSHelper payHCSHelper = new PayHCSHelper();
  private final NavigationHelper navigationHelper = new NavigationHelper();
  private ErrorHelper errorHelper = new ErrorHelper();

  /**
   * Метод разворачивает браузер на весь экран,
   * убирает в настройках браузера оповещения,
   * переходит на сайт "https://www.tinkoff.ru/"
   */
  public void init() {
    Map<String, Object> prefs = new HashMap<String, Object>();
    prefs.put("profile.default_content_setting_values.notifications", 2);
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    options.setExperimentalOption("prefs", prefs);
    WebDriver driverChrome = new ChromeDriver(options);
    WebDriverRunner.setWebDriver(driverChrome);
    open("https://www.tinkoff.ru/");
  }

  /**
   * Метод закрывает браузер
   */
  public void stop() {
    close();
  }

  public ErrorHelper getErrorHelper() {
    return errorHelper;
  }

  public ProviderHelper getProviderHelper() {
    return providerHelper;
  }

  public PayHCSHelper getPayHCSHelper() {
    return payHCSHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}