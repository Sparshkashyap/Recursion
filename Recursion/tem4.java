
import java.util.Stack;

// ** Sort an Stack using Recursion ** //

public class tem4 {

    static void sortInsertstack(Stack<Integer> s , int x){

        if(s.isEmpty() || x > s.peek()){
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortInsertstack(s, x);
        s.push(temp);
    }
    

    static void sort(Stack<Integer> s){

        if(!s.isEmpty()){
            int x = s.pop();
            sort(s);
            sortInsertstack(s,x);
        }
    }



    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();

        s.push(41);
        s.push(21);
        s.push(2);
        s.push(5);
        s.push(1);
        s.push(11);

        sort(s);

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }

       

    }
    
}
