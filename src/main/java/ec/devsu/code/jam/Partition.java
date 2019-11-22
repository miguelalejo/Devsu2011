package ec.devsu.code.jam;

import java.util.ArrayList;
import java.util.List;

/**
 * Partition
 */
public class Partition {
    private int countPartitions(int n, int m) {
        if (n < 0 || m == 0) {
            return 0;
        }
        if (n == 0 || m == 1) {
            return 1;
        }
        if (n == m) {
            return 1 + countPartitions(n, m - 1);
        }        
        return countPartitions(n, m - 1) + countPartitions(n - m, m);
    }

    public int partions(int n){
        return countPartitions(n, n);
    }

}