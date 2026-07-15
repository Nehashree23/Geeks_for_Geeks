class Solution {
    public static boolean isPalindrome(String s) {
        // code here
        String r="";
        String l=s.toLowerCase();
        for(int i=l.length()-1;i>=0;i--){
            r+=l.charAt(i);
        }
        return r.equals(l);
    }
}