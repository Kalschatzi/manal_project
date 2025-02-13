package com.kalschatzi;

import java.util.List;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String args []) {
        System.out.println("Hello, World!");
    }

    public static String StaticMethod() {
        return "HELLO, I'M A STRING!";
    }

    public static String ImmutableListMethod() {
        List<String> list = ImmutableList.of("A", "B", "C");
        return list.get(0);
    }
}

