package com.ms.tests

import io.github.bonigarcia.wdm.ChromeDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import spock.lang.Specification

class BaseSpec extends Specification{
    protected WebDriver driver

    def setup() {
        ChromeDriverManager.getInstance().setup()
        driver = new ChromeDriver()
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
        driver.manage().window().maximize()
        driver.get("http://automationpractice.com")
    }

    def cleanup() {
        driver.quit()
    }
}
