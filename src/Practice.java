public class Practice {
    public static void main(String[] args) {
        // System.out.println("~linked lists practice~");
        Node head = new Node('g', null);
        // System.out.println(head.value);
        // System.out.println(head.next);

        Node ryan = new Node('s', null);
        head.next = ryan;
        ryan.next = new Node('k', null);
        ryan.next.next = new Node('t', null);

        // System.out.println(head.next.next.value);
        // Expected result: true
        System.out.println(contains(head, 'x'));

        // Expected result: false
        System.out.println(contains(head, 'e'));

        // Expected result: 't'
        System.out.println(remove(head, 't'));

        // Expected result: '\0'
        System.out.println(remove(head, 't'));

        MyLL<Character> list = new MyLL<>();
        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('q');
        
        list.printList();

        MyLL<Integer> intlist = new MyLL<>();

        intlist.addToBack(7);
        intlist.addToBack(11);

        intlist.printTail();
        intlist.remove(11);
        intlist.printTail();
        intlist.printList();
        intlist.remove(7);

    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static boolean contains (Node start, Character toFind) {
        Node curr = start;
        while (curr != null) {
            if (curr.value == toFind) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }


    public static Character remove(Node head, char toRemove) {
        Node current = head;

        while (current.next != null) {
            // Check if the next value is the one to remove
            if (current.next.value == toRemove) {
                // Assign to next next pointer
                current.next = current.next.next;

                // Return, value has been removed
                return toRemove;
            }

            current = current.next;
        }
        return '\0';
    }
}
