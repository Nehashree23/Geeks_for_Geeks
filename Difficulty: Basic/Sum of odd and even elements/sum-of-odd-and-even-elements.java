class Solution {
    public int[] findSum(int n) {
        // Code here
        int e=0;
        int o=0;
        int[]r=new int[2];
        for(int i=1;i<=n;i++){
            if(i%2==0){
                e+=i;
            }
            else{
                o+=i;
            }
        }
        r[0]=o;
        r[1]=e;
        return r;
    }
}