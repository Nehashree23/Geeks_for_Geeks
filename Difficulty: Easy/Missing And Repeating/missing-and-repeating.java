class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {

        long n = arr.length;

        long sumN = n * (n + 1) / 2;
        long sumSqN = n * (n + 1) * (2 * n + 1) / 6;

        long sum = 0;
        long sumSq = 0;

        for (int num : arr) {
            sum += num;
            sumSq += (long) num * num;
        }

        long diff = sum - sumN;          
        long diffSq = sumSq - sumSqN;    

        long sumRM = diffSq / diff;      

        long R = (diff + sumRM) / 2;
        long M = sumRM - R;

        ArrayList<Integer> result = new ArrayList<>();
        result.add((int) R); 
        result.add((int) M);

        return result;
    }
}
