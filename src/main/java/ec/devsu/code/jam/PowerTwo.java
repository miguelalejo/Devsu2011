package ec.devsu.code.jam;

/**
 * PowerTwo
 */
public class PowerTwo {

    public boolean isPowerOfTwo(int number) {
        if(number<=0){
            throw new RuntimeException("Not valid");
        }

        int mult = 0;
        int val=1;
        while((mult * mult) < number){
            mult = gcd(number, val);
            val++;
        }
        return (mult * mult) == number;
    }

    public int mcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    public int gcd(int x, int y) {
        if (y != 0) {
            return gcd(y, x % y);
        }
        return x;
    }
}