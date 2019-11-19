package ec.devsu.code.jam;

/**
 * Binary
 */
public class Binary {

    public int numberOnesBinary(Integer number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }
        Integer numberOfOnes = numberOnesBinary(number / 2);
        Integer mod = number % 2;
        if (mod.intValue() == 1) {
            numberOfOnes++;
        }
        return numberOfOnes;

    }
}