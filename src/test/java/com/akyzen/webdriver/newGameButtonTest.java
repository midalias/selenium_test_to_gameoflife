/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akyzen.webdriver;

import java.util.List;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author midalias
 */
public class newGameButtonTest {
    
    public newGameButtonTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void newGameButtonClicTest() {
        //WebDriver driver = new FirefoxDriver();
        HtmlUnitDriver unitDriver = new HtmlUnitDriver();
        unitDriver.navigate().to("http://54.159.235.123:8080/game-of-life");
            
        WebElement newGameButton = unitDriver.findElement(By.linkText("New Game"));
        newGameButton.click();
        
        String strExpectedText = "Please seed your universe";
        
        
        WebElement element = unitDriver.findElement(By.id("seedUniverseDiv"));
        String strElementText  = element.getText();
        System.out.println("Instructions are: " + element.getText());
        Assert.assertEquals(strExpectedText, strElementText);
        
        unitDriver.close();  
    }    
}
