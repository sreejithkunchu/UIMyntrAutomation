package com.org.interviewProject.Component;

import org.openqa.selenium.By;

public interface ItemDetailsPage {

    By selectSize = By.xpath("//button[contains(@class,'size-buttons-size-button')]/p[text()='L']");
    By addToCart = By.xpath("//div[contains(text(),'ADD TO BAG')]");
}
