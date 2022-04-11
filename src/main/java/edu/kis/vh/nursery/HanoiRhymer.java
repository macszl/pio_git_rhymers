package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0; // wiersz 5 był źle sformatowany

    public int reportRejected() {
        return totalRejected;
    }

    // wiersz 12 był źle sformatowany
    // wiersz 15 i 16 był źle sformatowany
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}

