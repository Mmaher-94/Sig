package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


public class D01_registerStepDef {
    P01_register register = new P01_register();
    @Given("user go to register page")
    public void goRegisterPage()
    {
        register.registerlink().click();


    }

   @When("user enters new valid registration data")
    public void enterValidRegDAta()
   {
       register.genderBtn().click();
       register.firstName().sendKeys("auto");
       register.lastName().sendKeys("test");
       register.email().sendKeys(register.randomEmail());
       register.password().sendKeys("P@ssw0rd");
       register.confirmPassword().sendKeys("P@ssw0rd");

   }

    @And("user click register button")
    public void clickRegister()
    {
        register.registerBtn().click();
    }
    @Then("register is successful")


    public void registerStatus()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(register.registerMsg() , register.successMsg);
        soft.assertEquals(register.registerMsgClr(),"#4cb17c");

    }








}