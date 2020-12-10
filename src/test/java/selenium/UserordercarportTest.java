/*
 * Copyright (c) 2020. Team CoderGram
 *
 * @author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 * @author Sigurd Arik Twena Nielsen (cph-at89@cphbusiness.dk)
 * @author Jacob Lange Nielsen (cph-jn352@cphbusiness.dk)
 */

package selenium; // Generated by Selenium IDE

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserordercarportTest {
  private WebDriver driver;
  private static final String OS = System.getProperty("os.name").toLowerCase();
  JavascriptExecutor js;

  @Before
  public void setUp() {
    String path = "src/test/resources/geckodriver";

    if (OS.contains("win")) path += ".exe";

    File file = new File(path);
    System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());

    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
  }

  @After
  public void tearDown() {
    driver.quit();
  }

//  @Test
//  public void userordercarport() {
//    driver.get("http://localhost:8080//fog");
//    driver.findElement(By.linkText("Byg din carport")).click();
//    {
//      WebElement dropdown = driver.findElement(By.id("length"));
//      dropdown.findElement(By.xpath("//option[. = '680']")).click();
//    }
//    driver.findElement(By.cssSelector("#length > option:nth-child(11)")).click();
//    {
//      WebElement dropdown = driver.findElement(By.id("width"));
//      dropdown.findElement(By.xpath("//option[. = '390']")).click();
//    }
//    driver.findElement(By.cssSelector("#width > option:nth-child(10)")).click();
//    driver.findElement(By.cssSelector(".custom-control-label")).click();
//    {
//      WebElement dropdown = driver.findElement(By.id("shedSize"));
//      dropdown.findElement(By.xpath("//option[. = 'Halv bredde']")).click();
//    }
//    driver.findElement(By.cssSelector("#shedSize > option:nth-child(2)")).click();
//    driver.findElement(By.cssSelector(".btn-success")).click();
//    driver.findElement(By.id("name")).click();
//    driver.findElement(By.id("name")).sendKeys("Test bruger");
//    driver.findElement(By.id("email")).sendKeys("test@bruger.dk");
//    driver.findElement(By.id("address")).sendKeys("Testvej 1234");
//    driver.findElement(By.id("zip")).sendKeys("1234");
//    driver.findElement(By.id("city")).sendKeys("Testby");
//    driver.findElement(By.id("phone")).sendKeys("12345678");
//    driver.findElement(By.cssSelector(".btn-primary")).click();
//    assertThat(
//        driver.findElement(By.cssSelector(".mb-4")).getText(),
//        is("Tusinde tak for din forespørgelse!"));
//  }
}
