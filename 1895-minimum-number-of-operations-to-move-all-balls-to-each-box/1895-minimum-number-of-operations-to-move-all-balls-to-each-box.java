class Solution {
    public int[] minOperations(String boxes) {
        int answer[]= new int[boxes.length()];
        int[]Questionarray = new int[boxes.length()];
        for(int i=0;i<boxes.length();i++)
        {
            Questionarray[i]=boxes.charAt(i)-'0';
        }
        int leftArray[]=new int[boxes.length()];
        int[]rightArray=new int[boxes.length()];
        int OnesCnt=0;
        //To calculate the left prefixsum and left One Count
        OnesCnt=Questionarray[0];
        leftArray[0]=0;
        for(int i=1;i<leftArray.length;i++)
        {
            leftArray[i]=leftArray[i-1]+OnesCnt;
            OnesCnt+=Questionarray[i];
        }
        //To calculate the right prefixsum and right One Count
        OnesCnt=Questionarray[Questionarray.length-1];
        rightArray[rightArray.length-1]=0;
        for(int i=rightArray.length-2;i>=0;i--)
        {
            rightArray[i]=rightArray[i+1]+OnesCnt;
            OnesCnt+=Questionarray[i];
        }
        //To Calculate the Answer
        for(int i=0;i<boxes.length();i++)
        {
            answer[i]=leftArray[i]+rightArray[i];
        }
       
        return answer;

        // int answer[]= new int[boxes.length()];
        // char[]CharacterArray = boxes.toCharArray();
        // for(int i=0;i<CharacterArray.length;i++)
        // {
        //     for(int j=0;j<CharacterArray.length;j++)
        //     {
        //         if(CharacterArray[j]=='1')
        //         {
        //             answer[i]+=Math.abs(i-j);
        //         }
        //     }
        // }
        // return answer;
        
    }
}