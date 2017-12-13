package com.ms.tests.framework.pages

import org.openqa.selenium.WebDriver

class ProductPageWebImpl implements ProductPage {
    ProductPageWebImpl(WebDriver driver) {
        super(driver)
    }

    @Override
    boolean isLoaded() {
        return false
    }
}
