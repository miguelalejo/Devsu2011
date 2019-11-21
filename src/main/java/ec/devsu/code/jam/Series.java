package ec.devsu.code.jam;

/**
 * Series
 */
public class Series {

    // 7, 6, 8, 4, 9, 2, 10, 0, 11, -2,

    public int sumXYelements(int x, int y) {
        // any of them are 0 or negative, or if they are greater than 255, the function
        // should return -1
        if (x <= 0 || y <= 0 || x > 255 || y > 255) {
            return -1;
        }
        int dimension = (x >= y) ? x : y;
        int[] series = generateSerie(dimension);
        return series[x - 1] + series[y - 1];
    }

    int[] generateSerie(int dimension) {
        int oddStart = 7;
        int oddSequece = 1;
        int evenStart = 6;
        int evenSequece = 2;
        int[] series = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            if ((i + 1) % 2 == 0) {
                series[i] = evenStart;
                evenStart = evenStart - evenSequece;
            } else {
                series[i] = oddStart;
                oddStart = oddStart + oddSequece;
            }
        }
        return series;
    }
}