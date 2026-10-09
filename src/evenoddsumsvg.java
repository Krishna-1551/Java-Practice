import java.util.Scanner;

public class evenoddsumsvg {
    public static void main(String[] args) {
        int arr[]={10,2,3,4,7,12,3};
        int temp=0;
        int n=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                temp+=arr[i];
                n++;
            }
        }
        System.out.println("Even no, sum is "+temp);
        double ans_1=(temp/n);
        System.out.println("Avg is "+ans_1);


        int kemp=0;
        int l=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]%2!=0){
                kemp+=arr[i];
                l++;
            }
        }
        System.out.println(" Odd no, sum is "+kemp);
        double ans_2=(kemp/l);
        System.out.println("Avg is "+ans_2);
    }
}
