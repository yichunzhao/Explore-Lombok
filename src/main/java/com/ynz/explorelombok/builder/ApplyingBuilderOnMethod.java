package com.ynz.explorelombok.builder;

import lombok.Builder;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * @Builder on the method; static factory method.
 */
@ToString
class Ship {
    private String name;
    private Integer tonnage;
    private Integer length;

    public Ship(String name, Integer tonnage, Integer length) {
        this.name = name;
        this.tonnage = tonnage;
        this.length = length;
    }

    @Builder
    public static Ship createInstance(String name, Integer tonnage, Integer length) {
        return new Ship(name, tonnage, length);
    }
}

@Slf4j
public class ApplyingBuilderOnMethod {

    public static void main(String[] args) {
        Ship ship = Ship.builder().length(120).name("xxx").tonnage(3000).build();
        log.info(ship.toString());
    }
}
