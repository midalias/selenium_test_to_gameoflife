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
import org.openqa.selenium.firefox.FirefoxDriver;

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
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://52.71.221.84:8080/game-of-life/"); //http://52.71.221.84:8080/game-of-life/
            
        WebElement newGameButton = driver.findElement(By.linkText("New Game"));
        newGameButton.click();
        
        String strExpectedText = "Please seed your universe";
        WebElement element = driver.findElement(By.id("seedUniverseDiv"));
        String strElementText  = element.getText();
        Assert.assertEquals(strExpectedText, strElementText);
        
        driver.close();  
    }    
}
