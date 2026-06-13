class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
    String finalAnswer = "";
       for(int ind =0;ind < words.length; ind++){
        String curWord = words[ind];
        int value = 0;
        for(int jind =0 ;jind<curWord.length();jind++){  
            int index = curWord.charAt(jind) -'a';  
            value+= weights[index];    
        }
        value = value % 26;
        finalAnswer += (char)('z' - value);
       }
       return finalAnswer; 
    }
}