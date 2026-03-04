//negatives also
class Solution {
  public int longestSubarray(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int maxi = 0;
    int sum = 0;
    int n = nums.length;
    map.put(0, -1);

    for (int i = 0; i < n; i++) {
      sum += nums[i];

      int remainder = sum - k;
      if (map.containsKey(remainder)) {
        int len = i - map.get(remainder);
        maxi = Math.max(maxi, len);
      }

      if (!map.containsKey(sum)) {
        map.put(sum, i);
      }
    }
    return maxi;
  }
}
