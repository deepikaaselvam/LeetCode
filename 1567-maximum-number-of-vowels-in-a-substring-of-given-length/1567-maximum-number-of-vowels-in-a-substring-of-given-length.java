class Solution {
    public int maxVowels(String s, int k) {
        char[]CharacterArrayyy = s.toCharArray();
        HashSet<Character>vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int vowelCount=0;int maximumVowels=0;
        int r=0;int l=0;
        while(r<CharacterArrayyy.length)
        {
            if(vowels.contains(CharacterArrayyy[r]))
            {
                vowelCount++;
            }
            if(r-l+1==k)
            {
                if(r>=k && vowels.contains(CharacterArrayyy[r-k]))
                {
                    vowelCount--;
                }
                maximumVowels=Math.max(maximumVowels,vowelCount);
                l++;
                }
            r++;
        }
        return maximumVowels;
    }
}