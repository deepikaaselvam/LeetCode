class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int giftssss:gifts)
        {
              maxHeap.add(giftssss);
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