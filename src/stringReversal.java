public class stringReversal {
    public static void main(String[] args) {
        String text = "Hello World";
        char [] reverse = new char[text.length()];

        for (int i=0; i<text.length(); i++) {
            reverse[i] = text.charAt(text.length()-1-i);
        }
        System.out.println(reverse);
    }
}
