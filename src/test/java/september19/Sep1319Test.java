package september19;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

class Sep1319Test {

    @Test
    public void testDailyProblem() {
        Sep1319 dailyProblem = new Sep1319();
        assertTrue(dailyProblem.solve(new int[]{10, 15, 3, 7}, 17));
    }
}