import java.util.*;
import java.io.*;

class loops_two{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int q;
    
         //(a + b)   (a + b + 2b)   (a + b + 2b + 4b) .... (a + b + 2b + 4b + ..... + 2^(n-1)b)
            //a = 2, b = 3, n = 4
            //(5)[n = 0]  (2 + 3 + 6)[n=1] (2 + 3 + 6 + 12)[n=2] (2 + 3 + 6 + 12 + 24)
    
        q = scanner.nextInt();
        int a,b,n;
    
        for(int i = 0; i < q; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();
            outputPrint(a,b,n);
            System.out.println("");
        }
        }
    
        public static void  outputPrint(int a, int b, int n){
        int p = n;
        n = 1;
        int exp = (a + b);  //exp = 8
        System.out.print(exp + " ");
        while(n < (p)){
            exp += (Math.pow(2,n)*b); //
            System.out.print(exp + " ");     
            n++;   
        }
    }
}
