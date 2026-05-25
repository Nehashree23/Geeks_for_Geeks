/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node d=new Node(-1);
        Node t=d;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                t.next=head1;
                head1=head1.next;
            }
            else{
                t.next=head2;
                head2=head2.next;
            }
            t=t.next;
        }
        if(head1!=null){
            t.next=head1;
        }
        else{
            t.next=head2;
        }
        return d.next;
    }
}