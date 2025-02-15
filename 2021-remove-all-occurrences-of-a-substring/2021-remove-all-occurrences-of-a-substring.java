class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part))
        {
            int partStartingIndex = s.indexOf(part);
            s = s.substring(0,partStartingIndex)+s.substring(partStartingIndex+part.length());
        }
        return s;
        
    }
}