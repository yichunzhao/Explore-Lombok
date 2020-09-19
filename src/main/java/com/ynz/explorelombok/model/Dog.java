package com.ynz.explorelombok.model;

import lombok.Builder;
import lombok.Data;

/**
 * If using Lombok @Data and @Builder together, all-args constructor(package level) is generated. however, the
 * non-argument constructor will be removed. For a POJO, it may cause a reflection error.
 * <p>
 * In a personal opinion, it is not a good idea to apply lombok on the entity besides getters and setters.
 */

@Data
@Builder
public class Dog {
    private Name name;
    private Integer weight;
}
