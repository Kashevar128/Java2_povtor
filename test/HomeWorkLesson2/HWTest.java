package HomeWorkLesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * {@link HW}
 *
 * @author vinogradov
 */
class HWTest {

    @Test
    public void testSize() {
        Assertions.assertThrows(
                MyArraySizeException.class,
                () -> {
                    HW.adder(new String[][]{});
                }
        );
    }

    @Test
    public void testData() {
        Assertions.assertThrows(
                MyArrayDataExeption.class,
                () -> {
                    HW.adder(new String[][]{
                            {"10", "10", "10", "10"},
                            {"10", "10", "10", "10"},
                            {"10", "10..", "10", "10"},
                            {"10", "10", "10", "10"}
                    });
                }
        );
    }

    @Test
    public void testSum() {
        Assertions.assertEquals(160, HW.adder(new String[][]{
                {"10", "10", "10", "10"},
                {"10", "10", "10", "10"},
                {"10", "10", "10", "10"},
                {"10", "10", "10", "10"}
        }));

    }

    @Test
    public void testSizeDif() {
        Assertions.assertThrows(
                MyArraySizeException.class,
                () -> {
                    HW.adder(new String[][]{
                            {"10", "10", "10", "10"},
                            {"10", "10", "10", "10"},
                            {"10", "10", "10"},
                            {"10", "10", "10", "10"}
                    });
                }
        );
    }

    @Test
    public void testSizeNPE() {
        Assertions.assertThrows(
                MyArraySizeException.class,
                () -> {
                    HW.adder(new String[][]{
                            {},
                            {},
                            {"10", "10", "10"},
                            {}
                    });
                }
        );
    }


}