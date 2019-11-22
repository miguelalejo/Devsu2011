package ec.devsu.code.jam;

/**
 * Equilibrium
 */
public class Equilibrium {

    public int findEquilibriumIndex(int[] numbers) {
        int sumL = 0;
        int k = (numbers.length % 2 == 0) ? 1 : 2;
        for (int i = 0; i < numbers.length; i++) {
            sumL += numbers[i];
            int sumR = 0;
            for (int j = i + k; j < numbers.length; j++) {
                sumR += numbers[j];
            }
            if (sumR == sumL) {
                return i + k;
            }
        }
        return -1;
    }

}