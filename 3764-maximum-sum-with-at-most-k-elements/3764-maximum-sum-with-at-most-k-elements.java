class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>();
        for(int ind1 =0;ind1<grid.length;ind1++)
            {
                PriorityQueue<Integer>rowHeap= new PriorityQueue<>();
                int EachLimitValue =limits[ind1];
                for(int ind2=0;ind2<grid[ind1].length;ind2++)
                    {
                       rowHeap.add(grid[ind1][ind2]);
                        if(rowHeap.size()>EachLimitValue)
                        {
                            rowHeap.poll();
                        }
                    }
                    while(!rowHeap.isEmpty())
                    {
                        maxHeap.add(rowHeap.poll());
                        if(maxHeap.size()>k)
                        {
                            maxHeap.poll();
                        }
                        
                    }
            }
        long sum=0;
         long size=maxHeap.size();
        for(long i=0;i<size;i++)
            {
                sum+=maxHeap.poll();
            }
        return sum;
    }
}