package ec.devsu.code.jam;

/**
 * ReverseOrder
 */
public class ReverseOrder {

    public String reverse(String text) {
        String[] words = text.split(" ");
        String cad = "";
        for (int i = words.length - 1; i >= 0; i--) {
            cad += words[i] + " ";
        }
        return cad.trim();
    }
}