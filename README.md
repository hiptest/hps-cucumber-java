# hps-cucumber-java

[![Build Status](https://travis-ci.org/hiptest/hps-cucumber-java.svg?branch=master)](https://travis-ci.org/hiptest/hps-cucumber-java)

Hiptest publisher samples with Cucumber/Java

In this repository you'll find tests generated in Cucumber/Java format from [Hiptest](https://hiptest.com), using [Hiptest publisher](https://github.com/hiptest/hiptest-publisher).

The goals are:

 * to show how tests are exported in Cucumber/Java.
 * to check exports work out of the box (well, with implemented actionwords)

System under test
------------------

The SUT is a (not that much) simple coffee machine. You start it, you ask for a coffee and you get it, sometimes. But most of times you have to add water or beans, empty the grounds. You have an automatic expresso machine at work or at home? So you know how it goes :-)

Update tests
-------------


To update the tests:

    "hiptest-publisher -c cucumber-java.conf --only=features,step_definitions"

The tests are generated in [``src/main/test/java/com/coffeemachine``](https://github.com/hiptest/hps-cucumber-java/tree/master/src/test/java/com/coffeemachine)

Run tests
---------


To build the project and run the tests, use the following command:

    mvn test

The SUT implementation can be seen in [``src/main/java/com/coffeemachine/CoffeeMachine.java``](https://github.com/hiptest/hps-cucumber-java/blob/master/src/main/java/com/coffeemachine/CoffeeMachine.java)

The test report is generated in ```target/cuke-results.json```
