class Solution {
    public int gcdOfOddEvenSums(int n) {
        /*int evenCount =0;
        int evenCountSum =0;
        int oddCount =-1;
        int oddCountSum =0;
        for(int ind =0;ind<n;ind++){
            oddCount +=2;
            oddCountSum+=oddCount;
            evenCount+=2;
            evenCountSum += evenCount;
        }
        int largest =0;int smallest =0;
         if(oddCountSum>evenCountSum){
          largest = oddCountSum;
          smallest = evenCountSum;
         }else{
            largest = evenCountSum;
            smallest = oddCountSum;
         }
         if(smallest ==0){
            return largest;
         }
         int remainder = 0;
         while(smallest!= 0){
            remainder = largest%smallest;
            System.out.println("Remainder : "+remainder);
            largest = smallest;
            smallest = remainder;   
         }
         return largest;*/
         return n;
    }
  
}