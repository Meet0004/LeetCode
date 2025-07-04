import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> map = new HashMap<>(); // to store value and index
        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i]; // agar ye remaining value aage map pe mile mtlb usi ke saath target match karega
            if(map.containsKey(rem))
                return new int[] {map.get(rem),i};  
            map.put(nums[i],i); // agar ni hai toh add karle taaki aage mile
        }
        return new int[]{}; // kuch ni pair hua toh khali array return karenge
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = s.twoSum(nums, target);

        for(int x : ans)
            System.out.print(x + " ");
    }
}
