package com.kalschatzi;

public class FamilyTreePrinter {

    public static void main(String[] args) {

    }

    public static void printFamilyTree(FamilyTreeNode node){
        if (node == null){
            return;
        }

        System.out.println(node.getName());

        for (FamilyTreeNode parent : node.getParents()){
            printFamilyTree(parent);
        }


    }




}
