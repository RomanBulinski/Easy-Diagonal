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

    @Test
    public void test4() {
        assertEquals(new BigInteger("21345974349798683725889201874955340339367102876282031388028493975503349073179494770384622850127101674520291066054604710159802097954774308676233406165157140124499508304213050"), Main.diagonal(1400, 115));
    }


//    ****** Random test ******
//    Numbers : 1400, 115
//    expected:<21345974349798683725889201874955340339367102876282031388028493975503349073179494770384622850127101674520291066054604710159802097954774308676233406165157140124499508304213050> but was:<67360453690>
//




}
