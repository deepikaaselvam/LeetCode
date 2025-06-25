class Pair{
    int ind;
    int value;
    Pair(int ind,int value)
    {
        this.ind=ind;
        this.value=value;
    }
}
class Solution {
    
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair>stt= new Stack<>();
        int[]ans= new int[temperatures.length];
        int last =ans.length-1;
        ans[last]=0;
        int lastValue =temperatures[temperatures.length-1];
        stt.push(new Pair(last,lastValue));
        for(int ind=temperatures.length-2;ind>=0;ind-=1)
        {
            while(!stt.isEmpty() && stt.peek().value<=temperatures[ind])
            {
                stt.pop();
            }
            if(!stt.isEmpty() && stt.peek().value>temperatures[ind])
            {
                ans[ind]=(stt.peek().ind)-ind;
            }
            stt.push(new Pair(ind,temperatures[ind]));
        }
        return ans;
        
    }
}