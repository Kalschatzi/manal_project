package test.java.com.kalschatzi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void TestStaticMethodReturn() {
        assertEquals("HELLO, I'M A STRING!", com.kalschatzi.Main.StaticMethod());
    }

    @Test
    public void TestImmutableListGet() {
        assertEquals("A", com.kalschatzi.Main.ImmutableListMethod());
    }

}
