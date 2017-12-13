package com.ms.tests.framework.pages

import org.openqa.selenium.WebDriver

class HomePageWebImpl extends BasePageObjectImpl implements HomePage, BasePageObject {

    HomePageWebImpl(WebDriver driver){
        super(driver)
    }

    boolean isLoaded() {
        false
    }
}