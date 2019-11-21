package ec.devsu.code.jam;

/**
 * JustOneLine
 */
public class JustOneLine {

    public Integer[] removeDuplicates(int[] numbers) {
        java.util.List<Integer> listNumbers = new java.util.ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!listNumbers.contains(numbers[i])) {
                listNumbers.add(numbers[i]);
            }
        }
        return listNumbers.toArray(new Integer[listNumbers.size()]);

    }
}