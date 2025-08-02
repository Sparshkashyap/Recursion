package DP;


// ** 0/1 Knapsack  problem ** //

public class tem1 {

    static  int knapsack(int val[],int wt[],int W,int n){

        if(n==0 || W==0){
            return 0;
        }

        if(wt[n-1]<=W){

            return Math.max((val[n-1]+knapsack(val, wt, W-wt[n-1], n-1)),knapsack(val, wt, W, n-1));
        }
        
        return knapsack(val, wt, W, n-1);

    }

    public static void main(String[] args) {

        int val[] = {10, 40, 30, 50};
        int wt[] = {5,4,2,3};
        int W = 5;
        int n=val.length;

        int ans=-1;

        ans = knapsack(val,wt,W,n);
        System.out.println("Maximum Profit is: "+ans);
        
    }


    
}
