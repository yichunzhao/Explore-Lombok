package com.ynz.explorelombok.data;

import com.ynz.explorelombok.model.Cat;
import com.ynz.explorelombok.model.Dog;
import com.ynz.explorelombok.model.Name;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoDataBuilder {
    public static void main(String[] args) {
        Dog dog = Dog.builder().name(Name.of("dou")).weight(7).build();
        log.info(dog.toString());

        Cat cat = Cat.builder().name(Name.of("Tom")).weight(2.1D).build();
        log.info(cat.toString());
    }
}
