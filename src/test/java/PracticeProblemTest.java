import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;

class PracticeProblemTests {

    // --- 1. findValue() ---

    @Test
    @DisplayName("findValue: Value at the very beginning (Index 0)")
    void findValueTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int[].class };
            Method method = testClass.getDeclaredMethod("findValue", cArg);
            int[] arr = {100, 200, 300};
            assertEquals(0, (int) method.invoke(null, 100, arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("findValue: Value in the middle")
    void findValueTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int[].class };
            Method method = testClass.getDeclaredMethod("findValue", cArg);
            int[] arr = {1, 2, 3, 4, 5};
            assertEquals(2, (int) method.invoke(null, 3, arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("findValue: Value at the end")
    void findValueTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int[].class };
            Method method = testClass.getDeclaredMethod("findValue", cArg);
            int[] arr = {10, 20, 30};
            assertEquals(2, (int) method.invoke(null, 30, arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("findValue: Multiple occurrences (return first index)")
    void findValueTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int[].class };
            Method method = testClass.getDeclaredMethod("findValue", cArg);
            int[] arr = {5, 10, 5, 20, 5};
            assertEquals(0, (int) method.invoke(null, 5, arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("findValue: Not found / Empty array (return -1)")
    void findValueTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int[].class };
            Method method = testClass.getDeclaredMethod("findValue", cArg);
            assertEquals(-1, (int) method.invoke(null, 10, new int[]{}));
            assertEquals(-1, (int) method.invoke(null, 10, new int[]{1, 2, 3}));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // --- 2. findThirdValue() ---

    @Test
    @DisplayName("findThirdValue: Exactly three occurrences")
    void findThirdValueTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class, String[].class };
            Method method = testClass.getDeclaredMethod("findThirdValue", cArg);
            String[] arr = {"A", "B", "A", "C", "A"};
            assertEquals(4, (int) method.invoke(null, "A", (Object) arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("findThirdValue: More than three (return index of the 3rd)")
    void findThirdValueTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class, String[].class };
            Method method = testClass.getDeclaredMethod("findThirdValue", cArg);
            String[] arr = {"Z", "Z", "Z", "Z", "Z"};
            assertEquals(2, (int) method.invoke(null, "Z", (Object) arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("findThirdValue: Less than three occurrences (return -1)")
    void findThirdValueTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class, String[].class };
            Method method = testClass.getDeclaredMethod("findThirdValue", cArg);
            String[] arr = {"Apple", "Banana", "Apple"};
            assertEquals(-1, (int) method.invoke(null, "Apple", (Object) arr));
            assertEquals(-1, (int) method.invoke(null, "Banana", (Object) arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("findThirdValue: Empty array (return -1)")
    void findThirdValueTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class, String[].class };
            Method method = testClass.getDeclaredMethod("findThirdValue", cArg);
            assertEquals(-1, (int) method.invoke(null, "Test", (Object) new String[]{}));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // --- 3. removeAll() ---

    @Test
    @DisplayName("removeAll: Target in middle")
    void removeAllTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { char.class, char[].class };
            Method method = testClass.getDeclaredMethod("removeAll", cArg);
            char[] arr = {'a', 'b', 'c', 'b', 'd'};
            char[] expected = {'a', 'c', 'd'};
            assertArrayEquals(expected, (char[]) method.invoke(null, 'b', arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("removeAll: Target at start and end")
    void removeAllTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { char.class, char[].class };
            Method method = testClass.getDeclaredMethod("removeAll", cArg);
            char[] arr = {'x', 'y', 'z', 'x'};
            char[] expected = {'y', 'z'};
            assertArrayEquals(expected, (char[]) method.invoke(null, 'x', arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("removeAll: All elements match target")
    void removeAllTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { char.class, char[].class };
            Method method = testClass.getDeclaredMethod("removeAll", cArg);
            char[] arr = {'f', 'f', 'f'};
            char[] expected = {};
            assertArrayEquals(expected, (char[]) method.invoke(null, 'f', arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("removeAll: Empty array input")
    void removeAllTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { char.class, char[].class };
            Method method = testClass.getDeclaredMethod("removeAll", cArg);
            char[] arr = {};
            char[] expected = {};
            assertArrayEquals(expected, (char[]) method.invoke(null, 'a', arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // --- 4. append() ---

    @Test
    @DisplayName("append: Add to non-empty array")
    void appendTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { double.class, double[].class };
            Method method = testClass.getDeclaredMethod("append", cArg);
            double[] arr = {1.1, 2.2};
            double[] expected = {1.1, 2.2, 3.3};
            assertArrayEquals(expected, (double[]) method.invoke(null, 3.3, arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("append: Add to empty array")
    void appendTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { double.class, double[].class };
            Method method = testClass.getDeclaredMethod("append", cArg);
            double[] arr = {};
            double[] expected = {5.5};
            assertArrayEquals(expected, (double[]) method.invoke(null, 5.5, arr));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("append: Verify new array length and end value")
    void appendTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { double.class, double[].class };
            Method method = testClass.getDeclaredMethod("append", cArg);
            double[] arr = {0.0, -1.0, -2.0};
            double[] result = (double[]) method.invoke(null, -3.0, arr);
            assertEquals(4, result.length);
            assertEquals(-3.0, result[3], 0.0001);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }
}
