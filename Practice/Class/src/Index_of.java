import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Index_of {
    public static void main(String[] args) {
        List<String> months = new ArrayList<>();
        Scanner kb1 = new Scanner(System.in);
        months.add("PATHAAN");// all must be capital to use to.Upper caes
        months.add("GADAR");
        months.add("TJMM");
        System.out.println("Enter Movie Name ");
        String name = kb1.nextLine().toUpperCase();
        int position = months.indexOf(name);
        if(position == -1){
            System.out.println("Movie Not Found");
        }else{
            System.out.println(name+" "+position);
        }
        months.contains(name);
    }
}
