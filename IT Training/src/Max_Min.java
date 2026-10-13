import java.util.Scanner;

public class Max_Min {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arr = {10,15,12,34,33,35};
            int max=0;
            int min=0;
            for(int i=0;i<arr.length;i++){
               if(arr[i]>max){
                   max=arr[i];
               }
               if(arr[i]<min){
                   min=arr[i];
               }
            }
            System.out.println("The Max no is "+max);
            System.out.println("The min no is "+min);
        }

    }



