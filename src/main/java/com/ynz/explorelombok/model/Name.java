package com.ynz.explorelombok.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Value objects
 */
@RequiredArgsConstructor(staticName = "of")
@ToString
public class Name {
    @NonNull
    private String name;
}
