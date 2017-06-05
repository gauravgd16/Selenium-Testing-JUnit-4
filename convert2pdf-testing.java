package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Doc2pdf {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://online2pdf.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDoc2pdf() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("identifierId")).click();
    driver.findElement(By.id("identifierId")).clear();
    driver.findElement(By.id("identifierId")).sendKeys("gauravelte2016");
    driver.findElement(By.cssSelector("div.ZFr60d.CeoRYc")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("iamtooicey");
    driver.findElement(By.cssSelector("content.CwaK9")).click();
    driver.findElement(By.id("XPxXbf")).clear();
    driver.findElement(By.id("XPxXbf")).sendKeys("It is a very cool website for converting docs to pdfs.");
    driver.findElement(By.xpath("//body[@id='yDmH0d']/c-wiz/div[4]/div/c-wiz/c-wiz/content/div[2]/div[4]/content/span")).click();
    driver.findElement(By.cssSelector("span.gb_8a.gbii")).click();
    driver.findElement(By.id("gb_71")).click();
    driver.findElement(By.linkText("Documentation of all features")).click();
    driver.findElement(By.linkText("PDF-Converter")).click();
    driver.findElement(By.id("input_file0")).clear();
    driver.findElement(By.id("input_file0")).sendKeys("C:\\Users\\user\\Desktop\\Application.docx");
    driver.findElement(By.id("input_file1")).click();
    driver.findElement(By.id("input_file1")).clear();
    driver.findElement(By.id("input_file1")).sendKeys("C:\\Users\\user\\Desktop\\Application.docx");
    new Select(driver.findElement(By.id("conversion_mode_multiple_pdf"))).selectByVisibleText("Convert files separately");
    driver.findElement(By.cssSelector("#conversion_mode_multiple_pdf > option[value=\"single\"]")).click();
    driver.findElement(By.id("pref_menu_element_1")).click();
    new Select(driver.findElement(By.name("quality"))).selectByVisibleText("70%");
    new Select(driver.findElement(By.name("resolution"))).selectByVisibleText("200 dpi");
    new Select(driver.findElement(By.name("color"))).selectByVisibleText("Black-and-White (gray scale)");
    driver.findElement(By.id("pref_menu_element_2")).click();
    new Select(driver.findElement(By.name("view_zoom"))).selectByVisibleText("100% (Original size)");
    new Select(driver.findElement(By.name("view_layout"))).selectByVisibleText("Single-page-view");
    new Select(driver.findElement(By.name("bookmarks"))).selectByVisibleText("Remove bookmarks");
    driver.findElement(By.id("pref_menu_element_4")).click();
    driver.findElement(By.id("sec_copy")).click();
    driver.findElement(By.id("sec_modify")).click();
    driver.findElement(By.id("sec_print")).click();
    driver.findElement(By.id("pref_menu_element_5")).click();
    driver.findElement(By.xpath("(//div[@onclick='insert_page_numbering(this)'])[5]")).click();
    driver.findElement(By.xpath("(//div[@onclick='insert_page_numbering(this)'])[5]")).click();
    driver.findElement(By.xpath("(//div[@onclick='insert_page_numbering(this)'])[5]")).click();
    driver.findElement(By.xpath("(//div[@onclick='insert_page_numbering(this)'])[5]")).click();
    driver.findElement(By.xpath("(//div[@onclick='insert_page_numbering(this)'])[5]")).click();
    driver.findElement(By.xpath("(//div[@onclick='insert_page_numbering(this)'])[5]")).click();
    driver.findElement(By.name("page_numbering_start_value")).clear();
    driver.findElement(By.name("page_numbering_start_value")).sendKeys("0");
    driver.findElement(By.id("overlap_edges")).click();
    driver.findElement(By.id("pref_menu_element_7")).click();
    new Select(driver.findElement(By.name("layout_mode"))).selectByVisibleText("2 pages per sheet");
    new Select(driver.findElement(By.name("layout_outer_margin"))).selectByVisibleText("10 mm");
    new Select(driver.findElement(By.name("layout_inner_margin"))).selectByVisibleText("10 mm");
    driver.findElement(By.cssSelector("button.convert_button")).click();
    driver.findElement(By.linkText("Features / Help")).click();
    driver.findElement(By.linkText("FAQ / Problems")).click();
    driver.findElement(By.linkText("Support project")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.linkText("Feedback")).click();
    driver.findElement(By.id("rating_1")).click();
    driver.findElement(By.name("comment")).clear();
    driver.findElement(By.name("comment")).sendKeys("This is a very cool website for converting doc to pdf.");
    driver.findElement(By.name("mail")).clear();
    driver.findElement(By.name("mail")).sendKeys("gauravelte2016@gmail.com");
    driver.findElement(By.cssSelector("input.button_feedback_send")).click();
    driver.findElement(By.linkText("Contact")).click();
    driver.findElement(By.cssSelector("img[alt=\"Google+\"]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
