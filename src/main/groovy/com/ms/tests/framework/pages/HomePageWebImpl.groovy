package com.ms.tests.framework.pages

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class HomePageWebImpl extends BasePageObjectImpl implements HomePage, BasePageObject {

    @FindBy(id = "homefeatured")
    private WebElement homefeatured

    HomePageWebImpl(WebDriver driver){
        super(driver)
    }

    boolean isLoaded() {
        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete")
    }

    ProductPage pickFirstPopularProduct() {
        homefeatured.findElements(By.tagName("li")).first().click()
        new ProductPageWebImpl(driver)
    }

    ProductPage pickPopularProduct(int index) {
        homefeatured.findElements(By.tagName("li")).get(index).click()
        new ProductPageWebImpl(driver)
    }
}