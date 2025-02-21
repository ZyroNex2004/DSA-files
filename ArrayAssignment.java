import java.util.*;

// Q1.
// public class ArrayAssignment {
//     public static boolean constainsDuplicate(int[] nums ){
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]== nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int nums[] = {1,2,3,1};
//         System.out.println(constainsDuplicate(nums));
//     }
// }


// Q4)
public class ArrayAssignment {
    public static int trap(int[] height){
        int n = height.length;

        int res=0;
        int  i=0, r=n-1;
        int rMax = height[r], iMax = height[i];

        while(i<r) {
            if (iMax < rMax){
                i++;
                iMax = Math.max(iMax,height[i]);
                res += iMax - height[i];
            }else {
                r--;
                rMax = Math.max(rMax,height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int height[] = {1,0,5,7,8,5};
        System.out.println(trap(height));
    }
}

