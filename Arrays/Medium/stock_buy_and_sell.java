class Solution {
    // Function to calculate the maximum profit earned
    public int stockBuySell(int[] arr, int n) {
        int maxProfit = 0;
        // Initialize mini to the first element of arr
        int mini = arr[0]; 

        // Traverse through the array 
        for (int i = 1; i < n; i++) {
            // Calculate current profit
            int curProfit = arr[i] - mini; 
            
            // Update maxProfit if curProfit is larger
            maxProfit = Math.max(maxProfit, curProfit); 
            
            // Update mini to minimum value encountered so far
            mini = Math.min(mini, arr[i]); 
        }
        // Return the maximum profit
        return maxProfit; 
    }
}