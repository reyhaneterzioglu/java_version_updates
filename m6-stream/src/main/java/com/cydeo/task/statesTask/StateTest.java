package com.cydeo.task.statesTask;

import java.util.ArrayList;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State state1 = new State();

        state1.addCity("houston");
        state1.addCity("richmond");

        List<State> list = new ArrayList<>();
        list.add(state1);

        list.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
