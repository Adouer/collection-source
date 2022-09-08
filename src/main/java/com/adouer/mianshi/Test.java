package com.adouer.mianshi;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        User user1 = new User(1, "张三");
        User user2 = new User(1, "张三");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));

        HashMap map = new HashMap<String, String>();
    }
}
