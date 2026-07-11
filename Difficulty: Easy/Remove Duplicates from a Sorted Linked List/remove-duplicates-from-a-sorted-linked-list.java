/* Structure of linked list Node
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
    Node removeDuplicates(Node head) {
        // code here
        Node t=head;
        while(t.next!=null){
            if(t.data==t.next.data){
                t.next=t.next.next;
            }else{
                 t=t.next;
            }
           
        }
        return head;
    }
}