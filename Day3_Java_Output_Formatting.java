import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        System.out.println("================================");
        for( int i = 0; i < 3; i++)
        {
            String put = scan.next();
            int x = scan.nextInt();
            System.out.format("%-15s%03d%n", put, x);
            /*
            */
        }
        System.out.println("================================");
        
    }
}
/*System.out.format instead of System.out.println as it is use to format the output. So our code will be –> System.out.format();
Next we will use Modulus(%) within double quote. So our code will be –> System.out.format(“% “);
Next we will use ‘-‘ after modulus which will instruct the compiler that it will be left indent, if you want to use right indent do not use “-“. So our code will be –> System.out.format(“%- “);
The 15 makes our String to be a minimum length of 15, it is required as per the question. So our code will be –> System.out.format(“%-15”);
s will be substituted by our String. This will mark the end of first requirement. So our code will be –> System.out.format(“%-15s”);
Now the second part of the question. So again we will put %  and put 3d in order to  format integer. The 3 makes our integer be a minimum length of 3. So our code will be –> System.out.format(“%-15s%3d”);
%n will help to go to the next line */
