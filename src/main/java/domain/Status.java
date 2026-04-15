package domain;

import domain.enums.UserEnum;

public class Status {

    private final Integer id;
    private UserEnum name;

    public Status(Integer id, UserEnum name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public UserEnum getName() {
        return name;
    }
}
