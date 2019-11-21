package ec.devsu.code.jam;

/**
 * LowerCase
 */
public class LowerCase {

    /**
     *
     */
    private static final int _32 = 32;

    public String convertToLowerCase(String text) {
        String cad = "";
        for (int i = 0; i < text.length(); i++) {
            int aschiValue = text.charAt(i);
            if (isUpperCase(aschiValue)) {
                int asschiLower = aschiValue + _32;
                char charaterLower = (char) asschiLower;
                cad += String.valueOf(charaterLower);
            } else {
                char charaterLower = (char) aschiValue;
                cad += String.valueOf(charaterLower);
            }
        }
        return cad;

    }

    public boolean isUpperCase(int aschiValue) {

        if (65 <= aschiValue && aschiValue <= 90) {
            return true;
        }
        if (193 <= aschiValue && aschiValue <= 222) {
            return true;
        }
        return false;
    }

}