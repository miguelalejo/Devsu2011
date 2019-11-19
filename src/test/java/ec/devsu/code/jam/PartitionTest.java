package ec.devsu.code.jam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * PartitionTest
 */
public class PartitionTest {

    Partition partition = new Partition();

    @Test
    void shoudlBeOne() {
        assertEquals(1, partition.countPartitions(1));
    }

    @Test
    void shoudlBeTwo() {
        assertEquals(2, partition.countPartitions(2));
    }

    @Test
    void shoudlBeThree() {
        assertEquals(3, partition.countPartitions(3));
    }

    @Test
    void shoudlBeFive() {
        assertEquals(5, partition.countPartitions(4));
    }
}