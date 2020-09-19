package com.ynz.explorelombok.model;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * <h3>create a static factory method</h3>
 * <p>
 * it generates a private constructor with arguments for each NonNull field, un-initialized final;
 * it generates a public static factory method to wrap this private constructor.
 */

@RequiredArgsConstructor(staticName = "of")
@ToString
@EqualsAndHashCode
public class Person {
    @NonNull
    private Name name;
    @NonNull
    private Gender gender;
}
