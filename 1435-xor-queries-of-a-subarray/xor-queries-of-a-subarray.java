class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[]prefixXOR = new int [arr.length];
        prefixXOR[0]=arr[0];
        for(int ind =1;ind<arr.length;ind++){
            prefixXOR[ind]= prefixXOR[ind-1] ^ arr[ind];
        }
       int[]answer = new int[queries.length];
        for(int ind = 0;ind < queries.length;ind++){
            int ind1 = queries[ind][0];
            int ind2 = queries[ind][1];
           if(ind1==0){
            answer[ind] = prefixXOR[ind2];
           }else{
            answer[ind]= prefixXOR[ind2] ^ prefixXOR[ind1 -1];
           }
        }
        return answer;    
    }
}