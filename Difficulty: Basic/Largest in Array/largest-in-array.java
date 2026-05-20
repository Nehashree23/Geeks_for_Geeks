class Solution {
    public static int largest(int[] arr) {
        // code here
        int l=0;
        for(int e:arr){
            if(e>l){
                l=e;
            }
        }
        return l;
    }
}
