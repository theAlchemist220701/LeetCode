class Solution {
    public int[][] merge(int[][] intervals) {
       List<int []> res= new ArrayList<>();
         if(intervals.length==0 || intervals==null){
            return res.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

       
         
        
        res.add(intervals[0]);
        int j=0;
        for(int i=1;i<intervals.length;i++){
            int [] current = res.get(j);
            if (intervals[i][0] <= current[1]) {
    current[1] = Math.max(current[1], intervals[i][1]);
}

            else{
                res.add(intervals[i]);
                j++;
            }
        }


            int [][] output = new int [j+1][2];
            for(int i=0;i<j+1;i++){
                output[i]=res.get(i);

            }
            return output;

    }
}