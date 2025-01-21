package ArrayList;

import java.util.ArrayList;

public class arrayList_practice {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //list.add(1,9);
        System.out.println(list);

        //Get operation
        //int element = list.get(2);
        //System.out.println(element);

        //remove operation
        //  list.remove(1);
        // System.out.println(list);

        //set element at index
        //list.set(2,10);
        // System.out.println(list);

        // System.out.println(list.contains(1));
        // System.out.println(list.contains(4));
        // System.out.println(list.contains(11));

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }    
}