class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int x = a;
        int y = b;
        while(a != b) {
            if(a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        int gcd = a;
        int lcm = (x * y) / gcd;
        return new int[]{lcm, gcd};
    }
}