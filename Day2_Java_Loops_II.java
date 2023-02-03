import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t ; i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int calc = a;
            for(int j=0 ; j < n ; j++)
            {
                calc += (Math.pow(2,j)*b);
                System.out.print(calc+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}
