public class MyLL<T> {
    private class Node<E> {
        public E value;
        public Node<E> next;
        public Node<E> prev;

        public Node (E value, Node<E> next) {
            this.value = value;
            this.next = next;
            prev = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public MyLL() {
        head = null;
        tail = null;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.value);
            if (!(current.prev == null)) {
                System.out.println("Prev: " + current.prev.value);
            }
            current = current.next;
        }
    }

    public void printBackwards() {
        Node<T> curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.prev;
        }
    }

    public void addToBack(T toAdd) {
        Node<T> newNode = new Node<>(toAdd, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            Node<T> curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            newNode.prev = curr;
            curr.next = newNode;
            tail = newNode;
            return;
        }
    }

    public void printTail () {
        System.out.println(tail.value);
    }

    public boolean contains (T toFind) {
        Node<T> curr = head;
        while (curr != null) {
            if (curr.value.equals(toFind)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }


    public T remove(T toRemove) {
        if (head == null) {
            return null;
        }

        if (head.value.equals(toRemove)) {
            head = head.next;
            return null;
        }

        if (tail.value == toRemove) {
            if (tail.prev == null) {
                tail = tail.prev;
                tail = null;
                return  null;
            }
        }
        
        Node<T> current = head;

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
        return null;
    }
}
