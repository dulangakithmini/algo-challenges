public class StringOccurrenceCounter {
    public static void main(String[] args) {
        char specificCharacter = 'a';
        String text = "abadkhhakhjdahnaakja";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == specificCharacter) {
                count++;
            }
        }
        System.out.println(specificCharacter + " - " + count);
    }
}
