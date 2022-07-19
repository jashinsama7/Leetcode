// Q -> Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        int[] ans = new int[2];
        
        Map<Integer, Integer> mp = new HashMap<>(); // creating map 
        
        int size = arr.length;

        for (int i = 0; i < size; i++){
            
            int num1 = arr[i];                     
            
            if(mp.isEmpty())                   // checking to put the first element
            {
                mp.put(num1,i);
                continue;
            }

            int num2 = target - num1;        // subtract num1 from target and then check it in the map if it is present in map put it in the ans array and return 

            if (mp.containsKey(num2))
            {
                ans[0] = mp.get(num2);
                ans[1] = i;
                return ans;
            }
            mp.put(num1,i);                 // else put the new value in the map and repeat the process 
        }
        return null;                                     
    }
}
