package com.ynz.explorelombok.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Name {
    private String name;

    public static Name of(String name) {
        return new Name(name);
    }
}
