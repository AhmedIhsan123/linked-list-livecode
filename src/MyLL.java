public class MyLL {
    private class Node {
        public Character value;
        public Node next;

        public Node (Character value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;

    public MyLL() {
        head = null;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public boolean contains (Character toFind) {
        Node curr = head;
        while (curr != null) {
            if (curr.value == toFind) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }


    public Character remove(char toRemove) {
        if (head == null) {
            return '\n';
        }

        if (head.value == toRemove) {
            head = head.next;
        }
        
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
