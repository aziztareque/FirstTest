package homePage;
import common.WebAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homePage.HomePageWebElement.*;


public class HomePage extends WebAPI {


    // Action Method class

    // Find By Annotation: First Approach
    @FindBy (how = How.ID, using =searchBoxLocator ) public WebElement searchBox;
    @FindBy (how = How.ID, using =searchButtonLocator ) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;

    // Action Method
    public void searchBox() throws InterruptedException {
        // Enter productName
        searchBox.sendKeys(productName);
        Thread.sleep(3000);
        // Click on searchButton
        searchButton.click();
    }


    public void searchBox1(){
        typeOnElement(searchBoxLocator,"Hand Sanitizer");
        clickOnElement(searchButtonLocator);
    }



    // Action method

    // ******Find by Annotation First approach******
    // : @FindBy (How = How.id, using = ex:searchBoxLocator) public WebElement ex:searchBox;
    // : @FindBy (How = How.id, using = ex:searchButtonLocator) public WebElement ex:searchButton;


    // ******Find BY Annotation second approach***********
    // :@FindBy (id = ex:searchBoxLocator) public WebElement ex:searchBox;


    //*********Third Approach*************
    // Getter Setter
    // public WebElement getSearchBox(){
    //           return searchBox;
    // }
    // public WebElement setSearchBox(){
    //          this.searchBox = searchBox;
    // }



}
