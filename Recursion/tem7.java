
// ** Print All Subsets ** //

public class tem7 {

    static  void solve(String ip,String op){

        if(ip.length()==0){
            System.out.print(" "+op);
            return;
        }

        String op1=op;
        String op2=op;

        char c=ip.charAt(0);
        String res = ip.substring(1);

        solve(res,op1);

        solve(res,c+op2);

        return;
    }

   

    public static void main(String[] args) {

        String ip="abc";

        solve(ip,"");
    }
    
}
