package com.kalschatzi;

import org.junit.jupiter.api.Test;
import com.kalschatzi.Key;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class HashmapCollisionTest {


    @Test
    void collisionTest(){
        HashMap<Key, String> map = new HashMap<>();

        // Create keys with the same hash code
        com.kalschatzi.Key key1 = new com.kalschatzi.Key("key1");
        com.kalschatzi.Key key2 = new com.kalschatzi.Key("key2");

        // insert values into hashmap
        map.put(key1, "Value for key1");
        map.put(key2, "Value for key2");

        // test asserts that both values were added to the hashmap, proving collision was resolved
        assertEquals(2, map.size());


    }

}
