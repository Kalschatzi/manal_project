package com.kalschatzi;

public class FamilyTreePrinter {

    public static void main(String[] args) {

    }

    public static void printFamilyTree(FamilyTreeNode node, int level){
        if (node == null){
            return;
        }

        System.out.println(node.getName() + ": "  + getRelation(level));

        for (FamilyTreeNode parent : node.getParents()){
            printFamilyTree(parent, level + 1);
        }



    }

    public static String getRelation(int level){
        if (level == 0){
            return "You";
        }
        else if (level == 1){
            return "Parent";
        }
        else if (level == 2){
            return "Grandparent";
        }
        else{
        return "Great-grandparent";
        }

    }






}
