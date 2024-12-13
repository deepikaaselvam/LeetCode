class Solution {
    public long findScore(int[] scoreArray) {
         long score = 0;
        boolean[] marked = new boolean[scoreArray.length];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0]; // Sort by value
            }
            return a[1] - b[1]; // If values are equal, sort by index
        });

        // Add all elements to the min-heap with their indices
        for (int i = 0; i < scoreArray.length; i++) {
            minHeap.add(new int[]{scoreArray[i], i});
        }

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll(); // Get the smallest unmarked value
            int value = current[0];
            int index = current[1];

            // If already marked, skip it
            if (marked[index]) {
                continue;
            }

            // Mark the current element and its neighbors
            marked[index] = true;
            if (index > 0) {
                marked[index - 1] = true;
            }
            if (index < scoreArray.length - 1) {
                marked[index + 1] = true;
            }

            // Add the value to the score
            score += value;
        }
        return score;

        
    }
}