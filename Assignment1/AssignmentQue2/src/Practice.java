public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == key) {
                return comparisons;
            }
        }
        return comparisons;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        int comparisons = linearSearch(arr, key);
        System.out.println("Number of comparisons in linear search: " + comparisons);
    }
}