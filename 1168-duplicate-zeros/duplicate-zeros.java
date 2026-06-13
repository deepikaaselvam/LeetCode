class Solution {
    public void duplicateZeros(int[] arr) {
         ArrayList<Integer> answer = new ArrayList<>();

    for (int num : arr) {

        if (answer.size() == arr.length) {
            break;
        }

        answer.add(num);

        if (num == 0 && answer.size() < arr.length) {
            answer.add(0);
        }
    }

    for (int i = 0; i < arr.length; i++) {
        arr[i] = answer.get(i);
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