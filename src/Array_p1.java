import java.util.Scanner;
public class Array_p1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Capacity of the array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0 ; i<arr.length;i++){
            System.out.print("Enter the elements of the array "+(i+1)+":- ");
            arr[i]=sc.nextInt();
        }
        for (int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" , ");
        }
        int max=0;
        for(int x:arr){
            if(x>max){
                max=x;

            }

        }
        System.out.println(max);

        int secondMax= Integer.MIN_VALUE;
        for(int x:arr){
            if (x!=max &&x>secondMax){
                secondMax=x;
            }
        }
        System.out.println(secondMax);
    }
}
