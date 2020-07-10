package data;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
class User {
    //ignore a setter for a field
    @Setter(value = AccessLevel.NONE)
    protected Long id;

    protected String name;

    @Getter(value = AccessLevel.NONE)
    protected boolean active;

    //ignore a field
    @ToString.Exclude
    private String role;
}

@Slf4j
public class DataExcludeFields {

    public static void main(String[] args) {
        User user = new User();
        user.setActive(true);
        user.setName("bla");
        user.setRole("Admin");

        log.info(user.toString());
    }
}
