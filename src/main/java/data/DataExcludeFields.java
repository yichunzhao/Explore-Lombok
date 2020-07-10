package data;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
class User {
    @Setter(value = AccessLevel.NONE)
    protected Long id;

    protected String name;

    protected boolean active;

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
