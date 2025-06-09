package com.kalschatzi;

import java.util.List;

public class Main {
    public static void main(String args []) {
        System.out.println("Hello, World!");

        FamilyTree treeBuilder = new FamilyTree();
        FamilyTreeNode root = treeBuilder.buildFamilyTree();

        FamilyTreePrinter.printFamilyTree(root, 0);


    }

    public static String StaticMethod() {
        return "HELLO, I'M A STRING!";
    }

    public static String ImmutableListMethod() {
        List<String> list = List.of("A", "B", "C");
        return list.get(0);
    }
}

