package com.ms.tests.framework.pages

import com.ms.tests.BaseSpec

class HomePageWebImplSpec extends BaseSpec {

    def "asd"(){
        when:
        def homePage = new HomePageWebImpl(driver)

        then:
        homePage.isLoaded()
    }
}
