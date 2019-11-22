package ec.devsu.code.jam;

/**
 * Counter
 */
public class Counter {

    public int findRepeated(int[] numbers) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!map.containsKey(numbers[i])) {
                map.put(numbers[i], 1);
            } else {
                Integer value = map.get(numbers[i])+1;
                map.put(numbers[i], value.intValue());
            }
        }

        Integer[] listkeys = map.keySet().toArray(new Integer[map.size()]);
        int max = 0;

        for (int i = 0; i < listkeys.length; i++) {
            if (map.get(listkeys[i]) >= max) {
                max = map.get(listkeys[i]);
            }
        }
        java.util.List<Integer> maxNumbers = new java.util.ArrayList<Integer>();
        for (int i = 0; i < listkeys.length; i++) {
            if (map.get(listkeys[i]) == max) {
                maxNumbers.add(listkeys[i]);
            }
        }
        if (maxNumbers.isEmpty()) {
            return 0;
        }
        int number = maxNumbers.get(0);
        for (int i = 1; i < maxNumbers.size(); i++) {
            if (maxNumbers.get(i) < number) {
                number = maxNumbers.get(i);
            }
        }
        return number;

    }
}