import java.util.HashMap;
import java.util.Set;

public class machingCharactersInAString {
    public static void main(String[] args) {

        String text = "Hello World";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<text.length(); i++) {
            char character = text.charAt(i);
            if (map.containsKey(character)) {
                int count = map.get(character);
                map.put(character, ++count);
            }else {
                map.put(character, 1);
            }
        }
        Set<Character> set = map.keySet();
        for (Character key: set) {
            if (map.get(key) > 1) {
                System.out.println(key + " - " + map.get(key));
            }
        }
    }
}
