import java.util.Scanner;
public class use_worker {
   public static void main(String[] args) {
    Scanner sc= new Scanner (System.in) ;
    System.out.println("Enter hours worked : ");
    int hw = sc.nextInt();

    System.out.println("Enter payrate  : ");
    double payrate = sc.nextDouble();

    Worker w = new Worker();
   w.setData(hw,payrate);
   w.getSalary();
   }
}
