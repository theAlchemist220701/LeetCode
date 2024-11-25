class Solution {
    public int maxSubarraySumCircular(int[] nums) {
   //  Calculate Linear Maximum Subarray Sum (Kadane's Algorithm)
        int maxSum = Integer.MIN_VALUE;
        int currMax = 0;

        for (int i = 0; i < nums.length; i++) {
            currMax += nums[i];
            maxSum = Math.max(maxSum, currMax);
            if (currMax < 0) currMax = 0; 
        }   
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

         // Minimum Subarray Sum
         int minSum = Integer.MAX_VALUE;
        int currMin = 0;

        for (int i = 0; i < nums.length; i++) {
            currMin += nums[i];
            minSum = Math.min(minSum, currMin);
            if (currMin > 0) currMin = 0; // Reset if current sum goes positive
        }
        if (totalSum == minSum) return maxSum; // Step 4: Handle Edge Case for All-Negative Numbers
         return Math.max(maxSum, totalSum - minSum); // Step 5: Return Maximum of Linear and Circular


    }
}