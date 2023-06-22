import java.util.*;
public class Solution {
    public static ArrayList<Integer> subsetSum(int nums[]) {
        ArrayList<Integer> result = new ArrayList<>();
        fn(result,nums,nums.length,0,0);
        Collections.sort(result);
        return result;
    }
    public static void fn(ArrayList<Integer> result,int[] nums,int n,int index,int sum){
        if(n==index){
            result.add(sum);
            return;
        }
        
        fn(result,nums,n,index+1,sum);
        fn(result,nums,n,index+1,sum+nums[index]);
        
        return;
    }
}