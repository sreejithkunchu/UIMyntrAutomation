# UIMyntrAutomation

How to run:in BaseTest.class please change the below line to your Chromedrive path
System.setProperty("webdriver.chrome.driver","/Users/sreejithkunchu/Documents/chromedriver");

I have created a testng xml file "ItemSelection.xml"  we have to run this xml file to execute our scenario 
maven command to run that is 
mvn clean install -DskipTests -U
mvn clean test -DsuiteXmlFile=ItemSelection.xml
