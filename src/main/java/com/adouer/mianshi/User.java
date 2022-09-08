package com.adouer.mianshi;

public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return this.id==user.id && this.name.equals(user.name);
    }
}
