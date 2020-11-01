package com.org.interviewProject;

import com.org.interviewProject.Component.Impls.ItemDetailsPageImpl;
import com.org.interviewProject.Component.Impls.ListingPageImpl;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MnytraItemSelection extends BaseTest {

    @Test
    @Parameters({"size"})
    public void selectItem(String size){
        ListingPageImpl listingPage = new ListingPageImpl(driver);
        listingPage.openBaseUrl();
        listingPage.seletItem(size);
        ItemDetailsPageImpl itemDetailsPage = new ItemDetailsPageImpl(driver);
        itemDetailsPage.selectSizeAndAddtoCart(size.toUpperCase());
    }
}
