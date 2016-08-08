/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akyzen.webdriver;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 *
 * @author midalias
 */
public class titleTest {
    
    @Test
    public void titleNameTest() {
        // Declaring and initialising the HtmlUnitWebDriver
        HtmlUnitDriver unitDriver = new HtmlUnitDriver();
        unitDriver.navigate().to("http://52.71.221.84:8080/game-of-life/");
        
        Assert.assertTrue("title should start differently", 
                                                unitDriver.getTitle().startsWith("The Game Of Life"));

        System.out.println("Title is: " + unitDriver.getTitle());
        unitDriver.close();
    }
}
