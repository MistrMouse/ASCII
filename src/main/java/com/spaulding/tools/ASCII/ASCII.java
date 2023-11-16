package com.spaulding.tools.ASCII;

public class ASCII {
    public static final int BOTTOM_PRINTABLE_INT = 32, TOP_PRINTABLE_INT = 126;
    public static final int PRINTABLE_ROLLOVER_RANGE = TOP_PRINTABLE_INT - BOTTOM_PRINTABLE_INT + 1;

    public static boolean isPrintable(char c) {
        return c >= BOTTOM_PRINTABLE_INT && c <= TOP_PRINTABLE_INT;
    }

    public static boolean isPrintable(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!isPrintable(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char getRandomPrintable() {
        return (char) ((int) Math.floor(Math.random() * PRINTABLE_ROLLOVER_RANGE) + BOTTOM_PRINTABLE_INT);
    }
}