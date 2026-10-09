public class Replace {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        int i = 0;                  // First index
        int j = arr.length - 1;    // Last index

        if (arr[i] < arr[j]) {
            arr[i] = arr[j];
        }

        for (int h = 0; h < arr.length; h++) {
            System.out.print(arr[h] + " , ");
        }
    }
}