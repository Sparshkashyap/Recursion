
// ** print N to 1 through recusion ** //
// solve this Question using IBH method 
public class tem{
   static void print(int N){
   
       if(N<=1){
           System.out.println(N); // Base case
           return;
       }
   
      
   System.out.println(N); // Induction

       print(N-1); // Hypothesis

        
   }

//    static void print(int N){

//         if(N==1){
//             System.out.println(N); 
//             return;
//         }

//         System.out.println(N);

//         print(N-1);

       

       
//     }
    public static void main(String[] args) {
        
        print(7);
    };
};