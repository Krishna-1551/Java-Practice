import java.util.*;

public class Array_checker {
    public static void main(String[] args) {

        int arr[] = {20, 30, 30, 50, 60, 70};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                System.out.println("True");
                return;
            }
        }

        System.out.println("False");
    }
}