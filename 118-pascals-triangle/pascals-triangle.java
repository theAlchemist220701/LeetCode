class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0) return result;


        List<Integer> first=new ArrayList<>();
        first.add(1);
        result.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> prevRow=result.get(i-1);
            

            ArrayList<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);

            result.add(row);




                    }

                    return result;
        




    }
}