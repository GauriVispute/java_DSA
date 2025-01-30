package Array_list_DS;

import java.util.ArrayList;

public class reverse_arryList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
