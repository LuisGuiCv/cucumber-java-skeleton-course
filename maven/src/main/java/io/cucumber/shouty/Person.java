package io.cucumber.shouty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Data
public class Person {
    private List<String> messagesHeard=new ArrayList<>();
    public void moveTo(Integer distance) {
    }

    public void shout(String message) {
    }

    public void addMessageHeard(String message) {
        messagesHeard.add(message);
    }


}
