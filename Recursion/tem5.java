
// ** DeleteMiddleElement of the Stack ** //

import java.util.Stack;

public class tem5 {

    static void MiddleElement(Stack<Integer> s,int n){

        if(n==1){
            s.pop();
            return;
        }

        int temp = s.pop();
        MiddleElement(s, n-1);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);

        int n = s.size()/2 + 1 ;

        MiddleElement(s,n);

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        
    }


    
}
