package ec.devsu.code.jam;

import java.util.ArrayList;
import java.util.List;

/**
 * Partition
 */
public class Partition {
    public int countPartitions(int number) {
        List<int[]> listNumbers = new ArrayList<int[]>();
        for (int i = number; i >= 0;) {

            int[] partition = new int[number];
            partition[0] = i;
            int k = 1;            
            int index = 0;
            do {
                index = number - sum(partition);
                while (!esMenorIgual(partition, index)) {
                    index--;
                }
                partition[k] = index;
                k++;
            } while (sum(partition) <= number);
            i--;
            listNumbers.add(partition);
        }

        return 0;
    }

    public int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public boolean esMenorIgual(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (number > numbers[i] && numbers[i] != 0) {
                return false;
            }
        }
        return true;
    }

}