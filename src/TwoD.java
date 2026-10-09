import java.util.Scanner;
public class TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
     int i;
     int j;
        int sum =0;
       int[][] marks=new int [3][3];
       for ( i=0;i<3;i++){
           for ( j=0;j<3;j++){
               System.out.print("Enter the matrix elements "+(i+1)+"x"+(j+1)+": ");
               marks[i][j]=sc.nextInt();
               if (i==j){
                   sum=sum+marks[i][j];
           }

       }
      System.out.println("your daiognal element Sum is : "+sum);

       }
    }
}
