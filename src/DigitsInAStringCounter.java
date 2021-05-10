public class DigitsInAStringCounter {
    public static void main(String[] args) {
        String text = "2A3p4p5l6e1p7i8e91";

        String textWithoutDigits = text.replaceAll("\\d", "");

        System.out.println("Number of digits: " + (text.length() - textWithoutDigits.length()));
    }
}
