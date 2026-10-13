import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 15, 12, 34, 33, 35};
        int max = 0;
        int Second_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Second_max && arr[i]<max){
                Second_max=arr[i];
            }
        }
        System.out.println("Maximum Marks : "+Second_max);
    }
}