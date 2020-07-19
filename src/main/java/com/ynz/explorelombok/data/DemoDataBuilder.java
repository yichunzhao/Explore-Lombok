package com.ynz.explorelombok.data;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * If using Lombok @Data and @Builder together, all-args constructor(package level) is generated.
 *
 * Without adding AllArgument annotation.
 */

@Data
@Builder
class Dog {
    private String name;
    private Integer weight;
}

@Slf4j
public class DemoDataBuilder {
    public static void main(String[] args) {
        Dog dog = Dog.builder().name("dou").weight(7).build();
        log.info(dog.toString());
    }
}
