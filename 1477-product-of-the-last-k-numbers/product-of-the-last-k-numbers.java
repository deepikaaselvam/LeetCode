class ProductOfNumbers {
    private ArrayList<Integer>list;

    public ProductOfNumbers() {
       this.list = new ArrayList<>();
        this.list.add(1);
        
    }
    
    public void add(int num) {
        // if(num==0)
        // {
        //     this.list = new ArrayList<>();
        //     this.list.add(1); 
        // }
        // else
        // {
             this.list.add(num);
        
       


        
    }
    
    public int getProduct(int k) {
        if(k>=list.size())
        {
            return 0;
        }
        int cnt=0;
        int prdt = 1;
        int i=list.size()-1;
        while(i>=0 && cnt<k)
        {
            prdt *= list.get(i);
            cnt++;
            i--;
        }
        return prdt;
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */