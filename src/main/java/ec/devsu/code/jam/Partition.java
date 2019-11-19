package ec.devsu.code.jam;

/**
 * Partition
 */
public class Partition {
    public int countPartitions(int number) {
        int numberoParticiones = 1;
        for (int i = number - 1; i > 0; i--) {
            int numberBase = i;
            int diferencia = number - numberBase;
            while (diferencia > 0){
                numberoParticiones++;
                diferencia--;
            }
        }
        return numberoParticiones;
    }

}