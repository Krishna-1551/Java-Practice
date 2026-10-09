public class alternate_shift {
    public static void main(String args[]) {

        int arr[] = {9, 3, 6, 12, 4};

        for(int i = 0; i < arr.length-1; i = i + 2) {

            int temp = arr[i];
            arr[i] = arr[i + 1];//condition breaks at last
            arr[i + 1] = temp;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}