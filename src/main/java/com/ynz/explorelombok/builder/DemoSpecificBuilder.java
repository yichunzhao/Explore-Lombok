package com.ynz.explorelombok.builder;


import lombok.Builder;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Builder with specific fields
 */

@ToString
class Project {
    private Integer id;
    private String title;
    private String description;

    @Builder
    public Project(String title, String description) {
        this.title = title;
        this.description = description;
    }
}

@Slf4j
class DemoSpecificBuilder {

    public static void main(String[] args) {
        Project project = Project.builder().description("blabla").title("lalala").build();
        log.info(project.toString());
    }
}
