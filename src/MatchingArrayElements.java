public class MatchingArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 8, 2, 7, 9, 0, 7};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
