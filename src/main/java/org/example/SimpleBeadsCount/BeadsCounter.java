package org.example.SimpleBeadsCount;

public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
        return nBlue > 2 ? 2 * (nBlue - 1) : 0;
    }
}
