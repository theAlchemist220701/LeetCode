class Solution {
   
    public int[] twoSum(int[] nums, int target) {
        
        //HashMap making
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            if(map.containsKey(k)&& map.get(k)!=i){
                int a= map.get(k);
                int b=i;
                int arr[]=new int[2];
                arr[0]=a;
                arr[1]=b;
                return arr;
            }
        }

return nums;

    }
}