package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {


	public static final int RAND_UPPER_BOUND = 20;
	public static final int HANOI_RHYMER_IDX = 3;
	public static final int TEST_VAL = 15;

	public static void main(String[] args) {
		RhymersFactory factory = new DefaultRhymersFactory();
		
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (int i = 1; i < TEST_VAL; i++)
			for (int j = 0; j < rhymers.length - 1; j++)
				rhymers[j].countIn(i);
		
		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < TEST_VAL; i++)
			rhymers[HANOI_RHYMER_IDX].countIn(rn.nextInt(RAND_UPPER_BOUND));
		
		for (int i = 0; i < rhymers.length; i++) {
			while (!rhymers[i].callCheck())
				System.out.print(rhymers[i].countOut() + "  ");
			System.out.println();
		}
		
		System.out.println("total rejected is "
				+ ((HanoiRhymer) rhymers[HANOI_RHYMER_IDX]).reportRejected());
		
	}
	

}