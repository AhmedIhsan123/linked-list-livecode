public class Practice {
    public static void main(String[] args) {
        // System.out.println("~linked lists practice~");
        Node head = new Node('g', null);
        // System.out.println(head.value);
        // System.out.println(head.next);

        Node ryan = new Node('s', null);
        head.next = ryan;
        ryan.next = new Node('t', null);
        ryan.next.next = new Node('x', null);

        // System.out.println(head.next.next.value);
        printList(head);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
