public class ReverseNumber {
    public static void main(String[] args) {
        int number = 2487453;
        int reverse = 0;

        while (number > 1) {
            reverse = number % 10 + reverse * 10;
            number /= 10;
        }
        System.out.println(reverse);
    }
}
