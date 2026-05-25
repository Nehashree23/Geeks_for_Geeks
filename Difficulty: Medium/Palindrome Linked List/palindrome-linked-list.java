/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public boolean isPalindrome(Node head) {

        ArrayList<Integer> arr = new ArrayList<>();

        Node t = head;

        while (t != null) {
            arr.add(t.data);
            t = t.next;
        }

        int l = 0;
        int r = arr.size() - 1;

        while (l < r) {

            if (!arr.get(l).equals(arr.get(r))) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}