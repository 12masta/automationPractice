package com.ms.tests.e2e

import com.ms.tests.BaseSpec
import com.ms.tests.framework.pages.HomePageWebImpl
import spock.lang.Unroll

import java.lang.Void as TestCase

class HomePageWebImplSpec extends BaseSpec {

    TestCase "Is home page loaded"() {
        when:
        def homePage = new HomePageWebImpl(driver)

        then:
        homePage.isLoaded()
    }

    TestCase "product page is loaded when user choose first popular product"() {
        when:
        def productPage = new HomePageWebImpl(driver).pickFirstPopularProduct()

        then:
        productPage.isLoaded()
    }

    @Unroll
    TestCase "product page is loaded when user choose #index popular product"() {
        when:
        def productPage = new HomePageWebImpl(driver).pickPopularProduct(index)

        then:
        productPage.isLoaded()

        where:
        index << [0, 6]
    }
}