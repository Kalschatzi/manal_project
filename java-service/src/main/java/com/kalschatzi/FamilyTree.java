package com.kalschatzi;


public class FamilyTree {

    public FamilyTreeNode buildFamilyTree(){
        // Add at least 3 levels of the tree, each node with at least 2 children

        // Great-grandparents - level 3
        FamilyTreeNode ggp1 = new FamilyTreeNode("Great grandparent 1");
        FamilyTreeNode ggp2 = new FamilyTreeNode("Great grandparent 2");
        FamilyTreeNode ggp3 = new FamilyTreeNode("Great grandparent 3");
        FamilyTreeNode ggp4 = new FamilyTreeNode("Great grandparent 4");
        FamilyTreeNode ggp5 = new FamilyTreeNode("Great grandparent 5");
        FamilyTreeNode ggp6 = new FamilyTreeNode("Great grandparent 6");
        FamilyTreeNode ggp7 = new FamilyTreeNode("Great grandparent 6");
        FamilyTreeNode ggp8 = new FamilyTreeNode("Great grandparent 8");

        // Grandparents - level 2
        FamilyTreeNode gp1 = new FamilyTreeNode(("Grandparent1"));
        gp1.setParents(ggp1, ggp2);

        FamilyTreeNode gp2 = new FamilyTreeNode(("Grandparent2"));
        gp2.setParents(ggp3, ggp4);

        FamilyTreeNode gp3 = new FamilyTreeNode(("Grandparent3"));
        gp3.setParents(ggp5, ggp6);

        FamilyTreeNode gp4 = new FamilyTreeNode(("Grandparent4"));
        gp4.setParents(ggp7, ggp8);

        // Parents - level 1
        FamilyTreeNode p1 = new FamilyTreeNode("Parent1");
        p1.setParents(gp1, gp2);

        FamilyTreeNode p2 = new FamilyTreeNode("Parent1");
        p2.setParents(gp3, gp4);

        // Me (root) - level 0
        FamilyTreeNode me = new FamilyTreeNode("Me");
        me.setParents(p1, p2);

        return me;
    }





}
