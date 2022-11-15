package org.example.pages;

//import com.automation.step_definitions.Hooks;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class P01_register {
    public String successMsg = "Your registration completed" ;
    public String registerActMsg ;
    public String regMsgClr ;

    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement genderBtn(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }

   public WebElement firstName()
   {
       return Hooks.driver.findElement(By.id("FirstName"));
   }
    public WebElement lastName()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerBtn()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public String registerMsg()
    {
        registerActMsg = Hooks.driver.findElement(By.className("result")).getText();
        return registerActMsg ;
    }
    public String registerMsgClr()
    {
        regMsgClr = Hooks.driver.findElement(By.className("result")).getCssValue("color");
        return regMsgClr ;
    }
    public String randomEmail() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString()+"@gmail.com";
        return saltStr;

    }


}