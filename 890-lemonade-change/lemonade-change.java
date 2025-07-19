class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer>balance = new HashMap<>();
        for(int ind =0;ind<bills.length;ind+=1)
        {
            if(bills[ind]==5)
            {
                balance.put(5,balance.getOrDefault(5,0)+1);
            }
            else if(bills[ind]==10)
            {
                if(balance.containsKey(5)&& balance.get(5)>0)
                {
                    balance.put(5,balance.get(5)-1);
                    balance.put(10,balance.getOrDefault(10,0)+1);
                }
                else
                {
                    return false;
                }
            }
            else {
                // int acc1= balance.getOrDefault(5,0);
                // int acc2=balance.getOrDefault(10,0);
                if(balance.containsKey(5)&& balance.get(5)>=1 && balance.containsKey(10) &&balance.get(10)>=1) {
                    balance.put(5,balance.get(5)-1);
                    balance.put(10,balance.get(10)-1);
                    balance.put(20,balance.getOrDefault(20,0)+1);
                    
                }
                else if(balance.containsKey(5) && balance.get(5)>=3)
                {
                    balance.put(5,balance.get(5)-3);
                    balance.put(20,balance.getOrDefault(20,0)+1);
                }
             
                else
                {
                    return false;
                }
                
            }
        }
        return true;
    }
}