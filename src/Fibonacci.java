public class Fibonacci {
    public static void main(String[] args) {
        int previousNumber = 1;
        int newNumber = 1;
        int next;

        for (int i = 0; i < 5; i++) {
            System.out.println(previousNumber);

            next = newNumber + previousNumber;
            previousNumber = newNumber;
            newNumber = next;
        }
    }
}
