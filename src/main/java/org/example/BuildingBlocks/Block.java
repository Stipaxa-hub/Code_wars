package org.example.BuildingBlocks;

import java.util.Arrays;

public class Block {
    int[] parameters;

    public Block(int[] parameters) {
        this.parameters = parameters;
    }

    public int getWidth() {
        return parameters[0];
    }

    public int getLength() {
        return parameters[1];
    }

    public int getHeight() {
        return parameters[2];
    }

    public int getVolume() {
        return Arrays.stream(parameters)
                .reduce(1, (a,b) -> a * b);
    }

    public int getSurfaceArea() {
        return 2 * (getLength() * getWidth() + getWidth() * getHeight() + getHeight() * getLength());
    }
}
