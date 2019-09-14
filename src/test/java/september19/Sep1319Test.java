package september19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sep1319Test {

    @Test
    void testDailyProblem() {
        Sep1319 dailyProblem = new Sep1319();
        assertTrue(dailyProblem.solve(new int[]{10, 15, 3, 7}, 17));
    }
}