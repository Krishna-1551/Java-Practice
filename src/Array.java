import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j: arr) {
           System.out.println(j+"," );
        }


int max=0;
        for (int x:arr){
            if (max>x){
                max=x;
            }
        }
        System.out.println(max);
    }


}