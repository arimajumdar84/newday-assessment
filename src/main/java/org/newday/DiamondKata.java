package org.newday;

public class DiamondKata {

    public String printDiamondPattern(char midpoint) {
        validateInput(midpoint);

        int n = midpoint - 'A';

        StringBuilder diamond = new StringBuilder();

        generateAscendingLines(n, diamond);

        generateDescendingLines(n, diamond);

        return diamond.toString();
    }

    private static void generateDescendingLines(int n, StringBuilder diamond) {
        for (int i = n - 1; i >= 0; i--) {
            diamond.append(createRow(i, n)).append("\n");
        }
    }

    private static void generateAscendingLines(int n, StringBuilder diamond) {
        for (int i = 0; i <= n; i++) {
            diamond.append(createRow(i, n)).append("\n");
        }
    }

    private void validateInput(char midpoint) {
        if (!Character.isLetter(midpoint)) {
            throw new IllegalArgumentException("Input must be a letter");
        }
    }

    private static String createRow(int row, int maxRow) {
        StringBuilder line = new StringBuilder();
        char ch = (char) ('A' + row);

        line.append(" ".repeat(maxRow - row));

        line.append(ch);

        if (row > 0) {
            line.append(" ".repeat(2 * row - 1));
            line.append(ch); // Add the second character
        }

        line.append(" ".repeat(maxRow - row));

        return line.toString();
    }
}
