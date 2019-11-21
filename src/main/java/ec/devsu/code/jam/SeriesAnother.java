package ec.devsu.code.jam;

/**
 * Series
 */
public class SeriesAnother {

    public float findElement(int x, int y) {
        if (x <= 0 || y <= 0 || x > 255 || y > 255) {
            return -1;
        }
        float[] serie = generateSeries(x, y);
        return serie[y-1];
    }

    float[] generateSeries(int seed, int dimension) {
        float[] series = new float[dimension];
        int seriesSequence = 1;
        for (int i = 0; i < dimension; i++) {
            series[i] = seed/seriesSequence;            
            seriesSequence++;
        }
        return series;
    }

}