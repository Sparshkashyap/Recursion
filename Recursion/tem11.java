
import java.util.ArrayList;
import java.util.Scanner;


// ** Generate All balanced parantheses ** //

public class tem11{

    static void solve(int open,int close,String op,ArrayList<String> li){

        if(open==0 && close==0){
            li.add(op);
            return;
        }

        if(open!=0){

        String op1=op;
        solve(open-1,close,op1+"(",li);
        }

        if(close>open){
            String op2=op;
            solve(open,close-1,op2+")",li);
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ones=n;
        int zeros=n;
        String op="";
        ArrayList<String> li = new ArrayList<>();
        solve(ones,zeros,op,li);
        System.out.println(li);
    }

}