package ArrayList;
import java.util.ArrayList;

public class container_with_most_water {
     //Time complexity = o(n);
    public static int containerWithMostWater(ArrayList<Integer> height){
        int maxStoredWater =0 ;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int height_of_container = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int storedWater = width*height_of_container;
                if(storedWater>maxStoredWater){
                    maxStoredWater = storedWater;
                }
            }
        }

        return maxStoredWater;
    }

    // 2 pointer approach -> O(n)
    public static int storedWater(ArrayList<Integer> height){
        int lp=0;
        int rp =height.size()-1;
        int maxWater = 0;

        while(lp<rp){
            // min height of water 
            int minHeight = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currWater = minHeight*width;
            maxWater = Math.max(maxWater,currWater);

            if(height.get(lp)<height.get(rp)){
                lp++;
            } else{ //rp_ht>lp
                rp--;
            }
            
        }
        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

       // System.out.println(containerWithMostWater(height));

       System.out.println("Maximum water : "+storedWater(height));
    }
}
