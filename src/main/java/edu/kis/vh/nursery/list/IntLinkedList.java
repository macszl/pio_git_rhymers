package edu.kis.vh.nursery.list;

/**
 * The IntLinkedList class is an implementation of the common data structure: one-way linked list.
 * This class contains a Node class, and functions allowing adding, deleting and checking the last Node element.
 */
class IntLinkedList {


    public static final int ERROR_RETURN_VAL = -1;
    private Node last;
    int i;

    /**
     * @param i
     * This function creates a new Node object with the value of i, and places it at the end of the linked list.
     * If the list is empty, this just involves the invocation of the Node constructor.
     * If not, the function also updates the prev and next of the previous last node.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.setPrev(last);
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    /**
     * @return
     * This functon returns the value of the last Node object of the linked list.
     * Returns ERROR_RETURN_VAL if empty.
     */
    public int top() {
        if (isEmpty())
            return ERROR_RETURN_VAL;
        return last.value;
    }

    /**
     * @return
     * This object removes the last Node element of the linked list.
     * Returns ERROR_RETURN_VAL if empty.
     */
    public int pop() {
        if (isEmpty())
            return ERROR_RETURN_VAL;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    public Node getLast() {
        return last;
    }


}

class Node {


    public final int value;
    public Node prev, next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
