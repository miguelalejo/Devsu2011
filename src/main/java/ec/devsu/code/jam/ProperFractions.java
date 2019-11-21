package ec.devsu.code.jam;

/**
 * ProperFractions
 */
public class ProperFractions {

    int gcd(int x, int y) {
        if (y != 0) {
            return gcd(y, x % y);
        } else {
            return x;
        }

    }

    int mcd(int x, int y) {
        return (x * y) / gcd(y, x % y);
    }
}