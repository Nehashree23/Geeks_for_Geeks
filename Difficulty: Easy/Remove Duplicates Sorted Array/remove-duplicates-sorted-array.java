class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        Set<Integer> s=new HashSet<>();
         ArrayList<Integer> r =new ArrayList<>();
        for(int e:arr){
            if(!s.contains(e)){
                s.add(e);
                r.add(e);
            }
        }
        return r;
    }
}
