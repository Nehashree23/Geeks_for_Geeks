class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        String rev="";
        String w=s1+s2;
        for(int i=w.length()-1;i>=0;i--){
            rev+=w.charAt(i);
        }
        return rev;
    }
}