import java.util.Scanner;

public class Count_Even_Odd {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arr = {10,15,12,34,33,35};
            int even=0;
            int odd=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
           System.out.println("The Even no is "+even);
            System.out.println("The Odd no is "+odd);
        }

    }

