import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    @DisplayName("Should add 2 numbs")
    void additionner() {
        assertEquals(4,MathUtils.additionner(2,2));
    }

    @Test
    @DisplayName("Should multiply two numbers")
    void multiplier(){
        assertEquals(16,MathUtils.multiplier(4,4));
        assertEquals(12,MathUtils.multiplier(3,4));
        assertEquals(-6,MathUtils.multiplier(2,-3));
    }

    @Test
    @DisplayName("Should substract two numbers")
    void soustraire(){
        assertEquals(1,MathUtils.soustraire(4,3));
        assertEquals(-3,MathUtils.soustraire(-6,-3));
        assertEquals(9,MathUtils.soustraire(18,9));
    }

    @Test
    void addtable() {
        int [] tableau = {1,2,3};
        assertEquals(6,MathUtils.Addtable(tableau));
    }
}