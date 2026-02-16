public class Solution {
    public string AddBinary(string a, string b) {
        int maximumValue = Math.Max(a.Length,b.Length);
        string ans="";
        char carry='0';
        int firstWord = a.Length-1;
        int secondWord = b.Length-1;
        for(int ind =0;ind<maximumValue;ind++){
            int val1=0;
            int val2=0;
            if(firstWord>=0){
                val1=a[firstWord--]-'0';
            }if(secondWord>=0){
                val2 =b[secondWord--]-'0';
            }
            int sum = val1+val2+(carry-'0');
           ans+=(char)((sum%2)+'0');
           carry=(char)((sum/2)+'0');
        }
    if(carry=='1'){
        ans+='1';
    }
        
        return new string(ans.Reverse().ToArray());
    }
}