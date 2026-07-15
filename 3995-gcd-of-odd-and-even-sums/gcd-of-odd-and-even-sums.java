class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evenCountSum = n*n;
        int oddCountSum = n*(n+1);
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