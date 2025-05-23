import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 2, 3, 6, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
   // Time O(n2) // Space O(1)
}
