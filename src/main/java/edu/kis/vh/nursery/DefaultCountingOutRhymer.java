package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_ARRAY_SIZE = 12;
    public static final int PEEKABOO_START_VAL = -1;
    public static final int EMPTY_ARRAY_ERROR_VAL = -1;
    public int total = -1;
    private final int[] NUMBERS = new int[NUMBERS_ARRAY_SIZE];

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == PEEKABOO_START_VAL;
    }

    public boolean isFull() {
        return total == NUMBERS_ARRAY_SIZE - 1;
    }

    protected int peekABoo() {
        if (callCheck())
            return EMPTY_ARRAY_ERROR_VAL;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_ARRAY_ERROR_VAL;
        return NUMBERS[total--];
    }

}
