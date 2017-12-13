package com.ms.tests.framework.pages

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver

class ProductPageWebImpl extends BasePageObjectImpl implements ProductPage, BasePageObject {
    ProductPageWebImpl(WebDriver driver) {
        super(driver)
    }

    @Override
    boolean isLoaded() {
        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete")
    }
}
