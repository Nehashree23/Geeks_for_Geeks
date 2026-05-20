class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        int r=1;
        for(int i=2;i<=n;i++){
            r*=i;
        }
        return r;
    }
}
