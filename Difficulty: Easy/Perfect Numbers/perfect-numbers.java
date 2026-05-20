class Solution {
    static boolean isPerfect(int n) {
        // code here
        if(n == 1) {
            return false;
        }
        int s=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                s+=i;
                if(i != n / i) {

                    s += n / i;
                }
            }
             
        }
        return s==n;
    }
};