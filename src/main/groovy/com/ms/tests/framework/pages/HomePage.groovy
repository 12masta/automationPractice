package com.ms.tests.framework.pages

interface HomePage {
    boolean isLoaded()

    ProductPage pickFirstPopularProduct()

    ProductPage pickPopularProduct(int index)
}