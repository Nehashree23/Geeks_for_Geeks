class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Set<Integer> s=new HashSet<>();
        ArrayList<Integer> r=new ArrayList<>();
        for(int i:arr){
            if(s.contains(i)){
                r.add(i);
            }
            s.add(i);
        }
        return r;
    }
}