package com.coffeemachine;

import cucumber.api.java.en.*;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @When("^I start the coffee machine \"(.*)\"$")
    public void iStartTheCoffeeMachine(String lang) {
        actionwords.iStartTheCoffeeMachine(lang);
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

    @Given("^I empty the coffee grounds$")
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

    @When("^I take \"(.*)\" coffees$")
    public void iTakeCoffeeNumberCoffees(int coffeeNumber) {
        actionwords.iTakeCoffeeNumberCoffees(coffeeNumber);
    }

    @Given("^the coffee machine is started$")
    public void theCoffeeMachineIsStarted() {
        actionwords.theCoffeeMachineIsStarted();
    }

    @When("^fifty coffees have been taken without filling the tank$")
    public void fiftyCoffeesHaveBeenTakenWithoutFillingTheTank() {
        actionwords.fiftyCoffeesHaveBeenTakenWithoutFillingTheTank();
    }

    @When("^thirty eight coffees are taken without filling beans$")
    public void thirtyEightCoffeesAreTakenWithoutFillingBeans() {
        actionwords.thirtyEightCoffeesAreTakenWithoutFillingBeans();
    }
}