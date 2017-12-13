package com.ms.tests.framework.pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory

class BasePageObjectImpl implements BasePageObject {
    protected WebDriver driver

    BasePageObjectImpl(WebDriver driver) {
        this.driver = driver
        PageFactory.initElements(driver, this)
    }
}