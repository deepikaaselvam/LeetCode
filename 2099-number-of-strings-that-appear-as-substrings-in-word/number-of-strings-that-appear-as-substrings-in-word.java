class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0;
        for(int ind =0;ind<patterns.length;ind++){
            if(word.contains(patterns[ind])) count++;
        }
        return count;
        
    }
}