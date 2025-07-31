
// ** Tower of Hanoi ** //

public class tem6 {

    static int count=0;

    static void solve(int n , char s,char h,char d){
        
        if(n==0){
            return;
        }
        
        solve(n-1,s,d,h);

        count++;

        System.out.println(" Move Plat "+n+" from road "+s+" to rod "+d+"  ");

        solve(n-1,h,s,d);
    }

    public static void main(String[] args) {
        
        int n = 3;

        solve(n,'A','B','C');

        System.out.println("Total steps "+count);
    }
    
}
