package ec.devsu.code.jam;

/**
 * Partition
 */
public class Partition {
    public int countPartitions(int number) {
        number--;
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        int particiones = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (number >= i) {
                    particiones = countPartitions(number) + countPartitions(i);
                }
            }
            if (number >= i) {
                particiones = countPartitions(number) + countPartitions(i);
            }
        }

        return numberoParticiones;
    }

    int countLeaves(treePtr rootPtr) {
        if (rootPtr == NULL)
            return 0;
        if (rootPtr -> right == NULL && rootPtr -> left == NULL)
            return 1;
        int leftCount = countLeaves(rootPtr -> left);
        int rightCount = countLeaves(rootPtr -> right);
        return leftCount + rightCount;
    }

}