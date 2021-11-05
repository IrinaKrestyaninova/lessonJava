import java.lang.reflect.Array;
import java.util.Arrays;

public class thirdLesson {
    public static void main(String[] args) {
        // 1.
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < 10; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));

        // 2.
        int[] array1 = new int[100];
        for (int i = 0; i < 100; i++) {
            array1[i] = i + 1;
        }
        System.out.println(Arrays.toString(array1));

        // 3.
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < 12; i++) {
            if (array2[i] < 6) {
                array2[i] = array2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array2));

        // 4.
        int[][] arraySquare = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j || i == 9 - j) {
                    arraySquare[i][j] = 1;

                }
                System.out.print(arraySquare[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 5.
        returnArray(10, 1);
        // 6.
        arrayElementMinMax();
        // 7.
        int[] arrayCheckBalance = {1, 2, 1, 2, 1, 1, 2, 1, 1, 2};
        System.out.println(Arrays.toString(arrayCheckBalance));
        System.out.println(checkBalance(arrayCheckBalance));
        // 8.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
        shiftElements(arr, -3);
    }

    // 5.
    public static int[] returnArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
        return array;
    }

    // 6.
    public static void arrayElementMinMax() {
        int[] arr = {3, 1, 8, 7, 5, 15, 13, 9, 2, 16};
        int min, max;
        min = arr[0];
        max = arr[0];
        for (int i = 0; i < 10; i++) {

            if (arr[i] <= min) {
                min = arr[i];
            } else {
                if (arr[i] >= max) {
                    max = arr[i];
                }
            }
        }
        System.out.println();
        System.out.println("min=" + min + ",max=" + max);
    }

    // 7.
    public static boolean checkBalance(int[] arr) {

        int sumLeft = 0, sumRight = 0, sumArr = 0;

        for (int i = 0; i < arr.length; i++) {
            sumArr += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {

            sumLeft += arr[i];
            sumRight = sumArr - sumLeft;

            System.out.println(sumLeft);
            System.out.println(sumRight);
            if (sumLeft==sumRight){
                System.out.println("Суммы правой и левой частей равны");
                return true;
            }
          //  else {return false;}


        }

     if (sumLeft == sumRight) {
            return true;
        }
        else {return false;}
    }
    // 8.
    public static void shiftElements(int[] arr, int n){
        if (n>=0) {
            for (int i=0;i<n;i++) {
                int temp = arr[arr.length-1];
                for(int j=arr.length-1;j>0;j--) {
                   arr[j] = arr[j-1];
                  // arr[j] = temp;
               }
                arr[0] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        if (n<0) {
            for (int i=0;i<Math.abs(n);i++) {
                int temp = arr[0];
                for(int j=0;j<arr.length-1;j++) {
                    arr[j] = arr[j+1];
                    // arr[j] = temp;
                }
                arr[arr.length-1] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}




