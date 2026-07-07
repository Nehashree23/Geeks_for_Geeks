class Solution {
    int middle(int a, int b, int c) {
        // code here
        if(a>b && a<c || a<b && a>c){
            return a;
        }
        if(c>b && c<a || c<b && c>a){
            return c;
        }
        return b;
    }
}