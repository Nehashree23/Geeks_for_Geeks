class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> r=new ArrayList<>();
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int e:arr){
            if(e>large){
                large=e;
            }
        }
        for(int e:arr){
            if(e<small){
                small=e;
            }
        }
        r.add(small);
        r.add(large);
     
        return r;
    }
}
