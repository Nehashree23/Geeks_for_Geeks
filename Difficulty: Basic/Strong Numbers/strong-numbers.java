// User function Template for Java

class Solution {
    public int is_StrongNumber(int n) {
        // Code here
        int r=n;
        int s=0;
        int p=1;
        while(n>0){
            int t=n%10;
            for(int i=2;i<=t;i++){
                 p=i*p;
            }
            s+=p;
            p=1;
            n/=10;
        }
        if(r==s){
           return 1; 
        }
        else{
            
        return 0;
        }
    }
}