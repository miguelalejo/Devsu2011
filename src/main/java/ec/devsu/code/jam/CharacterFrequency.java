package ec.devsu.code.jam;

/**
 * CharacterFrequency
 */
public class CharacterFrequency {

    public String translate(String text, String seprator) {
        String cad = "";
        java.util.Map<String, Integer> mapRepetitions = new java.util.HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            String letter = String.valueOf(text.charAt(i));
            int count = 1;
            if (!mapRepetitions.containsKey(letter)) {
                for (int j = i + 1; j < text.length(); j++) {
                    if (letter.equals(String.valueOf(text.charAt(j)))) {
                        count++;
                    }
                }
                mapRepetitions.put(letter, count);
            }
        }

        for (int i = 0; i < text.length(); i++) {
            Integer repetitions = mapRepetitions.get(String.valueOf(text.charAt(i)));
            cad += repetitions + seprator;
        }

        return cad.substring(0, cad.length() - 1);

    }
}