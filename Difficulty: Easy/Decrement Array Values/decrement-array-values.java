class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        int[] r=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            r[i]=arr[i]-1;
        }
        return r;
    }
}