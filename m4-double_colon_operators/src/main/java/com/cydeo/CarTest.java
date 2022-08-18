package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        // zero args constructor

        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        // one argument constructor

        Function<Integer, Car> f1 = model -> new Car(model);
        Function<Integer, Car> f2 = Car::new; // new keyword calls the constructor ( and creates the object )

        // two argument constructor

        BiFunction<String, Integer, Car> f3 = (model, make) -> new Car(model, make);
        BiFunction<String, Integer, Car> f4 = Car::new;
        Car honda = f4.apply("honda", 2015);

        System.out.println(honda.getMake() + " " + honda.getModel());


    }
}
