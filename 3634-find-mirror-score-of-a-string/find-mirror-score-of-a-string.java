class Solution {
    public long calculateScore(String s) {
        int n = s.length();
        long totalScore = 0;
        Map<Character, LinkedList<Integer>> charMap = new HashMap<>();
        for (int i = 0; i < n; i++) 
        {
            char currentChar = s.charAt(i);
            char mirrorChar = (char) ('z' - (currentChar - 'a')); 
            if (charMap.containsKey(mirrorChar) && !charMap.get(mirrorChar).isEmpty()) 
            {
                int j = charMap.get(mirrorChar).removeLast(); 
                totalScore += (i - j); 
            } 
            else {
                charMap.putIfAbsent(currentChar, new LinkedList<>());
                charMap.get(currentChar).add(i);
            }
        }

        return totalScore;
        
    }
}