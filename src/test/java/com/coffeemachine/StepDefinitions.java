package com.coffeemachine;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @When("^I start the coffee machine using language \"(.*)\"$")
    public void iStartTheCoffeeMachineUsingLanguageLang(String lang) {
        actionwords.iStartTheCoffeeMachineUsingLanguageLang(lang);
    }

    @When("^I shutdown the coffee machine$")
    public void iShutdownTheCoffeeMachine() {
        actionwords.iShutdownTheCoffeeMachine();
    }

    @Then("^message \"(.*)\" should be displayed$")
    public void messageMessageShouldBeDisplayed(String message) {
        actionwords.messageMessageShouldBeDisplayed(message);
    }

    @Then("^coffee should be served$")
    public void coffeeShouldBeServed() {
        actionwords.coffeeShouldBeServed();
    }

    @Then("^coffee should not be served$")
    public void coffeeShouldNotBeServed() {
        actionwords.coffeeShouldNotBeServed();
    }

    @When("^I take a coffee$")
    public void iTakeACoffee() {
        actionwords.iTakeACoffee();
    }

    @When("^I empty the coffee grounds$")
    public void iEmptyTheCoffeeGrounds() {
        actionwords.iEmptyTheCoffeeGrounds();
    }

    @When("^I fill the beans tank$")
    public void iFillTheBeansTank() {
        actionwords.iFillTheBeansTank();
    }

    @When("^I fill the water tank$")
    public void iFillTheWaterTank() {
        actionwords.iFillTheWaterTank();
    }

    @Given("^I take \"(.*)\" coffees$")
    public void iTakeCoffeeNumberCoffees(int coffeeNumber) {
        actionwords.iTakeCoffeeNumberCoffees(coffeeNumber);
    }

    @Given("^the coffee machine is started$")
    public void theCoffeeMachineIsStarted() {
        actionwords.theCoffeeMachineIsStarted();
    }

    @Given("^I handle everything except the water tank$")
    public void iHandleEverythingExceptTheWaterTank() {
        actionwords.iHandleEverythingExceptTheWaterTank();
    }

    @Given("^I handle water tank$")
    public void iHandleWaterTank() {
        actionwords.iHandleWaterTank();
    }

    @Given("^I handle beans$")
    public void iHandleBeans() {
        actionwords.iHandleBeans();
    }

    @Given("^I handle coffee grounds$")
    public void iHandleCoffeeGrounds() {
        actionwords.iHandleCoffeeGrounds();
    }

    @Given("^I handle everything except the beans$")
    public void iHandleEverythingExceptTheBeans() {
        actionwords.iHandleEverythingExceptTheBeans();
    }

    @Given("^I handle everything except the grounds$")
    public void iHandleEverythingExceptTheGrounds() {
        actionwords.iHandleEverythingExceptTheGrounds();
    }

    @Then("^displayed message is:$")
    public void displayedMessageIs(String freeText) {
        actionwords.displayedMessageIs(freeText);
    }

    @When("^I switch to settings mode$")
    public void iSwitchToSettingsMode() {
        actionwords.iSwitchToSettingsMode();
    }

    @Then("^settings should be:$")
    public void settingsShouldBe(DataTable datatable) {
        actionwords.settingsShouldBe(datatable);
    }
}