package ec.devsu.code.jam;

/**
 * PositiveNegative
 */
public class PositiveNegative {
    public Integer[] order(int[] numbers) {
        java.util.List<Integer> listNumbers = new java.util.ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                listNumbers.add(numbers[i]);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                listNumbers.add(numbers[i]);
            }
        }
        return listNumbers.toArray(new Integer[numbers.length]);
    }
}