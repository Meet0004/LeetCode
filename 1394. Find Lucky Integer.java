import java.util.*;

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>(); // to store value and frequency
        for(int num: arr){
            if(freq.containsKey(num)){    // agar number ho toh freq ko add karlo
                freq.put(num, freq.get(num)+1);
            }else{
                freq.put(num,1);  // agar number nahi ho toh us number ko hasmap pe add karlo
            }
        }
        int res = -1; // rakhna pada kyuki aage maximum dhundna hai
        for(int num:freq.keySet())
            if (num==freq.get(num))
                res = Math.max(res,num); // mila hua number bada hai ya old vesa

        return res; // could be -1 or lucky LARGEST number;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        
        int[] arr = {2, 2, 3, 4};
        
        int ans = s.findLucky(arr);
        System.out.println(ans);  // 2
    }
}
