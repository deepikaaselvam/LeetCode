class Solution {
    public String largestNumber(int[] nums) {
        // int[]nums ={10,2};//{3,30,34,5,9};////
        String []StringArray = new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            StringArray[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(StringArray,(a,b)->(b+a).compareTo(a+b));
        StringBuilder answer = new StringBuilder();
        for(String ans : StringArray)
        {
            answer.append(ans);
        }
        String result =answer.toString();
        return result.startsWith("0") ? "0":result;

    }
}



/*
       int number=nums[0];
        String answer=String.valueOf(number);
        int value=0;
        for(int i=1;i<nums.length;i++)
        {
            value = Integer.parseInt(answer)%10;
            int second=nums[i];
            int modSecond =second %10;
            if(value>modSecond)
            {
                answer=answer+ String.valueOf(second);
            }
            else{
                answer=String.valueOf(second)+answer;
            }

        }
        return answer;
        
        */