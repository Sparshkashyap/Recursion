

// ** 0/1 knapsack problem => solve using bottom-up dp => Tabulation  ** //



public class tem3 {

    public static void main(String args[]){

        int val[] = {10, 40, 30, 50};
        int wt[] = {5,4,2,3};
        int W = 5;
        int n = val.length;
        int t[][]  = new int[n+1][W+1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=W; j++){

                if(i==0 || j==0){

                    t[i][j] = 0;
                }
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=W; j++){

                if(wt[i-1]<=j){
                    
                    t[i][j] = Math.max((val[i-1]+t[i-1][j-wt[i-1]]),t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }


        System.out.println("Maximum profit :"+t[n][W]);

    }
    
}
