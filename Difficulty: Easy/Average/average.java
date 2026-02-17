class Solution {
    public static double posAverage(int[] arr) {
        // Code here
        int s=0;
        int c=0;
        for(int e:arr){
            if(e>=0){
                s+=e;
                c++;
            }
        }
        return (double)s/c;
    }
}
