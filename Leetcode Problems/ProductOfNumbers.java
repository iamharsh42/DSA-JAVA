// Leetcode daily challenge: Product of the Last K Numbers --> Optimal solution (14/02/2025)
import java.util.ArrayList;

class ProductOfNumbers {
    private ArrayList<Integer> list;

    public ProductOfNumbers() {
       list = new ArrayList<>();
    }
    
    public void add(int num) {
        if(num == 0){
            list = new ArrayList<>();
        } else {
            if(list.isEmpty()){
                list.add(num);
            } else {
                list.add(num * list.get(list.size() -1));
            }
        }
    }
    
    public int getProduct(int k) {
        if(k > list.size()){
            return 0;
        } else {
            if(k == list.size()){
                return list.get(list.size() -1);
            } else {
                return list.get(list.size() -1)/list.get(list.size() -1 -k);
            }
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */