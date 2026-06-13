class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer>answer = new ArrayList<>();
        for(int ind =0;ind<arr.length;ind++){
            if(arr[ind]==0 && answer.size()<arr.length){
                answer.add(0);
            }
            answer.add(arr[ind]);
        }
        for(int ind =0;ind<arr.length;ind++){
            arr[ind]= answer.get(ind);
        }
    }
}
/*
    int for_temp = -1;
        int value = -1;
        for(int ind =0;ind<arr.length-1;ind++){
            if(ind>0 && arr[ind]==0&& arr[ind-1]==0){
                for_temp = arr[ind+1];
                arr[ind+1] = value;
            }else if(arr[ind] == 0){
                for_temp = arr[ind+1];
                arr[ind+1]= 0;
                value = for_temp;
            }else if(arr[ind] != 0 && for_temp != -1){
                arr[ind+1] = for_temp;
                for_temp = -1;
            }
        }
        */