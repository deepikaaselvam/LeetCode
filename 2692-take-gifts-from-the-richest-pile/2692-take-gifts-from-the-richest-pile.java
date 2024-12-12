class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++)
        {
            maxHeap.add(gifts[i]);
        }
        while(k>0 && !maxHeap.isEmpty())
        {
            int topVal = maxHeap.poll();
            int floorcoversion=(int)Math.floor(Math.sqrt(topVal));
            maxHeap.add(floorcoversion);
            k--;
        }
        long totalGifts = 0l;
       while(!maxHeap.isEmpty())
       {
        totalGifts+=maxHeap.poll();
       }
       return totalGifts;
        
    }
}