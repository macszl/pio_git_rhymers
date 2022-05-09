package edu.kis.vh.nursery.list;

class IntLinkedList {


    public static final int ERROR_RETURN_VAL = -1;
    private Node last;
    int i;

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

    public int top() {
        if (isEmpty())
            return ERROR_RETURN_VAL;
        return last.value;
    }

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
