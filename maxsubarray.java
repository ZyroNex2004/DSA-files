
import java.util.*;
// public class maxsubarray{
    
//     public static void maxSubarraySum(int numbers[]){
//         int currSum=0;
//         int maxSum= Integer.MIN_VALUE;
        
//         for(int i=0;i<numbers.length;i++){
//             int start = i;// 2,4,6,8,10
//             for(int j=i;j<numbers.length;j++){
//                 int end=j;
//                 currSum=0;
//                for(int k = start; k<=end; k++){
//                 // subarray sum
//                 currSum += numbers[k];
//                }
//                System.out.println(currSum);
//                if(maxSum < currSum){
//                 maxSum = currSum;
//                }
//        }
//  }
//  System.out.println("max sum :" +maxSum);
// }
// public static void main(String args[]){
//     int numbers[]={1,-2,6,-1,3};
//     maxSubarraySum(numbers);

// }
// }

//2nd method**********
// public class maxsubarray{
    
//     public static void maxSubarraySum(int numbers[]){
//         int currSum=0;
//         int maxSum= Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
//         //calculate prefix array
//         for(int i=1;i<prefix.length;i++){
//             prefix[i]= prefix[i-1] + numbers[i];
//         }
        
//         for(int i=0;i<numbers.length;i++){
//             int start = i;// 2,4,6,8,10
//             for(int j=i;j<numbers.length;j++){
//                 int end=j;

//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1]; 
        
               
//                if(maxSum < currSum){
//                 maxSum = currSum;
//                }
//        }
//  }
//  System.out.println("max sum :" +maxSum);
// }
// public static void main(String args[]){
//     int numbers[]={1,-2,6,-1,3};
//     maxSubarraySum(numbers);

// }
// }


//3rd method *****(kadanes algo)
public class maxsubarray{

public static void kadanes(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    boolean allNegative = true;

    for(int i=0; i<numbers.length;i++){
        cs = cs + numbers[i];
        if(cs < 0){
            cs =0;
        }
        
        ms = Math.max(cs,ms);
        
        if (allNegative) { // condition for all number is 0 then give output as smallest -ve number
            ms = Integer.MIN_VALUE;
            for (int num : numbers) {
                ms = Math.max(ms, num);
            }
        }
    }
    System.out.println("our max subarray sum is : " +ms);
}
public static void main(String args[]){
    int numbers[]={-1,-2,-6,-9,-3};
    kadanes(numbers);

}
}
