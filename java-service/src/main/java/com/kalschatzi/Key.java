package com.kalschatzi;

// Hash collision simulation
public class Key {
    private String name;

    public Key(String name){
        this.name = name;
    }

    @Override
    public int hashCode(){

        return 1; // force a collision by returning the same hash code for all keys which will make all the keys map to the same bucket
    }

    @Override
    public boolean equals(Object obj){
        // Override equals method to ensure keys are compared based on their key value
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Key that = (Key) obj;
        return name.equals(that.name);

    }

}
