
class Solution {
    public String longest(List<String> arr) {
        // code here
        String l="";
        for(String e:arr){
            if(e.length()>l.length()){
                l=e;
            }
        }
        return l;
    }
}
