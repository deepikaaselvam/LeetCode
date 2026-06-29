class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0;
        for(int ind =0;ind<patterns.length;ind++){
            String currentWord = patterns[ind];
            if(word.contains(currentWord)) count++;
        }
        return count;
        
    }
}