class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int option1 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
       int option2 = nums[0]*nums[1]*nums[nums.length-1];
       return Math.max(option1,option2); 
    }
}
/*
int finalAns =Integer.MIN_VALUE;
        if(nums.length ==3 ){
            return (nums[0] * nums[1] * nums[2]);
        }
        else{
            for(int ind =0;ind <nums.length-2;ind++){
                for(int jind =ind+1;jind<nums.length-1;jind++){
                    for(int knd =jind+1;knd <nums.length;knd++){
                        int answer = nums[ind]*nums[jind]*nums[knd];
                        System.out.println(answer +" ");
                        if(answer>finalAns){
                            finalAns = answer;
                        }
                    }
                }
            }
        }
        return finalAns;
        */