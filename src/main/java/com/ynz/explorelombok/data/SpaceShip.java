package com.ynz.explorelombok.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SpaceShip {
    private Integer id;
    private String name;
}
