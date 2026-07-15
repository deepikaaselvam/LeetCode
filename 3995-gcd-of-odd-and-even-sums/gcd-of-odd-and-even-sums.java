class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenCount =0;
        int evenCountSum =0;
        int oddCount =-1;
        int oddCountSum =0;
        for(int ind =0;ind<n;ind++){
            oddCount +=2;
            oddCountSum+=oddCount;
            evenCount+=2;
            evenCountSum += evenCount;
        }
       
         int remainder = 0;
         while(oddCountSum!= 0){
            remainder = evenCountSum%oddCountSum;
            System.out.println("Remainder : "+remainder);
            evenCountSum = oddCountSum;
            oddCountSum = remainder;   
         }
         return evenCountSum;
        //  return n;
    }
  
}