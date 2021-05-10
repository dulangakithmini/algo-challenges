public class vowelsAndConsonantsCounter {
    public static void main(String[] args) {
        String text = "Hello World";
        int vowelcount = 0;
        int consonantCount = 0;

        for (int i=0; i<text.length(); i++) {
            char character = text.charAt(i);
            if (character=='a' || character=='e' || character=='i' || character=='o' || character=='u') {
                vowelcount += 1;
            }else if (character != ' ') {
                consonantCount += 1;
            }
        }
        System.out.println("Vowel count = " +vowelcount);
        System.out.println("Consonant count = " +consonantCount);
    }
}
