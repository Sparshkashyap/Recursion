
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


// ** Print All Subsets ** //
// ** print All the Unique Subsets ** //

public class tem7 {

    static  void solve(String ip,String op,ArrayList<String> lis){

        if(ip.length()==0){
            lis.add(op);
            System.out.print(" "+op);
          
            return;
        }

        String op1=op;
        String op2=op;

        char c=ip.charAt(0);
        String res = ip.substring(1);

        solve(res,op1,lis);

        solve(res,c+op2,lis);

        return;
    }

   

    public static void main(String[] args) {

        String ip="aab";

        ArrayList<String> lis = new ArrayList<>();

        solve(ip,"",lis);

        Map<String,Integer> map = new HashMap<>();

        for(int i=0; i<lis.size(); i++){

            if(map.containsKey(lis.get(i))){
                map.remove(lis.get(i));
            }
            else{

                map.put(lis.get(i),1);
            }
        }

        System.out.println();
        for(Map.Entry<String,Integer> s : map.entrySet()){

            System.out.print(s.getKey()+" ");
        }
        
        
    }
    
}


