package io.cucumber.shouty;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {

    private Person lucy=new Person();
    private String storeMessage;
    @Given("Lucy is located {int} meters from Sean")
    public void lucy_is_located_meters_from_sean(Integer distance) {

        lucy.moveTo(distance);
    }
    @When("Sean shouts {string}")
    public void sean_shouts(String message) {
        storeMessage=message;
        lucy.addMessageHeard(message);
    }
    @Then("Lucy hears Sean's message")
    public void lucy_hears_sean_s_message() {
        System.out.println(lucy.getMessagesHeard());
        String message= lucy.getMessagesHeard()
                                      .stream()
                                      .filter(m->m.equals(storeMessage))
                                      .findFirst().get();
        Assertions.assertEquals(storeMessage,message);
    }

}
