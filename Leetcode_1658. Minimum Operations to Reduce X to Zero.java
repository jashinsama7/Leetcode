class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        
        int len = nums.length;
        
        for(int num : nums){
            sum += num;
        }
        int rem = sum - x;
        
        if(rem == 0)
            return len;
        
        Map <Integer,Integer> mp = new HashMap<>();
        
        int pfSum = 0;
		    mp.put(0, -1);
        
        int max = -1;
        
        for(int i = 0 ; i < len;i++)
        {
            pfSum += nums[i];
            if (mp.containsKey(pfSum - rem)) {
		        max = Math.max(max,(i - mp.get(pfSum-rem)));
	          }
	    
	           mp.put(pfSum, i);
            
        }
        return max==-1 ? -1 : nums.length-max;
    }
}
