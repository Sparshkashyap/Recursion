
import java.util.Arrays;


// ** Sort an Array using Recursion ** //


public class tem3 {

    static   void insert(int arr[] ,int n){
        
        if(n == 0 || arr[n-1]<arr[n]){
            return;
        }
        
        int temp = arr[n];
        arr[n]=arr[n-1];
        arr[n-1]=temp;
        
        insert(arr,n-1);
    }
    
    static void sort(int arr[], int n){
        
        if(n<=1){
            return;
        }
        
        sort(arr,n-1);
        
        insert(arr,n-1);
    }
    public static void main(String[] args) {
        
        int arr[] = {5,4,3,2,1};

        sort(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }
    
}
