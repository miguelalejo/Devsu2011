package ec.devsu.code.jam;

/**
 * AWords
 */
public class AWords {

    public int findNumberA(String text) {
        int countA = 0;
        for (int i = 0; i < text.length(); ) {
            String letter = String.valueOf(text.charAt(i));
            if ("A".equals(letter) || "a".equals(letter)) {
                while (!" ".equals(letter)) {
                    if (i >= text.length()) {
                        break;
                    }
                    letter = String.valueOf(text.charAt(i));
                    i++;
                }
                countA++;
            }
            else{
                i++;
            }
        }
        return countA;
    }

}