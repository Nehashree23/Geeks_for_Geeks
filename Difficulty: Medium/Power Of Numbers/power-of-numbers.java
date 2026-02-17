class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int t=n;
        int rev=0;
        while(t>0){
           int d=t%10;
           rev=rev*10+d;
           t/=10;
        }
        int r=(int)Math.pow(n,rev);
        return r;
    }
}
