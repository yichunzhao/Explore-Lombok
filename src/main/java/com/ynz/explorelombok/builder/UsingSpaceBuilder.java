package com.ynz.explorelombok.builder;


import com.ynz.explorelombok.data.SpaceShip;
import lombok.extern.slf4j.Slf4j;

/**
 * @Builder and @Data together Generated protected all-args, which can be accessed only within the package.
 */

@Slf4j
public class UsingSpaceBuilder {
    public static void main(String[] args) {
        SpaceShip spaceShip = SpaceShip.builder().id(10).name("startLink").build();
        log.info(spaceShip.toString());
    }
}
