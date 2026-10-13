
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetDuplicates{
    public static Set<Integer> getAllDuplicates(int[] arr){
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for(int num:arr){
            boolean result = set.add(num);
            if(result==false){
                ans.add(num);
            }
        }
        return ans;
    }
    static void main(){
        int [] arr = {1,2,3,2,1};
        Set<Integer> set = getAllDuplicates(arr);
        System.out.println(set);
    }
}