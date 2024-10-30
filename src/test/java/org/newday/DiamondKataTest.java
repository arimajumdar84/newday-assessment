package org.newday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class DiamondKataTest {

    private DiamondKata diamondKata;

    @BeforeEach
    void setup(){
        diamondKata = new DiamondKata();
    }

    @Test
    void should_throw_exception_for_invalid_inputs(){
        assertThatThrownBy(() -> diamondKata.printDiamondPattern('1')).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    void should_throw_exception_with_valid_message_for_invalid_inputs(){
        assertThatThrownBy(() -> diamondKata.printDiamondPattern('1'))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Input must be a letter");
    }
    @Test
    void should_create_diamond_with_inputA() {
        String expected = "A\n";
        assertThat(expected).isEqualTo(diamondKata.printDiamondPattern('A'));
    }
    @Test
    void should_create_diamond_with_inputB() {
        diamondKata = new DiamondKata();
        String expected =
                """
                         A\s
                        B B
                         A\s
                        """;
        assertThat(expected).isEqualTo(diamondKata.printDiamondPattern('B'));
    }
    @Test
    void should_create_diamond_with_inputb_withLowerCase() {
        diamondKata = new DiamondKata();
        String expected =
                """
                         A\s
                        B B
                         A\s
                        """;
        assertThat(expected).isEqualTo(diamondKata.printDiamondPattern('b'));
    }
    @Test
    void should_create_diamond_with_inputC() {
        diamondKata = new DiamondKata();
        String expected =
                """
                          A \s
                         B B\s
                        C   C
                         B B\s
                          A \s
                        """;
        assertThat(expected).isEqualTo(diamondKata.printDiamondPattern('C'));
    }

}
