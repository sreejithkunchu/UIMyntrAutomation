package com.org.interviewProject.Component;

import org.openqa.selenium.By;

public interface ListingPage {

    By mytraIcon = By.xpath("//a[contains(@class,'myntraweb-sprite')]");
    By sizeIcon = By.xpath("//input[contains(@value,'size_facet')]");
    By sizeSelection = By.xpath("//label[text()='l']/input");
    By menuSelection = By.xpath("//div[@class='desktop-navLink']/a[contains(text(),'Men')]");
    By tshirtSelection = By.xpath("//a[text()='T-Shirts']");
    By selectItem = By.xpath("//div[contains(@class,'search-searchProductsContainer')]//picture");
}
