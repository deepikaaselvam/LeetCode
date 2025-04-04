class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer>result = new ArrayList<>();
        //C->Undo the Last Element preent in the list
        //D=Double the Last Element present in the list and add the result of Doubled value into the list
        //+ =Remove and Add the last Two Elements from the list  and add the Result into the list
        for(int index =0;index<operations.length;index+=1)
        {
            if(operations[index].equals("C"))
            {
                result.remove(result.size()-1);
            }
            else if(operations[index].equals("D"))
            {
                int lastElement = result.get(result.size()-1);
                result.add(lastElement * 2);
            }
            else if(operations[index].equals("+"))
            {
                int lastOne =result.get(result.size()-1);
                int secondLast = result.get(result.size()-2);
                result.add(lastOne+secondLast);
            }
            else{
                int number= Integer.parseInt(operations[index]);
                result.add(number);
            }
        }
        int sum =0;
        for(int ind =0;ind<result.size();ind+=1)
        {
            sum+=result.get(ind);
        }
        return sum;
        
    }
}