
// ** Letter case Change ** //

import java.util.ArrayList;

public class tem12 {

    static void solve(String ip,String op,ArrayList<String> li){

        if(ip.length()==0){
            li.add(op);
            return;
        }
        String op1=op;
        String op2=op;
        char ch=ip.charAt(0);
        String res = ip.substring(1);
        int num = (int)(ch);
        if(num<65){
            solve(res,op+ch,li);
        }
        else{
        solve(res,op1+Character.toLowerCase(ch),li);
        solve(res,op2+Character.toUpperCase(ch),li);
        }
        return;
    }

    public static void main(String[] args) {

        String ip="ab";
        String op="";
        ArrayList<String> li = new ArrayList<>();

        solve(ip,op,li);

        System.out.println(li);
        
    }
    
}
