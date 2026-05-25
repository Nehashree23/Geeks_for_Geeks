// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
        String r="";
        Set<Character> st=new HashSet<>();
        for(char c:s.toCharArray()){
            if(st.contains(c)){
                r+=c;
                return r;
             
            }
              st.add(c);
        }
        return "-1";
    }
}