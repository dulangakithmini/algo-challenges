public class SringRotationChecker {
    public static void main(String[] args) {
        String text = "Hello";
        String rotatedString = "loHel";

        text += text;

        if (text.indexOf(rotatedString) != -1) {
            System.out.println("Two strings are a rotation mutually!");
        } else {
            System.out.println("Two strings are not a rotation mutually!");
        }
    }
}
