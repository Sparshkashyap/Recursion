import java.util.ArrayList;
import java.util.Scanner;

public class tem10 {

    static void solve(int n,int ones,int zeros,ArrayList<String> li,String op){

        if(n==0){
            li.add(op);
            return;
        }

        String op1=op;
        solve(n-1,ones+1,zeros,li,op1+"1");

        if(ones>zeros){
            String op2=op;
            solve(n-1,ones,zeros+1,li,op2+"0");
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ones = 0;
        int zeros = 0;
        String op="";
        ArrayList<String> li = new ArrayList<>();
        solve(n,ones,zeros,li,op);
        System.out.println(li);

        
        
    }
    
}
