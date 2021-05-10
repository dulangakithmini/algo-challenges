public class palindrome {
    public static void main(String[] args) {
        String text = "aebbbewa";
        boolean flag = true;

        for (int i=0; i<text.length()/2; i++) {
            if (text.charAt(i) != text.charAt(text.length()-1-i)) {
                System.out.println("Not a Palindrome");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Palindrome");
        }
    }
}
