class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> r = new ArrayList<>();
        int D = b * b - 4 * a * c; 
        if (D < 0) {
            r.add(-1); 
            return r;
        }

        double sqrtD = Math.sqrt(D);
        double root1 = (-b + sqrtD) / (2.0 * a);
        double root2 = (-b - sqrtD) / (2.0 * a);
        int r1 = (int)Math.floor(root1);
        int r2 = (int)Math.floor(root2);
        if (r1 >= r2) {
            r.add(r1);
            r.add(r2);
        } else {
            r.add(r2);
            r.add(r1);
        }

        return r;
       
    }
}