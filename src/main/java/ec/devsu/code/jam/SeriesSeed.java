package ec.devsu.code.jam;

/**
 * SeriesSeed
 */
public class SeriesSeed {

    public int findElement(int x, int y) {
        if (x <= 0 || y <= 0 || x > 255 || y > 255) {
            return -1;
        }
        int[] serie = generateSeries(x, y + 1);
        return serie[y];
    }

    int[] generateSeries(int seed, int dimension) {
        int[] series = new int[dimension];
        int seriesSequence = 1;
        for (int i = 0; i < dimension; i++) {
            series[i] = seed;
            seed = seed * seriesSequence;
            seriesSequence++;
        }
        return series;
    }
}