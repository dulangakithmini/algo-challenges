public class Factors {
    public static void main(String[] args) {
        int number = 495;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
