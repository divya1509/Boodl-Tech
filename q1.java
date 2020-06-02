import java.util.*;
public class q1 {

    static Scanner scn= new Scanner(System.in);

    private static void input( int[] array ) {
        
        //for input of the array
        for(int i=0; i<array.length; i++ ) array[i]= scn.nextInt();

    }

    private static ArrayList<Integer> solution(int[] array, int target ){

        ArrayList<Integer> ans= new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<array.length; i++){
            int diff= target - array[i];  
            if(hm.containsKey(diff)){
                ans.add(hm.get(diff));
                ans.add(i);
                return ans;
            }else hm.put(array[i], i);
        }
        
        //if no such pair is found return null arraylist
        return ans;
    }

    public static void main(String[] args) {
        
        int n= scn.nextInt();
        int[] array = new int[n];
        input(array);
        int target = scn.nextInt();

        ArrayList<Integer> result= solution(array, target);
        if( result.size()>0 ) System.out.println( result );
        else System.out.println( " No such pair found " );
    }


}