import java.util.HashSet;
import java.util.Set;

public class Remove_dulicate {
    public static void main(String[] args) {
        Set<Integer> myset = new HashSet<Integer>();
        myset.add(101);
        myset.add(102);
        myset.add(101);
        myset.add(103);
        myset.add(102);
        myset.add(104);
        myset.add(103);
        myset.add(105);

        for(int x:myset){
            System.out.print(x+" ");
        }
    }
}
