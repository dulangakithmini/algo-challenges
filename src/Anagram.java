import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String text1 = "mary";
        String text2 = "amyr";

        if (text1.length() == text2.length()) {
            char[] array1 = text1.toCharArray();
            char[] array2 = text2.toCharArray();

            for (int i = 0; i < text1.length(); i++) {
                array1[i] = text1.charAt(i);
                array2[i] = text2.charAt(i);
            }
            Arrays.sort(array1);
            Arrays.sort(array2);

            if (Arrays.equals(array1, array2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an anagram");
            }
        } else {
            System.out.println("Not an anagram");
        }
    }
}
