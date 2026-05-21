// User function Template for Java

class Solution {

    static int isHappy(int N) {
        // code here
        while (N != 1 && N != 4) {
            int sum = 0;
            while (N > 0) {
                int digit = N % 10;
                sum += digit * digit;
                N = N / 10;
            }

            N = sum;
        }

        return (N == 1) ? 1 : 0;
    }
}