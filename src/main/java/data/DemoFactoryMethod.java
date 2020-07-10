package data;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * create a factory Method
 */
@Data(staticConstructor = "create")
class Car{
    private String brand;
    private String color;
    private int numOfDoors;
}

@Slf4j
public class DemoFactoryMethod {
    public static void main(String[] args) {
        Car created  = Car.create();
        log.info(created.toString());

    }
}
