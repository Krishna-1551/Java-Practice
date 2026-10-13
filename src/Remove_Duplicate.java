import java.util.LinkedHashSet;
import java.util.Set;

class Remove_Duplicate {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>(list.of);
        for(int num:nums){
            set.add(num);
        }
        int i=0;
        for(int num:set){
            nums[i]=num;
            i++;
        }
        return set.size();
    }
}