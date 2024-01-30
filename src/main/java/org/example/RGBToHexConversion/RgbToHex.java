package org.example.RGBToHexConversion;

public class RgbToHex {
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 255;

    public static String rgb(int r, int g, int b) {
        r = (r < MIN_VALUE) ? MIN_VALUE : (r > MAX_VALUE) ? MAX_VALUE : r;
        g = (g < MIN_VALUE) ? MIN_VALUE : (g > MAX_VALUE) ? MAX_VALUE : g;
        b = (b < MIN_VALUE) ? MIN_VALUE : (b > MAX_VALUE) ? MAX_VALUE : b;

        return String.format("%02X%02X%02X", r, g, b);
    }
}
