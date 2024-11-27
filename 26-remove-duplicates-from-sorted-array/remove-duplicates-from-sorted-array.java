class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k=0;
        int temp=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>temp){
                temp=nums[i];
                nums[k]=temp;
                k++;
            }
            
        }
    return k;
    }
}