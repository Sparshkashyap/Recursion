

// ** Josephus Problem ** //

// ** Solve this Question using the IBH method ** //

import java.util.ArrayList;
import java.util.Scanner;

public class tem9 {

    static  int solve(int k , int index, ArrayList<Integer> li){

        if(li.size()==1){
            return li.get(0);
        }

        index = (index+k)%li.size();
        li.remove(index);
        return solve(k, index, li);

    }
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();
        int index =0;
        int ans=-1;
        k=k-1;
        ArrayList<Integer> li = new ArrayList<>();

        for(int i=1; i<=n; i++){
            li.add(i);
        }

        ans = solve(k,index,li);
        System.out.println("Lucky person :"+ans);   
        
    }
    
}
