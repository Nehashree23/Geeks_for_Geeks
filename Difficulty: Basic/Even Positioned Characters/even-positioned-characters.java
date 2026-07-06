class Solution {
    public static void utility(String s) {
        // code here
        String res="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                res+=s.charAt(i);
            }
        }
        System.out.print(res);
    }
}