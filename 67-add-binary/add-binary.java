class Solution {
    public String addBinary(String a, String b) {
        char []c1=a.toCharArray();
        char []c2=b.toCharArray();
        StringBuilder answer = new StringBuilder();
        int i=c1.length-1 ,j=c2.length-1;
        int carry=0;
        while(i>=0 ||j>=0|| (carry>0))
        {
            int val1=(i>=0)?Character.getNumericValue(c1[i]):0;
            int val2=(j>=0)?Character.getNumericValue(c2[j]):0;
            int ans = (val1+val2+carry);
            answer.append(ans%2);
            carry= (ans)/2;
            i--;j--;
        }
        answer.reverse();
        return answer.toString();
    }
}