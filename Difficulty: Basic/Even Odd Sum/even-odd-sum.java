class Solution {
    public int[] evenOddSum(int[] arr) {
        // code here
        int e=arr[0];
        int o=0;
        int [] r=new int[2];
        for(int i=1;i<arr.length;i++){
            if(i%2!=0){
                o+=arr[i];
            }
            else{
                e+=arr[i];
            }
        }
        r[0]=o;
        r[1]=e;
        return r;
    }
}