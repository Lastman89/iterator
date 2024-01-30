package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();

    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public java.util.Iterator<Integer> iterator() {
        Iterator<Integer> it = new Iterator<Integer>() {
            private int randomNum = random.nextInt(max - min + 1) + min;

            @Override
            public boolean hasNext() {
                return randomNum < max;
            }

            @Override
            public Integer next() {
                return randomNum = random.nextInt(max - min + 1) + min;
            }

        };
        return it;
    }

}
