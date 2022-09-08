package com.adouer.arraylist;

import java.util.ArrayList;

/**
 * 测试 扩容缩容
 * @author adouer
 */
public class TestAddRemove {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        /*测试添加*/
        strings.add("a");
        strings.add("b");
        strings.add("a");
        strings.add("a");
        System.out.println("添加："+strings);
        /* 根据元素位置删除*/
        String remove = strings.remove(0);
        System.out.println("删除index=0元素："+remove);
        System.out.println("删除后"+strings);
        /*删除指定元素*/
        strings.remove("a");
        System.out.println("删除指定元素后："+strings);
        /*测试null*/
        strings.add(null);
        strings.add(null);
        System.out.println("添加null后："+strings);
        strings.remove(null);
        System.out.println("删除指定元素后："+strings);


    }
}
