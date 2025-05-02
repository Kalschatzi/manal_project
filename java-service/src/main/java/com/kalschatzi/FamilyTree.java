package com.kalschatzi;


public class FamilyTree {

    public FamilyTreeNode buildFamilyTree(){
        // Add at least 3 levels of the tree, each node with at least 2 children

        // Great-grandparents - level 3
        FamilyTreeNode ggp1 = new FamilyTreeNode("John");
        FamilyTreeNode ggp2 = new FamilyTreeNode("Mary");
        FamilyTreeNode ggp3 = new FamilyTreeNode("Robert");
        FamilyTreeNode ggp4 = new FamilyTreeNode("Emily");
        FamilyTreeNode ggp5 = new FamilyTreeNode("William");
        FamilyTreeNode ggp6 = new FamilyTreeNode("Dorothy");
        FamilyTreeNode ggp7 = new FamilyTreeNode("James");
        FamilyTreeNode ggp8 = new FamilyTreeNode("Linda");

        // Grandparents - level 2
        FamilyTreeNode gp1 = new FamilyTreeNode(("George"));
        gp1.setParents(ggp1, ggp2);

        FamilyTreeNode gp2 = new FamilyTreeNode(("Helen"));
        gp2.setParents(ggp3, ggp4);

        FamilyTreeNode gp3 = new FamilyTreeNode(("David"));
        gp3.setParents(ggp5, ggp6);

        FamilyTreeNode gp4 = new FamilyTreeNode(("Susan"));
        gp4.setParents(ggp7, ggp8);

        // Parents - level 1
        FamilyTreeNode p1 = new FamilyTreeNode("Michael");
        p1.setParents(gp1, gp2);

        FamilyTreeNode p2 = new FamilyTreeNode("Karen");
        p2.setParents(gp3, gp4);

        // Me (root) - level 0
        FamilyTreeNode me = new FamilyTreeNode("Manal");
        me.setParents(p1, p2);

        return me;
    }





}
