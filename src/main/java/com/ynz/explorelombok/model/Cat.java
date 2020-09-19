package com.ynz.explorelombok.model;

import lombok.Builder;
import lombok.Data;

/**
 * using @Data and @Builder together, it generates a default level all-arguments constructor. It doesn't expose itself
 * outside this package, so forcing external users to use builder to build a new instance.
 */
@Data
@Builder
public class Cat {
    private Name name;
    private double weight;
}
