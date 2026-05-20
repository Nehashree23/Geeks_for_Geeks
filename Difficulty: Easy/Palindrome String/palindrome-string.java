class Solution {
    boolean isPalindrome(String s) {
        // code here
        int l=s.length();
        for(int i=0;i<l/2;i++){
            if(s.charAt(i) != s.charAt(l - 1 - i)){
               return false; 
            }
        }
        return true;
    }
}