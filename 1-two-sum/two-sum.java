class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            for(int j=0;j<nums.length;j++){
                if((k+nums[j])==target&&i!=j){
                int arr[]=new int [2];
                arr[0]=i;
                arr[1]=j;
                return arr;
            }
           
            }
        }
    
          return nums;
    }

  
}