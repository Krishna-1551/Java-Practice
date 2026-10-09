import java.util.Scanner;
public class ass1 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr=new int [10];
        System.out.println("Enter number:");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int result =arr[0];
        for (int i=0;i<10;i++){
            if(arr[i]>result){
                result=arr[i];
            }

        }
        System.out.print(result);
    }
}
