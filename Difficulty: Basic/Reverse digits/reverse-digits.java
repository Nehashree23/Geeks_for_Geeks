class Solution {
    public int reverseDigits(int n) {
        // Code here
        int t=n;
        int r=0;
        while(t!=0){
            int d=t%10;
            r=r*10 +d;
            t=t/10;
        }
        return r;
    }
}