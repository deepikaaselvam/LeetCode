class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int result = arr[1]-arr[0];
        for(int index =1;index<arr.length-1;index+=1)
        {
          if(result!=(arr[index+1]-arr[index]))
          {
            return false;
          }
        }
        return true;
        
    }
}