package DP;

import java.util.Arrays;


// ** 0/1 knapsack problem => solve using DP -> Recursion + Memorization ** //

public class tem2 {

    static int n=102;
    static int W=1002;

   static int[][] t = new int[n][W];
   
 

    static int knapsack(int val[],int wt[],int W,int n){

        if(n==0 || W==0){
            return 0;
        }

        if(t[n][W]!=-1)
        {
            
            return t[n][W];
        }

        if(wt[n-1]<=W){

            return   t[n][W]=Math.max((val[n-1]+knapsack(val, wt, W-wt[n-1], n-1)),knapsack(val, wt, W, n-1));
        }

        return t[n][W]=knapsack(val, wt, W, n-1);
    }


    public static void main(String[] args) {

        int val[] = {10, 40, 30, 50};
        int wt[] = {5,4,2,3};
        int W = 5;
        int n=val.length;
        int ans=-1;
        for(int i=0; i<102; i++){

          Arrays.fill(t[i],-1);
        }
        ans=knapsack(val, wt, W, n);
        System.out.println("Maximum profit through Memorization : "+ans);
        

    }

    
}
