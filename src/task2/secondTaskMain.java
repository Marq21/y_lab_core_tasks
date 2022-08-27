package task2;

public class secondTaskMain {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println(Test.testSort());

    }

    private static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }

    static class Test {

        private static final int[] sortedArr = new int[]{1, 2, 2, 2, 3, 4, 5, 6};

        public static String testSort() {

            int[] testedArr = new int[]{2, 3, 4, 1, 5, 6, 2, 2};
            sort(testedArr);

            for (int i = 0; i < testedArr.length; i++) {
                if (testedArr[i] != sortedArr[i]) {
                    return "Test is not done!";
                }
            }
            return "Test is done!";
        }
    }
}
