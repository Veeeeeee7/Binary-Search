public class BasicMethods {
    public static void main(String[] args) {
        Integer[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index = recursiveBinarySearch(numbers, 6);
        System.out.println("Index of 6: " + index);

        int[] vector1 = { 1, 2, 3 };
        int[] vector2 = { 4, 5, 6 };
        int dotProductResult = dotProduct(vector1, vector2);
        System.out.println("Dot Product: " + dotProductResult);
    }

    public static <T extends Comparable<T>> int recursiveBinarySearch(T[] input, T value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static <T extends Comparable<T>> int recursiveBinarySearch(T[] input, int start, int end, T value) {
        if (start >= end) {
            return -1;
        }
        int midpoint = (start + end) / 2;

        if (input[midpoint].compareTo(value) == 0) {
            return midpoint;
        } else if (input[midpoint].compareTo(value) < 0) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        } else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }

    public static int dotProduct(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }

        int result = 0;
        for (int i = 0; i < vector1.length; i++) {
            result += vector1[i] * vector2[i];
        }

        return result;
    }
}
