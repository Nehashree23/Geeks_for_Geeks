class Solution {
    public long product(long arr[]) {
        // code here
        long mod = 1000000007;
        long prd = 1;
        for (int i = 0; i < arr.length; i++) {
            prd = (prd * arr[i]) % mod;
        }
        return prd;
    }
}