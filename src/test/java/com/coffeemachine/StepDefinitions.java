package com.coffeemachine;

import cucumber.api.java.en.Given;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @Given("^I start the coffee machine \"(.*)\"$")
    public void iStartTheCoffeeMachine(String lang) {
        actionwords.iStartTheCoffeeMachine(lang);
    }

    @Given("^I shutdown the coffee machine$")
    public void iShutdownTheCoffeeMachine() {
        actionwords.iShutdownTheCoffeeMachine();
    }

    @Given("^message \"(.*)\" should be displayed$")
    public void messageMessageShouldBeDisplayed(String message) {
        actionwords.messageMessageShouldBeDisplayed(message);
    }

    @Given("^coffee should be served$")
    public void coffeeShouldBeServed() {
        actionwords.coffeeShouldBeServed();
    }

    @Given("^coffee should not be served$")
    public void coffeeShouldNotBeServed() {
        actionwords.coffeeShouldNotBeServed();
    }

    @Given("^I take a coffee$")
    public void iTakeACoffee() {
        actionwords.iTakeACoffee();
    }

    @Given("^I empty the coffee grounds$")
    public void iEmptyTheCoffeeGrounds() {
        actionwords.iEmptyTheCoffeeGrounds();
    }

    @Given("^I fill the beans tank$")
    public void iFillTheBeansTank() {
        actionwords.iFillTheBeansTank();
    }

    @Given("^I fill the water tank$")
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

    @Given("^fifty coffees have been taken without filling the tank$")
    public void fiftyCoffeesHaveBeenTakenWithoutFillingTheTank() {
        actionwords.fiftyCoffeesHaveBeenTakenWithoutFillingTheTank();
    }

    @Given("^thirty eight coffees are taken without filling beans$")
    public void thirtyEightCoffeesAreTakenWithoutFillingBeans() {
        actionwords.thirtyEightCoffeesAreTakenWithoutFillingBeans();
    }
}