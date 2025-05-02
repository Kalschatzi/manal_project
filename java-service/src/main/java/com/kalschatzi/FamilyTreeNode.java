package com.kalschatzi;
import java.util.ArrayList;
import java.util.List;
/*
Create a family tree
- A Tree should have a root node (you)
- Each node should have 2 parents
- Each parent should be itself a node
- Each node should have a name (name of the person)
- Each node should have a list of branches which are also nodes
- Add at least 3 levels of the tree, each node with at least 2 children

Exercise is:
Create a function that receives the tree and prints the names of everyone as well as their relation to you (parent,
grand-parent, grand-grand-parent, etc)
* */


public class FamilyTreeNode {
    private String name; // each node should have a name
    private List<FamilyTreeNode> parents; // each node should have 2 parents

    public FamilyTreeNode(String name){
        this.name = name;
        this.parents = new ArrayList<>(2); // max 2 parents
    }

    public String getName(){
        return name;
    }

    public List<FamilyTreeNode> getParents(){
        return parents;
    }

    public void setParents(FamilyTreeNode parent1, FamilyTreeNode parent2){
        this.parents.add(parent1);
        this.parents.add(parent2);
    }




}
