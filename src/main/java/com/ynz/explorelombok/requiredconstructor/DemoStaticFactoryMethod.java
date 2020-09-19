package com.ynz.explorelombok.requiredconstructor;

import com.ynz.explorelombok.model.Gender;
import com.ynz.explorelombok.model.Name;
import com.ynz.explorelombok.model.Person;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class DemoStaticFactoryMethod {
    public static void main(String[] args) {

        log.info(Person.of(Name.of("Mike"), Gender.MALE).toString());

    }
}
