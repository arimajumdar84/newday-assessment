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
    void should_create_diamond_with_inputA() {
        String expected = "A\n";
        assertThat(expected).isEqualTo(diamondKata.printDiamondPattern('A'));
    }


}
