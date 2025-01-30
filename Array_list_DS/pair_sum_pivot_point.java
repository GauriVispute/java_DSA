package Array_list_DS;
import java.util.ArrayList;

public class pair_sum_pivot_point {

    //sorted and  rotated
    public static boolean pairSum2(ArrayList<Integer> list,int targetSum){
        int bp = -1;
        //find breaking point
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        //modular Arithematic
        int n = list.size();
        while(lp!=rp){
            if(list.get(lp)+list.get(rp) == targetSum){
                //System.out.println(list.get(lp)+" "+list.get(rp));
                return true;
            } 
            
            if(list.get(lp)+list.get(rp) < targetSum){
                lp = (lp+1)%n;
            } else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int targetSum = 16;
        pairSum2(list,targetSum);
    }
}