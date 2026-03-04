(positives)
class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int left =0;
        int maxi = Integer.MIN_VALUE;
        int sum =0;
        for(int right =0; right < n ; right++)
        {
            sum+= nums[right];
            while(sum > k)
            {
                sum-= nums[left];
                left++;
            }

            if(sum==k)
            {
                maxi = Math.max(maxi , right - left + 1);
            }


        }
        return maxi;
       
    }
}
