package com.example.demo.override;

import java.util.HashSet;
import java.util.Set;

public class GoodBigram {
    private final char first;
    private final char second;

    public GoodBigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GoodBigram)) {
            return false;
        }
        GoodBigram b = (GoodBigram) o;
        return b.first == this.first && b.second == this.second;
    }
    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<GoodBigram> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s.add(new GoodBigram(ch, ch));
            }
        }

        System.out.println(s.size());
    }
}
