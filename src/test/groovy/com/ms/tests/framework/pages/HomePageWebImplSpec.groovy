package com.ms.tests.framework.pages

import com.ms.tests.BaseSpec

import java.lang.Void as TestCase

class HomePageWebImplSpec extends BaseSpec {

    TestCase "Is home page loaded"(){
        when:
        def homePage = new HomePageWebImpl(driver)

        then:
        homePage.isLoaded()
    }
}