package ec.devsu.code.jam;

/**
 * ContiguousSubarrays
 */
public class ContiguousSubarrays {

    int sumMaxSubArray(int[] numbers) {
        int k = 1;
        int maxSum = 0;
        while (k < numbers.length) {
            for (int i = 0; i < numbers.length; i++) {
                int sum = numbers[i];
                for (int j = i + 1; j < k + 1; j++) {
                    if (k == numbers.length) {
                        break;
                    }
                    sum += numbers[j];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            k++;
        }
        return maxSum;
    }
}