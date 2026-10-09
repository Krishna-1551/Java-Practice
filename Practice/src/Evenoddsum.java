import java.util.Scanner;

public class Evenoddsum {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in) ;
        System.out.println("Pleanse enter Desired Size of Array: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print(i+" , ");
            arr[i]=sc.nextInt();

        }
        for(int j=0;j<n;j++){
            System.out.print("Element at index "+j+":- "+arr[j]);

        }
       int temp=0;
        for(int j=0;j<n;j++){
           if(arr[j]%2==0){
               temp=temp+arr[j];
           }

        }
      System.out.println(" Even Sum is "+temp);


    }
}
