import java.util.Scanner;

public class Array_sum_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of subjects : ");
        double n = sc.nextDouble();
        double[] arr = new double[(int) n];
        double count=0;
        System.out.println(" Now Enter subject Marks  ");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
            count=count+arr[i];
        }
       System.out.println("Sum of subject Marks : "+count);
        System.out.println(" AVG Of Marks : "+(count/n));

    }

}
