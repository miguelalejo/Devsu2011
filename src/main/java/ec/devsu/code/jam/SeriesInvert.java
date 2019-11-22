package ec.devsu.code.jam;

/**
 * SeriesInvert
 */
public class SeriesInvert {
    public int generate(int x, int y, int z) {
        String serieInt = String.valueOf(x) + String.valueOf(y);
        String serieIntBase = String.valueOf(x) + String.valueOf(y);

        int[] numbers = new int[z];
        numbers[0] = Integer.valueOf(serieInt);
        for (int i = 1; i < numbers.length; i++) {
            int dim = serieInt.length();
            int partition = (dim % 2 == 0) ? dim / 2 : (dim / 2) + 1;
            if (i % 2 == 0) {
                String a = String.valueOf(Integer.valueOf(serieIntBase.substring(0, partition)) + 1);
                String b = String
                        .valueOf(Integer.valueOf(serieIntBase.substring(partition, serieIntBase.length())) + 1);
                serieIntBase = a + b;
                serieInt = serieIntBase;
                numbers[i] = Integer.valueOf(serieIntBase);
            } else {
                String a = serieInt.substring(0, partition);
                String b = serieInt.substring(partition, serieInt.length());
                serieInt = b + a;
                numbers[i] = Integer.valueOf(serieInt);
            }

        }

        return numbers[z - 1];

    }

}