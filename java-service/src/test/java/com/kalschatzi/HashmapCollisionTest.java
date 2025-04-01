package com.kalschatzi;

import org.junit.jupiter.api.Test;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HashmapCollisionTest {


    @Test
    void collisionTest(){
        HashMap<Key, String> map = new HashMap<>();

        // Create keys with the same hash code
        Key key1 = new Key("key1");
        Key key2 = new Key("key2");

        // insert values into hashmap
        map.put(key1, "Value for key1");
        map.put(key2, "Value for key2");

        // test asserts that both values were added to the hashmap, proving collision was resolved
        assertEquals(2, map.size());


    }

}
