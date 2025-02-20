import java.util.*;
public class ArrayAssignment {
    public static boolean constainsDuplicate(int[] nums ){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]== nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(constainsDuplicate(nums));
    }
}
