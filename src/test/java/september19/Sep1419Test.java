package september19;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Sep1419Test {

    @Test
     public void testDaily() {
        Sep1419 daily = new Sep1419();
        int[] solution = daily.solve(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{120, 60, 40, 30, 24}, solution);
        solution = daily.solve(new int[]{3, 2, 1});
        assertArrayEquals(new int[]{2, 3, 6}, solution);

        solution = daily.solveNoDivision(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{120, 60, 40, 30, 24}, solution);

        solution = daily.solveNoDivision(new int[]{3, 2, 1});
        assertArrayEquals(new int[]{2, 3, 6}, solution);
    }
}
