// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int s=0;
        int t=n;
        while(t>0){
            int rem=t%10;
            s+=Math.pow(rem,3);
            t/=10;
        }
        if(n==s){
            return true;
        }
        return false;
    }
}