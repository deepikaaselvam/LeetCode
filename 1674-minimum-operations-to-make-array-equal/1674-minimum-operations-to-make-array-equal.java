class Solution {
    public int minOperations(int n) {
        int minimumOperations =0;
        int left =0;
        int right =n-1;
        if(n%2!=0)
        {
           
            int mid =(left+right)/2;
            for(int index =0;index<mid;index+=1)
            {
                minimumOperations+=(2*mid+1)-(2*index+1);
            }
            return minimumOperations;
        }
        int miniOperations =0;

        int mid1 =(left+right)/2;
        int mid2 = ((left+right)/2)+1;
        int equalOne =((2*mid1+1)+(2*mid2+1))/2;
        for(int indexx =0;indexx<=mid1 ;indexx+=1)
        {
            miniOperations  = miniOperations + (equalOne -(2*indexx+1));
        }
        return miniOperations;
        
    }
}