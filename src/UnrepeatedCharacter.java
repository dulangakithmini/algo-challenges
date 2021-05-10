import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnrepeatedCharacter {
    public static void main(String[] args) {
        String text = "apopalepie";

        HashSet<Character> hashSet = new HashSet<>();
        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (hashSet.contains(character)) {
                continue;
            }

            if (characterList.contains(character)) {
                characterList.remove((Character) character);
                hashSet.add(character);
            } else {
                characterList.add(character);
            }
        }
        System.out.println(characterList.get(0));
    }
}
