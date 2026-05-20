class Solution {

    // merge two sorted bottom lists
    Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;

        if (a.data < b.data) {
            result = a;
            result.bottom = merge(a.bottom, b);
        } else {
            result = b;
            result.bottom = merge(a, b.bottom);
        }

        result.next = null; // important: remove next pointers
        return result;
    }

    public Node flatten(Node root) {
        if (root == null || root.next == null)
            return root;

        // recursively flatten right side
        root.next = flatten(root.next);

        // merge current list with flattened right list
        root = merge(root, root.next);

        return root;
    }
}