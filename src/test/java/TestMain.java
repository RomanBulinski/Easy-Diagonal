import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(5985), Main.diagonal(20, 3));
    }
    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(20349), Main.diagonal(20, 4));
    }
    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(54264), Main.diagonal(20, 5));
    }
}
