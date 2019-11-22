package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * PartitionTest
 */
public class PartitionTest {

    Partition partition = new Partition();

    @Test    
    void t1() {
        assertEquals(1, partition.partions(1));
    }

    
    @Test    
    void t2() {
        assertEquals(0, partition.partions(0));
    }

    @Test    
    void t3() {
        assertEquals(3, partition.partions(3));
    }

    
    @Test
    void shoudlBeFive() {
        assertEquals(5, partition.partions(4));
    }
}