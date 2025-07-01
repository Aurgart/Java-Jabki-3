import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaJabki3Test {
    // Задание 1
    @Test
    public void sumRangeTest(){
        Assertions.assertEquals(5, Main.sumRange(new int[] {1, 2, 3}) );
        Assertions.assertEquals(6, Main.sumRange(new int[] {1, 2, 3}) );
        Assertions.assertNotNull(Main.sumRange(new int[] {}) );
    }
    // Задание 2
    @Test
    public void addIntTest(){
        Assertions.assertEquals(9, Main.add(4, 5) );
        Assertions.assertEquals(100, Main.add(45, 60) );
        Assertions.assertEquals(0, Main.add(0, 0) );
    }
    @Test
    public void addStringTest(){
        Assertions.assertEquals("Hello World", Main.add("Hello  ", "World") );
        Assertions.assertEquals("Hello World", Main.add("Go to  ", "Hell") );
        Assertions.assertEquals("", Main.add("", "") );
    }
    // Задание 3
    @Test
    public void findMaxTest(){
        Assertions.assertEquals(3, Main.findMax(new int[] {1, 2, 3}) );
        Assertions.assertEquals(99, Main.sumRange(new int[] {12, -2, 3, 4, 99, -220}) );
        Assertions.assertNotNull(Main.findMax(new int[] {}) );
    }
    // Задание 4
    @Test
    public void factorialTest(){
        Assertions.assertEquals(24, Main.factorial(4) );
        Assertions.assertEquals(24, Main.factorial(-4) );
    }
    // Задание 5
    @Test
    public void figureAreaTestCircle(){
        Assertions.assertEquals(0.06, Main.figureArea(0.14) );
        // провалится из-за учета округления, в двух знаках это надо учитывать.
        Assertions.assertEquals(12.56, Main.figureArea(2) );
    }
    @Test
    public void figureAreaTestSquare(){
        Assertions.assertEquals(20, Main.figureArea(4, 5) );
        Assertions.assertEquals(24, Main.figureArea(-4, 6) );
    }
    // Задание 6
    @Test
    public void averageOfThreeNumbersTest(){
        Assertions.assertEquals(2.5,Main.averageOfThreeNumbers(new double[]{2.5, 4, 1}));
        // провалится, так как внутри проверка на 3 числа.
        Assertions.assertEquals(2.5,Main.averageOfThreeNumbers(new double[]{2.5, 4, 3, 0.5}));
    }
    // Задание 7
    @Test
    public void getHypotenuseTest(){
        Assertions.assertEquals(3.62, Main.getHypotenuse(1.5, 3.3));
        Assertions.assertEquals(2.3, Main.getHypotenuse(-1, 9));
    }
}