package task1;

public class firstTaskMain {

    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        fill(arr);
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(average(arr));

        System.out.println(Test.testAverage());
        System.out.println(Test.testMax());
        System.out.println(Test.testMin());

    }

    private static void fill(int[][] arr) {
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            arr[i][j] = (int) random();
            if (j < arr[i].length - 1) {
                j++;
            } else {
                i++;
                j = 0;
            }
        }

    }

    private static int max(int[][] arr) {

        int max = Integer.MIN_VALUE;

        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (max < arr[i][j]) {
                max = arr[i][j];
            }
            if (j < arr[i].length - 1) {
                j++;
            } else {
                i++;
                j = 0;
            }
        }
        return max;
    }

    private static int min(int[][] arr) {

        int min = arr[0][0];

        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (min > arr[i][j]) {
                min = arr[i][j];
            }
            if (j < arr[i].length - 1) {
                j++;
            } else {
                i++;
                j = 0;
            }
        }
        return min;

    }

    private static double average(int[][] arr) {
        int sumOfLength = sumOfLength(arr);

        int sum = 0;

        int i = 0;
        int j = 0;

        while (i < arr.length) {
            sum += arr[i][j];
            if (j < arr[i].length - 1) {
                j++;
            } else {
                i++;
                j = 0;
            }
        }

        return (double) sum / sumOfLength;

    }

    private static int sumOfLength(int[][] arr) {
        int sum = 0;

        for (int[] ints : arr) {
            sum += ints.length;
        }

        return sum;
    }

    private static long random() {

        long currentTime = System.nanoTime();

        return currentTime % (long) 31 + (System.nanoTime() % 7);

    }

    static class Test {
        private static final int[][] arrTest = new int[][]{{1, 2}, {3, 4}};

        public static String testAverage() {
            double averageValue = 2.5;

            if (averageValue == average(arrTest)) {
                return "Test is done!";
            }
            return "Test is not done";
        }

        public static String testMax() {
            int maxValue = 4;

            if (maxValue == max(arrTest)) {
                return "Test is done!";
            }
            return "Test is not done";
        }

        public static String testMin() {
            int minValue = 1;

            if (minValue == min(arrTest)) {
                return "Test is done!";
            }
            return "Test is not done";
        }
    }
}
