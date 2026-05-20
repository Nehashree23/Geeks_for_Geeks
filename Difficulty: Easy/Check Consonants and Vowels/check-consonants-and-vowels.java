class Solution {

    static void checkString(String s) {
        int vc = 0;
        int cc = 0;

        // code here
        
        for(char c:s.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vc++;
            }
            else{
                cc++;
            }
        }
        if(vc==cc){
            System.out.println("Same");
        }
        else if(vc>cc){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}