import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
         Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n <= 1){
            System.out.print("False");
            return;
        }

        if(n == 2){
            System.out.print("True");
            return;
        }

        if(n % 2 == 0){
            System.out.print("False");
            return;
        }

        for(int i = 3; i * i <= n; i += 2){
            if(n % i == 0){
                System.out.print("False");
                return;
            }
        }

        System.out.print("True");
    }
}