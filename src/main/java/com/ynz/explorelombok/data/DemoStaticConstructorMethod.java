package com.ynz.explorelombok.data;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * <H3>Data static constructor </H3>
 * Define a static factory Method 'create', meanwhile the non-argument constructor will become private. It forces
 * users to use static factory method to create instance. It only creates instances with non-argument.
 */
@Data
class Car {
    private String brand;
    private String color;
    private int numOfDoors;

    private Car() {
    }

    public static Car create() {
        return new Car();
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Car;
    }

}

@Slf4j
public class DemoStaticConstructorMethod {
    public static void main(String[] args) {
        Car created = Car.create();
        created.setBrand("Audi");
        created.setBrand("Black");
        created.setNumOfDoors(4);
        log.info(created.toString());
    }
}
