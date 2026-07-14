class Solution {
    long s=0;
    public static long sumOfDivisors(long n) {
        // code here
        long sum=0;
        for (long i = 1; i <= n; i++) {
            sum += i * (n / i);
        }

        return sum;
     }
}