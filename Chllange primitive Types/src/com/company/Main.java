package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
	byte ByteValue = 10;
	short ShortValue =4;
	int IntValue =3;
	long LongValue =50000 + 10*(ByteValue+ShortValue+IntValue);
        System.out.println("The value for the sum is " + LongValue);
    }
}
