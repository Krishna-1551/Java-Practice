import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arra_List {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>();
       Scanner kb = new Scanner(System.in);
       for(int i = 0; i <=4; i++){
           System.out.println("Enter the month name : ");
           String month = kb.nextLine();
           months.add(month);
       }
       for(int i=months.size()-1;i>=0;i--){
           System.out.println(months.get(i));
       }

    }
}
