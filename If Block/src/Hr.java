import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        if(n % 2==1)
        {
            System.out.println( "Weird");
        }
        else
        {
            if (n>2 && n>5)
            {
                System.out.println(" Not Weird");
            }
            
            else if( n<=20)
            {
                System.out.println("Weird");
            }
            else
            
              System.out.println(" Not Weird");
            
        }
        
    }
}
