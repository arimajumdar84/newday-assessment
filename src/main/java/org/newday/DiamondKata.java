package org.newday;

public class DiamondKata {

    public String printDiamondPattern(char midpoint) {
        if (!Character.isLetter(midpoint)) {
            throw new IllegalArgumentException("Input must be a letter");
        }
        StringBuilder diamond = new StringBuilder();
        if ('A' == midpoint){
            return diamond.append(midpoint).append("\n").toString();
        }
        return "";
    }

}
