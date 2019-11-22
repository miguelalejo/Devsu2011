package ec.devsu.code.jam;

/**
 * SortingGeeks
 */
public class SortingGeeks {

    public String[] sort(String[] arr) {
        int lessdimension = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < lessdimension) {
                lessdimension = arr[i].length();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double cadA = calculateWeigh(arr[i], lessdimension);
                double cadB = calculateWeigh(arr[j], lessdimension);
                if (cadB < cadA) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public double calculateWeigh(String word, int lessdimension) {
        int sum = 0;
        for (int i = 0, k = lessdimension - 1; i < lessdimension; i++, k--) {
            int val = (int) word.charAt(i);
            sum += val * java.lang.Math.pow(10, k);
        }
        return sum;
    }

}