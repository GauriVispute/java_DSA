package Array_list_DS;
import java.util.ArrayList;
public class pair_sum {


    // Time Complexity -> O(n^2)
    public static void pairSum(ArrayList<Integer> list,int targetSum){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == targetSum){  //n1+n2 ==targetSum
                    System.out.println("Sum of pair : ("+list.get(i)+","+list.get(j)+")");
                }
            }
        }
    }

    // time Compilexity -> O(n)
    public static void pair_Sum(ArrayList<Integer> list,int targetSum){
        int lp = 0;
        int rp = list.size()-1;

        while(lp!=rp){
            //kaam
            if(list.get(lp)+list.get(rp) == targetSum){
                System.out.println("Sum of pair : ("+list.get(lp)+","+list.get(rp)+")");
            }
            //update pointer
            if(list.get(rp)>list.get(lp)){
                rp--;
            } else{
                lp++;
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int targetSum = 5;
        pair_Sum(list,targetSum);

    }
}
